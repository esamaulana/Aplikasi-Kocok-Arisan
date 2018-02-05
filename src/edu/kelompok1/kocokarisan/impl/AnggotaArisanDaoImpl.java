/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.impl;

import edu.kelompok1.kocokarisan.entity.AnggotaArisan;
import edu.kelompok1.kocokarisan.error.AnggotaArisanException;
import edu.kelompok1.kocokarisan.service.AnggotaArisanDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faldi
 */
public class AnggotaArisanDaoImpl implements AnggotaArisanDao {

    private Connection connection;

    private final String insertAnggotaArisan = "INSERT INTO ANGGOTA_ARISAN "
            + "(NAMA_ANGGOTA,ALAMAT,IKUT_ARISAN) VALUES (?,?,?)";

    private final String updateAnggotaArisan = "UPDATE ANGGOTA_ARISAN SET "
            + "NAMA_ANGGOTA=?,ALAMAT=?,IKUT_ARISAN=? WHERE ID_ANGGOTA=?";

    private final String deleteAnggotaArisan = "DELETE FROM ANGGOTA_ARISAN"
            + " WHERE ID_ANGGOTA=?";

    private final String getById = "SELECT * FROM ANGGOTA_ARISAN"
            + " WHERE ID_ANGGOTA=?";

    private final String selectAll = "SELECT * FROM ANGGOTA_ARISAN";

    public AnggotaArisanDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertAnggotaArisan(AnggotaArisan anggota) throws AnggotaArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertAnggotaArisan);
            statement.setString(1, anggota.getNamaAnggotaArisan());
            statement.setString(2, anggota.getAlamat());
            statement.setInt(3, anggota.getIkutArisan());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AnggotaArisanException(e.getMessage());
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
    public void updateAnggotaArisan(AnggotaArisan anggota) throws AnggotaArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateAnggotaArisan);
            statement.setString(1, anggota.getNamaAnggotaArisan());
            statement.setString(2, anggota.getAlamat());
            statement.setInt(3, anggota.getIkutArisan());
            statement.setInt(4, anggota.getIdAnggotaArisan());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AnggotaArisanException(e.getMessage());
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
    public void deleteAnggotaArisan(Integer idAnggotaArisan) throws AnggotaArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteAnggotaArisan);
            statement.setInt(1, idAnggotaArisan);
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AnggotaArisanException(e.getMessage());
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
    public AnggotaArisan getById(Integer idAnggotaArisan) throws AnggotaArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idAnggotaArisan);

            ResultSet result = statement.executeQuery();
            AnggotaArisan anggota = null;

            if (result.next()) {
                anggota = new AnggotaArisan();
                anggota.setIdAnggotaArisan(result.getInt("ID_ANGGOTA"));
                anggota.setNamaAnggotaArisan(result.getString("NAMA_ANGGOTA"));
                anggota.setAlamat(result.getString("ALAMAT"));
                anggota.setIkutArisan(result.getInt("IKUT_ARISAN"));

            } else {
                throw new AnggotaArisanException("Admin dengan id " + idAnggotaArisan
                        + " Tidak ditemukan");
            }
            connection.commit();
            return anggota;
            
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AnggotaArisanException(e.getMessage());
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
    public List<AnggotaArisan> selectAllAdmin() throws AnggotaArisanException {
    Statement statement = null;
        List<AnggotaArisan> list = new ArrayList<AnggotaArisan>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            while (result.next()) {
                AnggotaArisan anggota = new AnggotaArisan();
                anggota.setIdAnggotaArisan(result.getInt("ID_ANGGOTA"));
                anggota.setNamaAnggotaArisan(result.getString("NAMA_ANGGOTA"));
                anggota.setAlamat(result.getString("ALAMAT"));
                anggota.setIkutArisan(result.getInt("IKUT_ARISAN"));
                list.add(anggota);
            }
            connection.commit();
            return list;
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new AnggotaArisanException(exception.getMessage());
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
