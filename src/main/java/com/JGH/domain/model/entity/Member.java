package com.JGH.domain.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Member {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "MEMBER_ID")
	private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ENTRY_DATE")
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Member{" +               
                " name='" + name + 
                ", email='" + email + 
                 "password=" + password +
                 "date=" + date +
                '}';
    }
}