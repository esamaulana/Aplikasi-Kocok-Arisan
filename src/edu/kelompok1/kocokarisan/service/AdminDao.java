/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.service;

import edu.kelompok1.kocokarisan.entity.Admin;
import edu.kelompok1.kocokarisan.error.AdminException;

import java.util.List;


/**
 *
 * @author faldi
 */
public interface AdminDao {
    
    public void insertAdmin(Admin admin) throws AdminException;
    public void updateAdmin(Admin admin) throws AdminException;
    public void deleteAdmin(String email) throws AdminException;
    
    public Admin getAdminByUsername(String username) throws AdminException;
    public Admin getAdminByEmail(String email) throws AdminException;
    public List<Admin> selectAllAdmin() throws AdminException;
    
}
