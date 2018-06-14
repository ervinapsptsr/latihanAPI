package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Many;


import com.example.model.ApiModel;


@Mapper
public interface ApiMapper {
	
    //Untuk viewall
    @Select("select mode,limit, page, results from point_level ")
    @Results (value = {
    		@Result (property="nmode", column="mode"),
    		@Result (property="limit", column="limit"),
    		@Result (property="page", column="page"),
    		@Result (property="results", column="resultas", 
    		javaType = List.class, many= @Many(select= "selectApi"))
    })
    List<ApiModel> selectApi ();

}

