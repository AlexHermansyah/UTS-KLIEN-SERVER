/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.pelangganservice;

import com.alex.pelanggan.service.entity.Pelanggan;
import com.alex.pelanggan.service.repository.PelangganRepository;
import com.alex.pelangganservice.controller.entity.pelanggan;
import com.alex.pelangganservice.controller.entity.repository.pelangganrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  LABSIKOMP03
 */
@Service
public class pelangganservice {
     @Autowired
    private pelangganrepository pelangganRepository;
    
    public pelanggan savePelanggan(pelanggan pelanggan){
        return pelangganrepository.save(pelanggan);
    }
    
    public pelanggan findPelangganById(Long pelangganId){
        return pelangganrepository.findByPelangganId(pelangganId);
    }
}
}
