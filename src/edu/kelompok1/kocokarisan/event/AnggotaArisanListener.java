/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.event;

import edu.kelompok1.kocokarisan.entity.AnggotaArisan;
import edu.kelompok1.kocokarisan.model.AnggotaArisanModel;

/**
 *
 * @author Sarif Hidayat
 */
public interface AnggotaArisanListener {
    
    public void onChange(AnggotaArisanModel model);
    public void onInsert(AnggotaArisan anggota);
    public void onDelete();
    public void onUpdate(AnggotaArisan anggota);
}
