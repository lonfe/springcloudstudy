package com.lonfe.dao;

import com.lonfe.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

	List<User> findAll();
	User findOne(@Param("id") Integer id);

}
