package com.votez.mapper;

import com.votez.model.Candidates;
import com.votez.model.CandidatesExample;

import java.util.List;

public interface CandidatesMapper {
    long countByExample(CandidatesExample example);

    int deleteByExample(CandidatesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Candidates record);

    int insertSelective(Candidates record);

    List<Candidates> selectByExample(CandidatesExample example);

    Candidates selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Candidates record);

    int updateByPrimaryKey(Candidates record);
}