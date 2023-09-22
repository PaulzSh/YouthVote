package com.votez.mapper;

import com.votez.model.Registration;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistrationMapper {

    void register(Registration registration);
}
