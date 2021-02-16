package com.lj.league.leagueFantasy.service.playerI;

import com.lj.league.leagueFantasy.service.interfaces.PlayerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("riotPlayerService")
public class RiotPlayerService implements PlayerService {

    @Override
    public String getPlayerData(String user) {
        //TODO: get player data from riot
        return "Got player data from Riot";
    }

    @Override
    public String getPlayers() throws NoSuchMethodException {
        throw new NoSuchMethodException("This endpoint is currently not supported.");
    }
}
