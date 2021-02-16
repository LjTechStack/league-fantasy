package com.lj.league.leagueFantasy.controller;

import com.lj.league.leagueFantasy.service.interfaces.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserControllerTest {
    @Autowired
    UserController userController;

    @MockBean
    @Qualifier("sleeperUserService")
    UserService sleeperUserService;

    @MockBean
    @Qualifier("riotUserService")
    UserService riotUserService;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getUserData() {

    }

    @Test
    void getUsersData() {
    }
}