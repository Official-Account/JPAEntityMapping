package com.mapping.OneToOne.service;

import com.mapping.OneToOne.dto.Laptop;
import com.mapping.OneToOne.ropository.LaptopRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public  void  save(Laptop laptop){
        repo.save(laptop);
    }

    public  Laptop get(Long laptopId){
        return repo.findById(laptopId).get();
    }

    public List<Laptop> listAll(){
        return  repo.findAll();
    }

    public  void delete(Long laptopId){
        repo.deleteById(laptopId);
    }
}
