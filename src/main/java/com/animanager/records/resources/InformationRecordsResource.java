package com.animanager.records.resources;

import com.animanager.records.entities.human.InformationRecords;
import com.animanager.records.service.InformationRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/animanager/records/human")
public class InformationRecordsResource {
    @Autowired
    private InformationRecordsService informationRecordsService;

    @GetMapping
    public ResponseEntity<List<InformationRecords>> findAll(){
        return ResponseEntity.ok().body(informationRecordsService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<InformationRecords> findById(@PathVariable UUID id){
        return ResponseEntity.ok().body(informationRecordsService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<InformationRecords> insert(@RequestBody InformationRecords obj){
        return ResponseEntity.ok().body(informationRecordsService.insert(obj));
    }

}
