package com.example.fastlms.member.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Member {

    private String userID;

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Id
    public String getUserID() {
        return userID;
    }
    private String email;
    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;
}
