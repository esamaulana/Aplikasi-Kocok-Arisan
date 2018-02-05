/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.event;

import edu.kelompok1.kocokarisan.entity.KelompokArisan;
import edu.kelompok1.kocokarisan.model.KelompokArisanModel;

/**
 *
 * @author faldi
 */
public interface KelompokArisanListener {
    public void onChange(KelompokArisanModel model);
    public void onInsert(KelompokArisan kelompok);
    public void onDelete();
    public void onUpdate(KelompokArisan kelompok);
    
}
