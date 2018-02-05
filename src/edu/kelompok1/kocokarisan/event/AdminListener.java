/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.event;

import edu.kelompok1.kocokarisan.entity.Admin;
import edu.kelompok1.kocokarisan.model.AdminModel;

/**
 *
 * @author faldi
 */
public interface AdminListener {
    public void onChange(AdminModel model);
    public void onInsert(Admin admin);
    public void onDelete();
    public void onUpdate(Admin admin);

    
}
