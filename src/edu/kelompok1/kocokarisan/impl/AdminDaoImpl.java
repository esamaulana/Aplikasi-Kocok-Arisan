/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.impl;

import edu.kelompok1.kocokarisan.entity.Admin;
import edu.kelompok1.kocokarisan.error.AdminException;
import edu.kelompok1.kocokarisan.service.AdminDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author faldi
 */
public class AdminDaoImpl implements AdminDao {

    private Connection connection;

    private final String insertAdmin = "INSERT INTO ADMIN "
            + "(USERNAME,PASSWORD,EMAIL) VALUES (?,?,?)";

    private final String updateAdmin = "UPDATE ADMIN SET USERNAME=?,"
            + "PASSWORD=? WHERE EMAIL=?";

    private final String deleteAdmin = "DELETE FROM ADMIN WHERE EMAIL=?";

    private final String getByUser = "SELECT * FROM ADMIN WHERE USERNAME=?";

    private final String getByEmail = "SELECT * FROM ADMIN WHERE EMAIL=?";

    private final String selectAll = "SELECT * FROM ADMIN";

    public AdminDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertAdmin(Admin admin) throws AdminException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertAdmin);
            statement.setString(1, admin.getUsername());
            statement.setString(2, admin.getPassword());
            statement.setString(3, admin.getEmail());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AdminException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }

    @Override
    public void updateAdmin(Admin admin) throws AdminException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateAdmin);
            statement.setString(1, admin.getUsername());
            statement.setString(2, admin.getPassword());
            statement.setString(3, admin.getEmail());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AdminException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }
    
    
    @Override
    public void deleteAdmin(String email) throws AdminException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteAdmin);
            statement.setString(1, email);
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AdminException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }

    @Override
    public Admin getAdminByUsername(String username) throws AdminException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByUser);
            statement.setString(1, username);

            ResultSet result = statement.executeQuery();
            Admin admin = null;

            if (result.next()) {
                admin = new Admin();
                admin.setUsername(result.getString("USERNAME"));
                admin.setPassword(result.getString("PASSWORD"));
                admin.setEmail(result.getString("EMAIL"));

            } else {
                throw new AdminException("Admin dengan username " + username
                        + " Tidak ditemukan");
            }
            connection.commit();
            return admin;
            
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AdminException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }

    @Override
    public Admin getAdminByEmail(String email) throws AdminException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByEmail);
            statement.setString(1, email);

            ResultSet result = statement.executeQuery();
            Admin admin = null;

            if (result.next()) {
                admin = new Admin();
                admin.setUsername(result.getString("USERNAME"));
                admin.setPassword(result.getString("PASSWORD"));
                admin.setEmail(result.getString("EMAIL"));

            } else {
                throw new AdminException("Admin dengan email " + email
                        + " Tidak ditemukan");
            }
            connection.commit();
            return admin;
            
        } catch (SQLException e) {
            try {
            connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AdminException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(false);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }

    @Override
    public List<Admin> selectAllAdmin() throws AdminException {
    Statement statement = null;
        List<Admin> list = new ArrayList<Admin>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            while (result.next()) {
                Admin admin = new Admin();
                admin.setUsername(result.getString("USERNAME"));
                admin.setPassword(result.getString("PASSWORD"));
                admin.setEmail(result.getString("EMAIL"));
                list.add(admin);
            }
            connection.commit();
            return list;
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AdminException(exception.getMessage());
        } finally {
            try {
                connection.setAutoCommit(false);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }
}
