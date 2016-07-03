package com.JGH.domain.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name, email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + 
                ", email='" + email + 
                '}';
    }
}