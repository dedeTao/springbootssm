package com.twq.springbootssm.dao;


import com.twq.springbootssm.domain.User;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
