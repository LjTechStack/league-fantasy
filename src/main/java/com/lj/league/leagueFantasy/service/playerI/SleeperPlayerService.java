package com.lj.league.leagueFantasy.service.playerI;

import com.lj.league.leagueFantasy.service.interfaces.PlayerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sleeperPlayerService")
public class SleeperPlayerService implements PlayerService {

    @Override
    public String getPlayerData(String user) {
        //TODO: get a player data from sleeper
        return "Got player data from Sleeper...";
    }

    @Override
    public String getPlayers() {
        //TODO: get players data from sleeper
        return "Get player data from Sleeper...";
    }
}
