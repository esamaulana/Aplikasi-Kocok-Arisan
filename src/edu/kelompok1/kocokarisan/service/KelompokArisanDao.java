/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.service;

import edu.kelompok1.kocokarisan.entity.KelompokArisan;
import edu.kelompok1.kocokarisan.error.KelompokArisanException;

import java.util.List;


/**
 *
 * @author faldi
 */
public interface KelompokArisanDao {
    
    public void insertKelompokArisan(KelompokArisan kelompok) throws KelompokArisanException;
    public void updateKelompokArisan(KelompokArisan kelompok) throws KelompokArisanException;
    public void deleteKelompokArisan(Integer idKelompokArisan) throws KelompokArisanException;
    public KelompokArisan getById(Integer idKelompokArisan) throws KelompokArisanException;
    public List<KelompokArisan> selectAllKelompokArisan() throws KelompokArisanException;
    
}
