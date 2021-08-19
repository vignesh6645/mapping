package com.example.mapping.controller;

import com.example.mapping.model.Worker;
import com.example.mapping.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/workers")
@RestController
public class WorkerController {
    @Autowired
    private WorkerRepository workerRepository;
    @PostMapping("/add")
    public ResponseEntity<String> saveWorker(@RequestBody List<Worker> workerData){
        workerRepository.saveAll(workerData);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping("/all")
    public List<Worker> getAll(){
        return workerRepository.findAll();
    }
}
