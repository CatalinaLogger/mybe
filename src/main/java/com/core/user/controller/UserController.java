package com.core.user.controller;

import com.core.user.reposiyory.UserRepository;
import com.core.user.domain.User;
import com.core.user.service.UserService;
import com.core.util.Result;
import com.core.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @RequestMapping("/listUser")
    public List<User> listUser(){
        return userRepository.findAll();
    }

    @RequestMapping("/saveUser")
    public User saveUser(@RequestParam("name") String name,
                         @RequestParam("sex") String sex ){
        User user =new User();
        user.setName(name);
        user.setSex(sex);
        user.setBrithDay(new Date());
        return userRepository.save(user);
    }

    @RequestMapping("/loadUser/{id}")
    public User loadUser(@PathVariable("id") Integer id){
        return userRepository.findOne(id);
    }

    @RequestMapping("/editUser")
    public Result<User> editUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(userRepository.save(user));
    }

    @GetMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userRepository.delete(id);
    }

    @GetMapping("/listUserBySex/{sex}")
    public List<User> listUserBySex(@PathVariable("sex") String sex){
        return userRepository.findBySex(sex);
    }

    @RequestMapping("/loadUserById/{id}")
    public User loadUserById(@PathVariable("id") Integer id) throws Exception {
        return userService.loadUserByAge(id);
    }
}
