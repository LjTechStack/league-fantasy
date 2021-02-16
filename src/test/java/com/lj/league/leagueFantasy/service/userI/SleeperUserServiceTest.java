package com.lj.league.leagueFantasy.service.userI;

import com.lj.league.leagueFantasy.service.interfaces.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SleeperUserServiceTest {

    @Autowired
    UserService sleeperUserService;

    @Test
    void getUserData() {
        String expected = "getting user data from Sleeper";
        assertEquals(expected, sleeperUserService.getUserData("Sam"), "get User Data");
    }
}