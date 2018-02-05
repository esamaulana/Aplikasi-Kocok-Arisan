/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.entity;

import java.util.Objects;

/**
 *
 * @author faldi
 */
public class KelompokArisan {
   
    private Integer idKelompokArisan;
    private String namaKelompokArisan;
    private String tanggalMulaiArisan;
    private Integer jumlahAnggota;
    private Integer jumlahSetoran;

    public KelompokArisan() {
    }

    public KelompokArisan(Integer idKelompokArisan, String namaKelompokArisan, String tanggalMulaiArisan, Integer jumlahAnggota, Integer jumlahSetoran) {
        this.idKelompokArisan = idKelompokArisan;
        this.namaKelompokArisan = namaKelompokArisan;
        this.tanggalMulaiArisan = tanggalMulaiArisan;
        this.jumlahAnggota = jumlahAnggota;
        this.jumlahSetoran = jumlahSetoran;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idKelompokArisan);
        hash = 97 * hash + Objects.hashCode(this.namaKelompokArisan);
        hash = 97 * hash + Objects.hashCode(this.tanggalMulaiArisan);
        hash = 97 * hash + Objects.hashCode(this.jumlahAnggota);
        hash = 97 * hash + Objects.hashCode(this.jumlahSetoran);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KelompokArisan other = (KelompokArisan) obj;
        if (!Objects.equals(this.namaKelompokArisan, other.namaKelompokArisan)) {
            return false;
        }
        if (!Objects.equals(this.tanggalMulaiArisan, other.tanggalMulaiArisan)) {
            return false;
        }
        if (!Objects.equals(this.idKelompokArisan, other.idKelompokArisan)) {
            return false;
        }
        if (!Objects.equals(this.jumlahAnggota, other.jumlahAnggota)) {
            return false;
        }
        if (!Objects.equals(this.jumlahSetoran, other.jumlahSetoran)) {
            return false;
        }
        return true;
    }
    
    
    
}
