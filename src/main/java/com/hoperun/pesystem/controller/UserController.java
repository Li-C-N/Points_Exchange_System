package com.hoperun.pesystem.controller;

import com.hoperun.pesystem.dto.ResultDto;
import com.hoperun.pesystem.mapper.ExchangeMapper;
import com.hoperun.pesystem.model.Exchange;
import com.hoperun.pesystem.model.ExchangeExample;
import com.hoperun.pesystem.model.User;
import com.hoperun.pesystem.service.UserService;
import com.hoperun.pesystem.utils.TokenUtils;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService  userService;
    @Autowired
    private ExchangeMapper exchangeExample;
         @PostMapping("/personInfo")
         @ResponseBody
       public ResultDto<?> PersosnInfo( HttpServletRequest request)
        {
            String PhoneNumber = TokenUtils.getUserphonenumber( request.getHeader("token"));
            List<User> users =  userService.UserInfoByPhoneNumber(PhoneNumber);
            List<Exchange> exchanges = userService.UserInfoByUserId(users.get(0).getUserId());
            Map<String,Object> map = new HashMap<>();
            map.put("用户信息",users);
            map.put("商品兑换记录",exchanges);
            return ResultDto.okOf(map);
        }
    }

