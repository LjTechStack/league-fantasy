package com.lj.league.leagueFantasy.service.playerI;

import com.lj.league.leagueFantasy.service.interfaces.PlayerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RiotPlayerServiceTest {

    @Autowired
    PlayerService riotPlayerService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test get player data")
    void getPlayerDataTest() {
        assertEquals("Got player data from Riot", riotPlayerService.getPlayerData("Sam"), "player Data was incorrect.");
    }

    @Test
    @DisplayName("Test get players data, Should not be defined")
    void getPlayersTest() {
        assertThrows(NoSuchMethodException.class, () -> riotPlayerService.getPlayers());
    }
}