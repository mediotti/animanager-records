package com.animanager.records.resources;


import com.animanager.records.entities.animal.AnimalInformationRecords;
import com.animanager.records.service.AnimalInformationRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/animanager/records/animal")
public class AnimalInformationRecordsResource {
    @Autowired
    private AnimalInformationRecordsService animalInformationRecordsService;

    @GetMapping
    public ResponseEntity<List<AnimalInformationRecords>> findAll(){
        return ResponseEntity.ok().body(animalInformationRecordsService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AnimalInformationRecords> findById(@PathVariable UUID id){
        return ResponseEntity.ok().body(animalInformationRecordsService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<AnimalInformationRecords> insert(@RequestBody AnimalInformationRecords obj){
        return ResponseEntity.ok().body(animalInformationRecordsService.insert(obj));
    }
}
