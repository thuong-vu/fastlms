package com.example.fastlms.member.controller;

import com.example.fastlms.member.entity.Member;
import com.example.fastlms.member.model.MemberInput;
import com.example.fastlms.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Controller
public class MemberController {

    //@Autowired
    private final MemberRepository memberRepository;

    public MemberController (MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //member/register
    @GetMapping("/member/register")
    //@RequestMapping(value = "/member/register", method = RequestMethod.GET)
    public String register(){
        System.out.println("request get");
        return "/member/register";
    }
    @PostMapping("/member/register")
    //@RequestMapping(value = "/member/register", method = RequestMethod.POST)
    public String registerSubmit(HttpServletRequest request, HttpServletResponse response, MemberInput parameter){
        System.out.println("request post");

        //MemberInput memberInput = new MemberInput();
        //memberInput.getUserID()

        //String userID = request.getParameter("userID");
        //String userName = request.getParameter("userName");
        //String password = request.getParameter("password");
        //String phone = request.getParameter("phone");

        //System.out.println("userID: " + userID);
        //System.out.println("username: " + userName);
        //System.out.println("password: " + password);
        //System.out.println("phone: " + phone);

        System.out.println(parameter.toString());
        Member member = new Member();
        member.setUserID(parameter.getUserID());
        member.setUserID(parameter.getEmail());
        member.setUserName(parameter.getUserName());
        member.setPhone(parameter.getPhone());
        member.setPassword(parameter.getPassword());
        member.setRegDt(LocalDateTime.now());
        memberRepository.save(member);

        return "/member/register_complete";
    }
}
