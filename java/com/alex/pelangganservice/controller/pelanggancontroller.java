/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.pelangganservice.controller;

import com.alex.pelanggan.service.entity.Pelanggan;
import com.alex.pelanggan.service.service.PelangganService;
import com.alex.pelangganservice.controller.entity.pelanggan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author LABSIKOMP03
 */
@RestController
@RequestMapping("/pelanggan")
public class pelanggancontroller {
    @Autowired
    private pelangganservice pelangganService;
    
    @PostMapping("/")
    public pelanggan savepelanggan(@RequestBody pelanggan pelanggan){
        return pelangganService.savepelanggan(pelanggan);
    }
    @GetMapping("/{id}")
    public Pelanggan findPelangganById(@PathVariable("id") Long pelangganId){
        return pelangganService.findPelangganById(pelangganId);
    }

    
}