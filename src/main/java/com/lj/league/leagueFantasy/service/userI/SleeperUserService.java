package com.lj.league.leagueFantasy.service.userI;

import com.lj.league.leagueFantasy.service.interfaces.UserService;
import org.springframework.stereotype.Service;

@Service
public class SleeperUserService implements UserService {
    @Override
    public String getUserData(String user) {
        return "getting user data from Sleeper";
    }

}
