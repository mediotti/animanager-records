package com.animanager.records.service;


import com.animanager.records.entities.AnimalInformationRecords;
import com.animanager.records.repositories.AnimalInformationRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class AnimalInformationRecordsService {

    @Autowired
    private AnimalInformationRecordsRepository animalInformationRecordsRepository;

    public List<AnimalInformationRecords> findAll(){return animalInformationRecordsRepository.findAll();}

    public AnimalInformationRecords findById(UUID id) throws NoSuchElementException {
        Optional<AnimalInformationRecords> result_obj = animalInformationRecordsRepository.findById(id);
        return result_obj.get();
    }

    public AnimalInformationRecords insert(AnimalInformationRecords obj){
        return animalInformationRecordsRepository.save(obj);
    }
}
