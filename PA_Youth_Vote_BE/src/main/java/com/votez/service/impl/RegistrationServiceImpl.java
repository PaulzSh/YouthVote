package com.votez.service.impl;

import com.votez.mapper.RegistrationMapper;
import com.votez.model.Registration;
import com.votez.model.vo.RegistrationVo;
import com.votez.service.RegistrationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationMapper registrationMapper;

    @Override
    public void register(RegistrationVo vo) {
        Registration registration = new Registration();
        BeanUtils.copyProperties(vo,registration);
        System.out.println("test success");
        registrationMapper.register(registration);
    }

    @Override
    public RegistrationVo detail(Long id) {
        Registration registration =  registrationMapper.detail(id);
        RegistrationVo vo = new RegistrationVo();
        BeanUtils.copyProperties(registration,vo);
        return vo;
    }
}
