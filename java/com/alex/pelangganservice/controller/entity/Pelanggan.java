/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alex.pelangganservice.controller.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author LABSIKOMP03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pelanggan {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pelangganId;
    private String nama;
    private String alamat;  
}