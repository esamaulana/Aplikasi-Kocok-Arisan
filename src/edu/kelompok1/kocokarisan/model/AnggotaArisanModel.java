/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.model;

import edu.kelompok1.kocokarisan.database.ArisanYukDatabase;
import edu.kelompok1.kocokarisan.entity.AnggotaArisan;
import edu.kelompok1.kocokarisan.error.AnggotaArisanException;
import edu.kelompok1.kocokarisan.event.AnggotaArisanListener;
import edu.kelompok1.kocokarisan.service.AnggotaArisanDao;
import java.sql.SQLException;

/**
 *
 * @author Sarif Hidayat
 */
public class AnggotaArisanModel {

    private Integer idAnggotaArisan;
    private String namaAnggotaArisan;
    private String alamat;
    private Integer ikutArisan;

    private AnggotaArisanListener listener;

    public Integer getIdAnggotaArisan() {
        return idAnggotaArisan;
    }

    public void setIdAnggotaArisan(Integer idAnggotaArisan) {
        this.idAnggotaArisan = idAnggotaArisan;
    }

    public String getNamaAnggotaArisan() {
        return namaAnggotaArisan;
    }

    public void setNamaAnggotaArisan(String namaAnggotaArisan) {
        this.namaAnggotaArisan = namaAnggotaArisan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getIkutArisan() {
        return ikutArisan;
    }

    public void setIkutArisan(Integer ikutArisan) {
        this.ikutArisan = ikutArisan;
    }

    public AnggotaArisanListener getListener() {
        return listener;
    }

    public void setListener(AnggotaArisanListener listener) {
        this.listener = listener;
    }

    protected void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    protected void fireOnInsert(AnggotaArisan anggota) {
        if (listener != null) {
            listener.onInsert(anggota);
        }
    }

    protected void fireOnUpdate(AnggotaArisan anggota) {
        if (listener != null) {
            listener.onUpdate(anggota);
        }
    }

    protected void fireOnDelete() {
        if (listener != null) {
            listener.onDelete();
        }
    }

    public void insertAnggotaArisan() throws SQLException, AnggotaArisanException {
        AnggotaArisanDao dao = ArisanYukDatabase.getAnggotaDao();
        AnggotaArisan Anggota = new AnggotaArisan();
        Anggota.setNamaAnggotaArisan(namaAnggotaArisan);
        Anggota.setAlamat(alamat);
        Anggota.setIkutArisan(ikutArisan);

        dao.insertAnggotaArisan(Anggota);
        fireOnInsert(Anggota);
    }

    public void updateAnggotaArisan() throws SQLException, AnggotaArisanException {
        AnggotaArisanDao dao = ArisanYukDatabase.getAnggotaDao();
        AnggotaArisan Anggota = new AnggotaArisan();
        Anggota.setNamaAnggotaArisan(namaAnggotaArisan);
        Anggota.setAlamat(alamat);
        Anggota.setIkutArisan(ikutArisan);

        dao.insertAnggotaArisan(Anggota);
        fireOnUpdate(Anggota);
    }

    public void deleteAnggotaArisan() throws SQLException, AnggotaArisanException {
        AnggotaArisanDao dao = ArisanYukDatabase.getAnggotaDao();
        dao.deleteAnggotaArisan(idAnggotaArisan);
        fireOnDelete();
    }
    
    public void resetPelanggan(){
        setIdAnggotaArisan(0);
        setNamaAnggotaArisan("");
        setAlamat("");
        setIkutArisan(0);
    }
}
