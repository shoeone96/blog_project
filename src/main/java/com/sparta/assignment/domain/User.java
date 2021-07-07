package com.sparta.assignment.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class User extends Timestamped{

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long ID;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
}
