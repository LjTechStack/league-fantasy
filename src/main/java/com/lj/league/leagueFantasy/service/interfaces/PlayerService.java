package com.lj.league.leagueFantasy.service.interfaces;

import org.springframework.stereotype.Service;

public interface PlayerService {

    String getPlayerData(String user);

    String getPlayers() throws NoSuchMethodException;
}
