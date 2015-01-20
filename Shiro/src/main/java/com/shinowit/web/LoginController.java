package com.shinowit.web;

import com.shinowit.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2015/1/19.
 */
@Controller
public class LoginController {

    @RequestMapping(value="/logincheck")
    public String testlogin(@ModelAttribute SysUser user){

        UsernamePasswordToken loginToken=new UsernamePasswordToken(user.getLoginName(),user.getLoginPass());

        Subject subject=SecurityUtils.getSubject();


        try{
            subject.login(loginToken);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
        }

        return "redirect:/static/login.html";
    }

    @RequestMapping("/test1")
    @RequiresUser
    public String test1(){
        return "test1";
    }

    @RequestMapping("/test2")
    @RequiresPermissions("in_stock_menu")
    public String test2(){
        return "test2";
    }
}
