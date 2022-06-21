package net.mahtabalam.controllers;

import net.mahtabalam.entity.Stop;
import net.mahtabalam.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StopController {

    @Autowired
    StopService stopService;

    @GetMapping("/stop")
    private List<Stop> getAllStops()
    {
        return stopService.findAll();
    }
}