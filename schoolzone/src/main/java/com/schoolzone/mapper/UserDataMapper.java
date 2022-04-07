package com.schoolzone.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.schoolzone.model.UserData;

@Mapper
public interface UserDataMapper {
	
	@Select("SELECT * FROM UserData WHERE id=#{id}")
	UserData getUserData(@Param("id") String id);
	
	@Insert("INSERT INTO UserData VALUES(#{id}, #{latitude}, #{longitude}, #{type})")
	int insertUserData(@Param("id") String id, @Param("latitude") double latitude, @Param("longitude") double longitude, @Param("type") int type);
	
	@Update("UPDATE UserData SET latitude=#{latitude}, longitude=#{longitude}, type=#{type}")
	int updateUserData(@Param("id") String id, @Param("latitude") double latitude, @Param("longitude") double longitude, @Param("type") int type);
	
	@Delete("DELETE FROM UserData WHERE id=#{id}")
	int deleteUserData(@Param("id") String id);
}
