package com.example.aop.dao;

import com.example.aop.anno.Fuqiang;
import com.example.aop.mapper.MusicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;

@Component
@Fuqiang
public class IndexDao implements Dao{
    @Resource
    MusicMapper musicMapper;
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public void query(){
        namedParameterJdbcTemplate.update("insert into music(musicName)values(\"Fuqiang2\")",new HashMap(){});
        System.out.println(1/0);
    }

    @FuqiangTest
    public void query1(String ss) {
        System.out.println(ss+"yyyyy");
    }
}
