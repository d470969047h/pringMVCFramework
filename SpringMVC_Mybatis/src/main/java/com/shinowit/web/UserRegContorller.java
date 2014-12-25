package com.shinowit.web;

import com.shinowit.tools.SendHtmlEmail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by daihui on 2014-12-25.
 */
@Controller
@RequestMapping("/user")
public class UserRegContorller {

    @Resource
    private SendHtmlEmail email;

    @RequestMapping("/reg")
    public void sendHtmlMail(@RequestParam("username")String username,@RequestParam("userpass")String userpass,@RequestParam("email")String email_addr,HttpServletRequest request){

        String valid_string =request.getSession(true).getId();

        String valid_url="<a href='http://localhost:8080/user/valid?username="+username+"&validString="+valid_string+"' target='_balnk'>点击我激活账号</a>";

        try {
            email.sendMessage(email_addr,"用户激活",valid_url);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/valid")
    public void sendHtmlMail(@RequestParam("username")String username,@RequestParam("validString")String valid_string){
        System.out.println("用户名："+username+"验证码："+valid_string
        );
    }
}
