package com.example.fastlms.member.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MemberInput {
    private String userID;
    private String userName;
    private String password;
    private String phone;


}
