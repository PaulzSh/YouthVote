package com.votez.mapper;

import com.votez.model.Registration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RegistrationMapper {

    void register(Registration registration);

    Registration detail(@Param("id")Long id);
}
