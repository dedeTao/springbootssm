package com.twq.springbootssm.dao;

import com.twq.springbootssm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {
    public User findByPhoneAndPassword(@Param("phone") String phone, @Param("password") String password);
}
