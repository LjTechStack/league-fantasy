package com.lj.league.leagueFantasy.controller;

import com.lj.league.leagueFantasy.service.interfaces.PlayerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@SpringBootTest
class PlayerControllerTest {
    @Autowired
    private PlayerController playerController;

    @MockBean
    @Qualifier("sleeperPlayerService")
    PlayerService sleeperPlayerService;
    @MockBean
    @Qualifier("riotPlayerService")
    PlayerService riotPlayerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getPlayerByNameTest() {
        String expected = "Sam";
        String actual = playerController.getPlayerByName("Sam");
        assertEquals(expected, actual, "GetPlayerByName");
    }

    @Test
    void getPlayerByIdTest() {
        String expected = "0";
        String actual = playerController.getPlayerById(0);
        assertEquals(expected, actual, "GetPlayerById");

    }

    @Test
    void refreshPlayersTest() throws NoSuchMethodException {
        playerController.refreshPlayers();
        verify(sleeperPlayerService).getPlayers();
    }
}