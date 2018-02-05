/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.main;



import edu.kelompok1.kocokarisan.database.ArisanYukDatabase;
import edu.kelompok1.kocokarisan.entity.Admin;
import edu.kelompok1.kocokarisan.entity.AnggotaArisan;
import edu.kelompok1.kocokarisan.entity.KelompokArisan;
import edu.kelompok1.kocokarisan.error.AdminException;
import edu.kelompok1.kocokarisan.error.AnggotaArisanException;
import edu.kelompok1.kocokarisan.error.KelompokArisanException;
import edu.kelompok1.kocokarisan.service.AdminDao;
import edu.kelompok1.kocokarisan.service.AnggotaArisanDao;
import edu.kelompok1.kocokarisan.service.KelompokArisanDao;
import edu.kelompok1.kocokarisan.view.loginFrame;
import java.sql.SQLException;
import java.util.List;



/**
 *
 * @author Shorfana
 */
public class AplikasiKocokArisan {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.kelompok1.kocokarisan.error.AdminException
     * @throws edu.kelompok1.kocokarisan.error.AnggotaArisanException
     */
    public static void main(String[] args) throws SQLException, AdminException, AnggotaArisanException, KelompokArisanException {
        loginFrame arisan = new loginFrame();
        arisan.setVisible(true);
        
        
       
        
        
        
    }
}