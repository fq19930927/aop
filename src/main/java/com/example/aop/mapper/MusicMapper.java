package com.example.aop.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicMapper {

    @Insert("insert into music(musicName)values(\"Fuqiang\")")
    public void save();
}
