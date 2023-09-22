package com.votez.controller;

import com.votez.common.util.VerifyUtil;
import com.votez.model.RestResponse;
import com.votez.model.vo.RegistrationVo;
import com.votez.service.impl.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/voter/registration")
public class RegistrationController {

    @Autowired
    private RegistrationServiceImpl registrationService;

    @PostMapping("/submit")
    public RestResponse registerVoter(@RequestBody RegistrationVo vo) {
        try {
            StringBuilder msg = new StringBuilder();
            if (!verify(vo, msg)) {
                return new RestResponse("20000",msg.toString());
            }
            registrationService.register(vo);
        } catch (Exception e) {
            return new RestResponse("20100", "registration failed!");
        }
        return new RestResponse("200", "registration success!");
    }

    @GetMapping("/detail")
    public RestResponse registerDetail(Long id) {
        RegistrationVo vo = new RegistrationVo();
        try {
            vo = registrationService.detail(id);
        } catch (Exception e) {
            System.out.println("exception " + e);
        }
        return new RestResponse("200","",vo);
    }

    private boolean verify(RegistrationVo vo, StringBuilder msg) {
        if (StringUtils.isEmpty(vo.getEmail())) {
            msg.append("email could not be empty!");
            return false;
        } else if (!VerifyUtil.verifyEmail(vo.getEmail())) {
            msg.append("email invaild!");
            return false;
        }
        if (StringUtils.isEmpty(vo.getZipCode())) {
            msg.append("zip code could not be empty!");
            return false;
        } else if (!VerifyUtil.verifyZipCode(vo.getZipCode())) {
            msg.append("zip code invaild!");
            return false;
        }
        return true;
    }

}
