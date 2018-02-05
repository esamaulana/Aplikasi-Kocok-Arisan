/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.kelompok1.kocokarisan.impl.AdminDaoImpl;
import edu.kelompok1.kocokarisan.impl.AnggotaArisanDaoImpl;
import edu.kelompok1.kocokarisan.impl.KelompokArisanDaoImpl;
import edu.kelompok1.kocokarisan.service.AdminDao;
import edu.kelompok1.kocokarisan.service.AnggotaArisanDao;
import edu.kelompok1.kocokarisan.service.KelompokArisanDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Faldi
 */
public class ArisanYukDatabase {

    private static Connection connection;
    private static AdminDao adminDao;
    private static AnggotaArisanDao anggotaDao;
    private static KelompokArisanDao kelompokDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/arisanyuk");
            dataSource.setUser("root");
            dataSource.setPassword("");

            connection = dataSource.getConnection();
        }
        return connection;
    }

    public static AdminDao getAdminDao() throws SQLException {
        if (adminDao == null) {
            adminDao = new AdminDaoImpl(getConnection());
        }
        return adminDao;
    }

    public static AnggotaArisanDao getAnggotaDao() throws SQLException {
        if (anggotaDao == null) {
            anggotaDao = new AnggotaArisanDaoImpl(getConnection());
        }
        return anggotaDao;
    }

    public static KelompokArisanDao getKelompokDao() throws SQLException {
        if (kelompokDao == null) {
            kelompokDao = new KelompokArisanDaoImpl(getConnection());
        }
        return kelompokDao;
    }


}
