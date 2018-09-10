package com.remcarpediem.groovyengine.dao;

import com.remcarpediem.groovyengine.entity.GroovyEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroovyMapper {
    @Insert("INSERT INTO GROOVY(name,description,status,content) " +
            "VALUES (#{name}, #{description}, #{status}, #{content})")
    void insertGroovy(GroovyEntity groovyEntity);


    @Insert("SELECT * FROM GROOVY WHERE id = #{id}")
    GroovyEntity queryGroovy(Long id);
}
