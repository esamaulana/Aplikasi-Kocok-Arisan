/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.impl;

import edu.kelompok1.kocokarisan.entity.KelompokArisan;
import edu.kelompok1.kocokarisan.error.KelompokArisanException;
import edu.kelompok1.kocokarisan.service.KelompokArisanDao;

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
public class KelompokArisanDaoImpl implements KelompokArisanDao {

    private Connection connection;

    private final String insertKelompokArisan = "INSERT INTO KELOMPOK_ARISAN "
            + "(NAMA_KELOMPOK,TANGGAL_MULAI_ARISAN,JUMLAH_ANGGOTA,JUMLAH_SETORAN) "
            + "VALUES (?,?,?,?)";

    private final String updateKelompokArisan = "UPDATE KELOMPOK_ARISAN SET "
            + "NAMA_KELOMPOK=?,TANGGAL_MULAI_ARISAN=?,JUMLAH_ANGGOTA=?,"
            + "JUMLAH_SETORAN=? WHERE ID_KELOMPOK=?";

    private final String deleteKelompokArisan = "DELETE FROM KELOMPOK_ARISAN"
            + " WHERE ID_KELOMPOK=?";

    private final String getById = "SELECT * FROM KELOMPOK_ARISAN"
            + " WHERE ID_KELOMPOK=?";

    private final String selectAll = "SELECT * FROM KELOMPOK_ARISAN";

    public KelompokArisanDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertKelompokArisan(KelompokArisan kelompok) throws KelompokArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertKelompokArisan);
            statement.setString(1, kelompok.getNamaKelompokArisan());
            statement.setString(2, kelompok.getTanggalMulaiArisan());
            statement.setInt(3, kelompok.getJumlahAnggota());
            statement.setInt(4, kelompok.getJumlahSetoran());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KelompokArisanException(e.getMessage());
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
    public void updateKelompokArisan(KelompokArisan kelompok) throws KelompokArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updateKelompokArisan);
            statement.setString(1, kelompok.getNamaKelompokArisan());
            statement.setString(2, kelompok.getTanggalMulaiArisan());
            statement.setInt(3, kelompok.getJumlahAnggota());
            statement.setInt(4, kelompok.getJumlahSetoran());
            statement.setInt(5, kelompok.getIdKelompokArisan());
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KelompokArisanException(e.getMessage());
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
    public void deleteKelompokArisan(Integer idKelompokArisan) throws KelompokArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deleteKelompokArisan);
            statement.setInt(1, idKelompokArisan);
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KelompokArisanException(e.getMessage());
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
    public KelompokArisan getById(Integer idKelompokArisan) throws KelompokArisanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idKelompokArisan);

            ResultSet result = statement.executeQuery();
            KelompokArisan kelompok = null;

            if (result.next()) {
                kelompok = new KelompokArisan();
                kelompok.setIdKelompokArisan(result.getInt("ID_KELOMPOK"));
                kelompok.setNamaKelompokArisan(result.getString("NAMA_KELOMPOK"));
                kelompok.setTanggalMulaiArisan(result.getString("TANGGAL_MULAI_ARISAN"));
                kelompok.setJumlahAnggota(result.getInt("JUMLAH_ANGGOTA"));
                kelompok.setJumlahSetoran(result.getInt("JUMLAH_SETORAN"));

            } else {
                throw new KelompokArisanException("Admin dengan id " + idKelompokArisan
                        + " Tidak ditemukan");
            }
            connection.commit();
            return kelompok;
            
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KelompokArisanException(e.getMessage());
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
    public List<KelompokArisan> selectAllKelompokArisan() throws KelompokArisanException {
    Statement statement = null;
        List<KelompokArisan> list = new ArrayList<KelompokArisan>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            while (result.next()) {
                KelompokArisan kelompok = new KelompokArisan();
                kelompok.setIdKelompokArisan(result.getInt("ID_KELOMPOK"));
                kelompok.setNamaKelompokArisan(result.getString("NAMA_KELOMPOK"));
                kelompok.setTanggalMulaiArisan(result.getString("TANGGAL_MULAI_ARISAN"));
                kelompok.setJumlahAnggota(result.getInt("JUMLAH_ANGGOTA"));
                kelompok.setJumlahSetoran(result.getInt("JUMLAH_SETORAN"));
                list.add(kelompok);
            }
            connection.commit();
            return list;
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new KelompokArisanException(exception.getMessage());
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
