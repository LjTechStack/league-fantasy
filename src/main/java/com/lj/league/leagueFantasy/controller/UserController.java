package com.lj.league.leagueFantasy.controller;

import com.lj.league.leagueFantasy.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final String template = "Hello %s %s!";
    @Autowired
    @Qualifier("sleeperUserService")
    UserService sleeperUserService;
    @Autowired
    @Qualifier("sleeperUserService")
    UserService riotUserService;


    @GetMapping("/test")
    public String getUserData(@RequestParam(value = "names", defaultValue = "WOrld") String name) {
        String sleeperN = sleeperUserService.getUserData(name);
        String riotN = riotUserService.getUserData(name);
        return String.format(template, sleeperN, riotN);
    }

    @GetMapping("/tests")
    public String getUsersData(@RequestParam(value = "names", defaultValue = "WOrld") String name) {
        return String.format(template, name);
    }
}
