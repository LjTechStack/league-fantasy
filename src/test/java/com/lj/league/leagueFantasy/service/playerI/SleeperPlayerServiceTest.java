package com.lj.league.leagueFantasy.service.playerI;

import com.lj.league.leagueFantasy.service.interfaces.PlayerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SleeperPlayerServiceTest {

    @Autowired
    PlayerService sleeperPlayerService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPlayerDataTest() {
        String expected = "Got player data from Sleeper...";

        assertEquals(expected, sleeperPlayerService.getPlayerData("Sam"), "player Data was incorrect.");

        sleeperPlayerService.getPlayerData("Sam");
    }

    @Test
    void getPlayersTest() throws NoSuchMethodException {
        String expected = "Get player data from Sleeper...";

        assertEquals(expected, sleeperPlayerService.getPlayers(), "getPlayers");
    }
}