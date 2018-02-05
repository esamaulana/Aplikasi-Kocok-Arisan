/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.model;

import edu.kelompok1.kocokarisan.database.ArisanYukDatabase;
import edu.kelompok1.kocokarisan.entity.KelompokArisan;
import edu.kelompok1.kocokarisan.error.KelompokArisanException;
import edu.kelompok1.kocokarisan.event.KelompokArisanListener;
import edu.kelompok1.kocokarisan.service.KelompokArisanDao;
import java.sql.SQLException;

/**
 *
 * @author faldi
 */
public class KelompokArisanModel {
    
    private Integer idKelompokArisan;
    private String namaKelompokArisan;
    private String tanggalMulaiArisan;
    private Integer jumlahAnggota;
    private Integer jumlahSetoran;

    private KelompokArisanListener listener;

    public KelompokArisanListener getListener() {
        return listener;
    }

    public void setListener(KelompokArisanListener listener) {
        this.listener = listener;
    }

    public Integer getIdKelompokArisan() {
        return idKelompokArisan;
    }

    public void setIdKelompokArisan(Integer idKelompokArisan) {
        this.idKelompokArisan = idKelompokArisan;
    }

    public String getNamaKelompokArisan() {
        return namaKelompokArisan;
    }

    public void setNamaKelompokArisan(String namaKelompokArisan) {
        this.namaKelompokArisan = namaKelompokArisan;
    }

    public String getTanggalMulaiArisan() {
        return tanggalMulaiArisan;
    }

    public void setTanggalMulaiArisan(String tanggalMulaiArisan) {
        this.tanggalMulaiArisan = tanggalMulaiArisan;
    }

    public Integer getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahAnggota(Integer jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

    public Integer getJumlahSetoran() {
        return jumlahSetoran;
    }

    public void setJumlahSetoran(Integer jumlahSetoran) {
        this.jumlahSetoran = jumlahSetoran;
    }


    protected void fireOnChange() {
        if (listener !=null) {
            listener.onChange(this);
        }
    }

    protected void fireOnInsert(KelompokArisan kelompok){
        if (listener!=null) {
            listener.onInsert(kelompok);
        }
    }
    
    protected void fireOnUpdate(KelompokArisan kelompok) {
        if (listener !=null) {
            listener.onUpdate(kelompok);
        }
    }

    protected void fireOnDelete() {
        if (listener !=null) {
            listener.onDelete();
        }
    }

    public void insertKelompokArisan() throws SQLException, KelompokArisanException {
        KelompokArisanDao dao = ArisanYukDatabase.getKelompokDao();
        KelompokArisan kelompok = new KelompokArisan();
        kelompok.setNamaKelompokArisan(namaKelompokArisan);
        kelompok.setTanggalMulaiArisan(tanggalMulaiArisan);
        kelompok.setJumlahAnggota(jumlahAnggota);
        kelompok.setJumlahSetoran(jumlahSetoran);

        dao.insertKelompokArisan(kelompok);
        fireOnInsert(kelompok);
    }

    public void updateKelompokArisan() throws SQLException, KelompokArisanException {
        KelompokArisanDao dao = ArisanYukDatabase.getKelompokDao();
        KelompokArisan kelompok = new KelompokArisan();
        kelompok.setNamaKelompokArisan(namaKelompokArisan);
        kelompok.setTanggalMulaiArisan(tanggalMulaiArisan);
        kelompok.setJumlahAnggota(jumlahAnggota);
        kelompok.setJumlahSetoran(jumlahSetoran);
        kelompok.setIdKelompokArisan(idKelompokArisan);

        dao.updateKelompokArisan(kelompok);
        fireOnUpdate(kelompok);
    }
        
    public void deleteKelompokArisan() throws SQLException, KelompokArisanException {
        KelompokArisanDao dao = ArisanYukDatabase.getKelompokDao();
        dao.deleteKelompokArisan(idKelompokArisan);
        fireOnDelete();

    }

    public void resetKelompokArisan() {
        setIdKelompokArisan(0);
        setNamaKelompokArisan("");
        setTanggalMulaiArisan("");
        setJumlahAnggota(0);
        setJumlahSetoran(0);
    }
    
}
