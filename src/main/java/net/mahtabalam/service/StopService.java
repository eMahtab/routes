package net.mahtabalam.service;

import net.mahtabalam.entity.Stop;
import net.mahtabalam.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StopService {

    @Autowired
    StopRepository stopRepository;

    public List<Stop> findAll() {
        List<Stop> stops = new ArrayList<>();
        stopRepository.findAll().forEach(stop -> stops.add(stop));
        return stops;
    }

    public Stop findStopId(int id) {
        return stopRepository.findById(id).get();
    }

    public void saveOrUpdate(Stop stop) {
        stopRepository.save(stop);
    }

    public void delete(int id) {
        stopRepository.deleteById(id);
    }
}
