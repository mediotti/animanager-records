package com.animanager.records.service;

import com.animanager.records.entities.human.InformationRecords;
import com.animanager.records.repositories.InformationRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class InformationRecordsService {

    @Autowired
    private InformationRecordsRepository informationRecordsRepository;

    public List<InformationRecords> findAll(){
        return informationRecordsRepository.findAll();
    }

    public InformationRecords findById(UUID id) throws NoSuchElementException {
        Optional<InformationRecords> result_obj = informationRecordsRepository.findById(id);
            return result_obj.get();
    }

    public InformationRecords insert(InformationRecords obj){
        return informationRecordsRepository.save(obj);
    }
}
