package com.lj.league.leagueFantasy.service.userI;

import com.lj.league.leagueFantasy.service.interfaces.UserService;
import org.springframework.stereotype.Service;

@Service
public class RiotUserService implements UserService {
    @Override
    public String getUserData(String user) {
        //TODO: I guess main account? Summoner data :check:
//        Summoner summoner = Orianna.summonerNamed(user).withRegion(Region.NORTH_AMERICA).get();
//        if (summoner.exists()) {
//            TODO: add summoner data into Player
//        } else {
        //TODO: return error message about user not existing
//        }
        return "getting user data from Riot";
    }

}
