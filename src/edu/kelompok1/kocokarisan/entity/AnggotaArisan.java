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
public class AnggotaArisan {
    
      private Integer idAnggotaArisan;
      private String namaAnggotaArisan;
      private String alamat;
      private Integer ikutArisan;

    public AnggotaArisan() {
    }

    public AnggotaArisan(Integer idAnggotaArisan, String namaAnggotaArisan, String alamat, Integer ikutArisan) {
        this.idAnggotaArisan = idAnggotaArisan;
        this.namaAnggotaArisan = namaAnggotaArisan;
        this.alamat = alamat;
        this.ikutArisan = ikutArisan;
    }
      
      

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idAnggotaArisan);
        hash = 79 * hash + Objects.hashCode(this.namaAnggotaArisan);
        hash = 79 * hash + Objects.hashCode(this.alamat);
        hash = 79 * hash + Objects.hashCode(this.ikutArisan);
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
        final AnggotaArisan other = (AnggotaArisan) obj;
        if (!Objects.equals(this.namaAnggotaArisan, other.namaAnggotaArisan)) {
            return false;
        }
        if (!Objects.equals(this.alamat, other.alamat)) {
            return false;
        }
        if (!Objects.equals(this.idAnggotaArisan, other.idAnggotaArisan)) {
            return false;
        }
        if (!Objects.equals(this.ikutArisan, other.ikutArisan)) {
            return false;
        }
        return true;
    }
      
      
    
}
