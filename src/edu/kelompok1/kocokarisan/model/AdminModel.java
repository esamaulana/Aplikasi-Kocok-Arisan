/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.model;

import edu.kelompok1.kocokarisan.entity.Admin;
import edu.kelompok1.kocokarisan.database.ArisanYukDatabase;
import edu.kelompok1.kocokarisan.error.AdminException;
import edu.kelompok1.kocokarisan.event.AdminListener;
import edu.kelompok1.kocokarisan.service.AdminDao;
import java.sql.SQLException;

/**
 *
 * @author faldi
 */
public class AdminModel {

    private String username;
    private String email;
    private String password;

    private AdminListener listener;

    public AdminListener getListener() {
        return listener;
    }

    public void setListener(AdminListener listener) {
        this.listener = listener;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        fireOnChange();
    }

    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    protected void fireOnInsert(Admin admin) {
        if (listener != null) {
            listener.onInsert(admin);
        }
    }
    

    protected void fireOnUpdate(Admin admin) {
        if (listener != null) {
            listener.onUpdate(admin);
        }
    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    public void insertAdmin() throws SQLException, AdminException {
        AdminDao dao = ArisanYukDatabase.getAdminDao();
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setEmail(email);

        dao.insertAdmin(admin);
        fireOnInsert(admin);
    }

    public void updateAdmin() throws SQLException, AdminException {
        AdminDao dao = ArisanYukDatabase.getAdminDao();
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setEmail(email);

        dao.updateAdmin(admin);
        fireOnUpdate(admin);
    }
        
    public void deleteAdmin() throws SQLException, AdminException {
        AdminDao dao = ArisanYukDatabase.getAdminDao();
        dao.deleteAdmin(email);
        fireOnDelete();

    }

    public void resetAdmin() {
        setUsername("");
        setPassword("");
        setEmail("");
    }

}
