package com.votez.mapper;


import com.votez.entity.Candidates;
import com.votez.entity.CandidatesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CandidatesMapper {
    long countByExample(CandidatesExample example);

    int deleteByExample(CandidatesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Candidates record);

    int insertSelective(Candidates record);

    List<Candidates> selectByExample(CandidatesExample example);

    Candidates selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Candidates record, @Param("example") CandidatesExample example);

    int updateByExample(@Param("record") Candidates record, @Param("example") CandidatesExample example);

    int updateByPrimaryKeySelective(Candidates record);

    int updateByPrimaryKey(Candidates record);
}