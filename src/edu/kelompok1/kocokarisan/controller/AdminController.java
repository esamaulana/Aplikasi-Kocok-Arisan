/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.controller;

import edu.kelompok1.kocokarisan.model.AdminModel;
import edu.kelompok1.kocokarisan.view.registerFrame;
import edu.kelompok1.kocokarisan.view.menuFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author faldi
 */
public class AdminController {

    private AdminModel model;

    public void setModel(AdminModel model) {
        this.model = model;
    }

    public void resetAdmin(registerFrame view) {
        model.resetAdmin();
    }

    public void insertAdmin(registerFrame view) {

        String username = view.getTxtUsernameRegister().getText();
        String password = new String(view.getTxtPasswordRegister().getPassword());
        String email = view.getTxtEmailRegister().getText();

        if (username.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (password.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Password belum di Isi");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(view, "Email tidak valid");
        } else {
            model.setUsername(username);
            model.setPassword(password);
            model.setEmail(email);

            try {
                model.insertAdmin();
                JOptionPane.showMessageDialog(view, "Register Berhasil");
                model.resetAdmin();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan", e.getMessage()});

            }
        }
    }

    public void updateAdmin(menuFrame view) {

        String username = view.getTxtUsernameMenuFrame().getText();
        String email = view.getTxtEmailMenuFrame().getText();
        String password = new String(view.getTxtPasswordMenuFrame().getPassword());

        if (username.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Username tidak boleh kosong");
        } else if (username.length() > 255) {
            JOptionPane.showMessageDialog(view, "Username tidak boleh lebih dari 255");
        } else if (!email.contains("@") || !email.contains(".")) {
            JOptionPane.showMessageDialog(view, "Email tidak invalid");
        } else {
            model.setUsername(username);
            model.setEmail(email);
            model.setPassword(password);

            try {
                model.updateAdmin();
                JOptionPane.showMessageDialog(view, "Admin Berhasil Diubah");
                model.resetAdmin();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database", e.getMessage()});
            }
        }
    }

    public void deleteAdmin(menuFrame view) {
        if (JOptionPane.showConfirmDialog(view, "Anda yakin ingin menghapus?") == JOptionPane.OK_OPTION) {
            String email = view.getTxtEmailMenuFrame().getText();
            model.setEmail(email);

            try {
                model.deleteAdmin();
                JOptionPane.showMessageDialog(view, "Admin berhasil dihapus");
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database", e.getMessage()});
            }
        }
    }
}
