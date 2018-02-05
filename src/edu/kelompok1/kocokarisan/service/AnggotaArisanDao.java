/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.service;

import edu.kelompok1.kocokarisan.entity.AnggotaArisan;
import edu.kelompok1.kocokarisan.error.AnggotaArisanException;

import java.util.List;


/**
 *
 * @author faldi
 */
public interface AnggotaArisanDao {
    
    public void insertAnggotaArisan(AnggotaArisan anggota) throws AnggotaArisanException;
    public void updateAnggotaArisan(AnggotaArisan anggota) throws AnggotaArisanException;
    public void deleteAnggotaArisan(Integer idAnggotaArisan) throws AnggotaArisanException;
    public AnggotaArisan getById(Integer idAnggotaArisan) throws AnggotaArisanException;
    public List<AnggotaArisan> selectAllAdmin() throws AnggotaArisanException;
    
}
