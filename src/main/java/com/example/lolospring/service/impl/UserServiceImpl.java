package com.example.lolospring.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lolospring.dao.UserRecordMapper;
import com.example.lolospring.entity.UserRecord;
import com.example.lolospring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserRecordMapper, UserRecord> implements IUserService {


    @Autowired
    UserRecordMapper userRecordMapper;

    @Override
    public void printUser(Integer uid) {
        System.out.println(userRecordMapper.selectById(uid));
    }
}
