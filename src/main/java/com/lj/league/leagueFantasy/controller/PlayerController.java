package com.lj.league.leagueFantasy.controller;

import com.lj.league.leagueFantasy.service.interfaces.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    private static final String template = "Hello %s %s!";
    @Autowired
    @Qualifier("riotPlayerService")
    PlayerService sleeperPlayerService;
    @Autowired
    @Qualifier("sleeperPlayerService")
    PlayerService riotPlayerService;

    @GetMapping("/getPlayer/{name}")
    public String getPlayerByName(@PathVariable("name") String name) {
//        TODO: get user data for either
//        String sleeperData = sleeperUserService.getUserData(name);
        //TODO: get account data from sleeper and riot?
        return name ;
    }
    @GetMapping("/getPlayer/{id}")
    public String getPlayerById(@PathVariable("id") int id) {
//        TODO: get user data for either
//        String sleeperData = sleeperUserService.getUserData(name);
        //TODO: get account data from sleeper and riot?
        return String.valueOf(id);
    }

    @GetMapping("refreshPlayers")
    public String refreshPlayers() throws NoSuchMethodException {
        //TODO: only for sleeper service,
        //TODO: get list of players and store in DB from sleeper.
        sleeperPlayerService.getPlayers();
        return "refreshingDB...";
    }
}
