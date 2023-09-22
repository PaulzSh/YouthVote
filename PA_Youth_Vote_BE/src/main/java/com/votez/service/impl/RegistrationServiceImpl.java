package com.votez.service.impl;

import com.votez.mapper.RegistrationMapper;
import com.votez.model.Registration;
import com.votez.model.vo.RegistrationVo;
import com.votez.service.RegistrationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    private RegistrationMapper registrationMapper;

    @Transactional
    @Override
    public void register(RegistrationVo vo) {
        Registration registration = new Registration();
        BeanUtils.copyProperties(vo,registration);
        System.out.println("test success");
//        registrationMapper.register(registration);
    }
}
