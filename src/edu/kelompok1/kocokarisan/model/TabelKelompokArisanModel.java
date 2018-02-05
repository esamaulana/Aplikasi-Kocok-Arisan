/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.model;

import edu.kelompok1.kocokarisan.entity.KelompokArisan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author faldi
 */
public class TabelKelompokArisanModel extends AbstractTableModel {
    
    private List<KelompokArisan> list = new ArrayList<KelompokArisan>();

    public void setList(List<KelompokArisan> list) {
        this.list = list;
    }
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public boolean add(KelompokArisan e) {
        try {
            return list.add(e);
        } finally  {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public KelompokArisan get(int i) {
        return list.get(i);
    }

    public KelompokArisan set(int i, KelompokArisan e) {
        try {
            return list.set(i, e);
        } finally {
            fireTableCellUpdated(i, i);
        }
        
    }

    public KelompokArisan remove(int i) {
        try {
            return list.remove(i);
        } finally {
            fireTableRowsDeleted(i, i);
        }
        
    }
    
    

    @Override
    public String getColumnName(int Column) {
        switch (Column) {
            case 0:
                return "ID";
            case 1:
                return "NAMA KELOMPOK";
            case 2:
                return "TANGGAL MULAI";
            case 3:
                return "JUMLAH ANGGOTA";
            case 4:
                return "JUMLAH SETORAN";
            default:
                return null;

        }
    }

    @Override
    public Object getValueAt(int rowIndex, int ColumnIndex) {
        switch (ColumnIndex) {
            case 0:
                return list.get(rowIndex).getIdKelompokArisan();
            case 1:
                return list.get(rowIndex).getNamaKelompokArisan();
            case 2:
                return list.get(rowIndex).getTanggalMulaiArisan();
            case 3:
                return list.get(rowIndex).getJumlahAnggota();
            case 4:
                return list.get(rowIndex).getJumlahSetoran();
            default:
                return null;
        }
    }
}
