package com.votez.service.impl;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.votez.common.config.SnowflakeConfig;
import com.votez.model.vo.RegistrationVo;
import com.votez.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RegistrationServiceImpl implements RegistrationService {


    @Autowired
    private DynamoDB dynamoDB;

    @Autowired
    private SnowflakeConfig snowflakeConfig;

    // 指定要操作的表名
    String tableName = "registration";


    @Override
    public void register(RegistrationVo vo) throws Exception {
//        Registration registration = new Registration();
//        BeanUtils.copyProperties(vo,registration);
//        System.out.println("test success");
//        registrationMapper.register(registration);
        // 获取表的引用
        Table table = dynamoDB.getTable(tableName);

        // 插入项目
        Item item = new Item()
                .withPrimaryKey("id", snowflakeConfig.snowflakeManager().nextValue())
                .withInt("sex", Objects.nonNull(vo.getSex()) ? vo.getSex() : 0)
                .withString("email", Objects.nonNull(vo.getEmail()) ? vo.getEmail() : "")
                .withString("zipCode", Objects.nonNull(vo.getZipCode()) ? vo.getZipCode() : "")
                .withString("name", Objects.nonNull(vo.getName()) ? vo.getName() : "")
                .withString("firstName", Objects.nonNull(vo.getFirstName()) ? vo.getFirstName() : "")
                .withString("lastName", Objects.nonNull(vo.getLastName()) ? vo.getLastName() : "")
                .withString("address", Objects.nonNull(vo.getAddress()) ? vo.getAddress() : "")
                .withString("city", Objects.nonNull(vo.getCity()) ? vo.getCity() : "")
                .withString("state", Objects.nonNull(vo.getState()) ? vo.getState() : "")
                .withString("birthDay", Objects.nonNull(vo.getBirthDay()) ? vo.getBirthDay().toString() : "")
                .withString("mobile", Objects.nonNull(vo.getMobile()) ? vo.getMobile() : "")
                .withString("status", Objects.nonNull(vo.getStatus()) ? vo.getStatus() : "");
        table.putItem(item);
    }

    @Override
    public String detail(Long id) {
//        Registration registration =  registrationMapper.detail(id);
//        RegistrationVo vo = new RegistrationVo();
//        BeanUtils.copyProperties(registration,vo);
        // 获取表的引用
        Table table = dynamoDB.getTable(tableName);
        Item item = table.getItem("id", id);
        return Objects.nonNull(item) ? item.toJSONPretty() : "";
    }
}
