package com.core.user.service;

import com.core.user.domain.User;
import com.core.user.reposiyory.UserRepository;
import com.core.util.MybeException;
import com.core.util.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User loadUserByAge(Integer id) throws Exception {
        User user = userRepository.findById(id);
        if(user.getAge() < 6){
            throw new MybeException(ResultEnum.ERROR_FIRST);
        }else if(user.getAge() < 12){
            throw new MybeException(ResultEnum.ERROR_SECOND);
        }else if(user.getAge() <16){
            throw new MybeException(ResultEnum.ERROR_THIRD);
        }else if(user.getAge() < 18){
            throw new MybeException(ResultEnum.ERROR_FOURTH);
        }else{
            return user;
        }
    }

}
