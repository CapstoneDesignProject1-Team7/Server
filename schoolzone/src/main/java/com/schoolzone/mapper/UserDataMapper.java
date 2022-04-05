package com.schoolzone.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.schoolzone.model.UserData;

@Mapper
public interface UserDataMapper {
	
	@Select("SELECT * FROM UserData WHERE id=${id}")
	UserData getUserData(@Param("id") String id);
	
	
}
