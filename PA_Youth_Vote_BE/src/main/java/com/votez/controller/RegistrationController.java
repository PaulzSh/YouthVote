package com.votez.controller;

import com.votez.common.util.VerifyUtil;
import com.votez.model.RestResponse;
import com.votez.model.vo.RegistrationVo;
import com.votez.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/voter/registration")
public class RegistrationController {

    @Resource
    private RegistrationService registrationService;

    @PostMapping("/submit")
    public RestResponse registerVoter(@RequestBody RegistrationVo vo) {
        try {
            String msg = "";
//            if (!verify(vo, msg)) {
//                return new RestResponse("20000",msg);
//            }
            registrationService.register(vo);
        } catch (Exception e) {
            System.out.println("exception " + e);
        }
        return new RestResponse("200", "registration success!");
    }

    private boolean verify(RegistrationVo vo, String msg) {
        if (StringUtils.isEmpty(vo.getEmail())) {
            msg = "email could not be empty";
            return false;
        } else if (!VerifyUtil.verifyEmail(vo.getEmail())) {
            msg = "email invaild!";
            return false;
        }

        if (StringUtils.isEmpty(vo.getZipCode())) {
            msg = "zip code could not be empty";
            return false;
        } else if (!VerifyUtil.verifyEmail(vo.getZipCode())) {
            msg = "zip code invaild!";
            return false;
        }
        return true;
    }

}
