/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alex.pelangganservice.controller.entity.repository;

import com.alex.pelanggan.service.entity.Pelanggan;
import org.springframework.data.jpa.repository.Jparepository;
import org.springframework.stereotype.repository;

/**
 *
 * @author LABSIKOMP03
 */
@repository
public interface Pelangganrepository extends Jparepository<Pelanggan, Long> {
    public Pelanggan findByPelangganId(Long pelangganId);

    public Pelanggan save(Pelanggan pelanggan);
}