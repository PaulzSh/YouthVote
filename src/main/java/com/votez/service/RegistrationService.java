package com.votez.service;

import com.votez.model.vo.RegistrationVo;
import org.springframework.stereotype.Service;

public interface RegistrationService {

    void register(RegistrationVo vo) throws Exception;

    String detail(Long id);
}
