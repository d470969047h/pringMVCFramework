package com.shinowit.web;

import com.shinowit.tools.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by daihui on 2014-12-25.
 */
@Controller
@RequestMapping("/email")
public class EmailController {

    @Resource
    private Email email;

    @RequestMapping("/sendmail")
    public void sendMail(@RequestParam("recv_address")String recv_address,@RequestParam("email_title")String email_title,@RequestParam("email_content") String email_content){

        email.sendMail(email_title,email_content,recv_address);

    }
}
