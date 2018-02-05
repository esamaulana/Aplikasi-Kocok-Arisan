/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.model;

import edu.kelompok1.kocokarisan.entity.AnggotaArisan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sarif Hidayat
 */
public class TabelAnggotaArisanModel extends AbstractTableModel  {

    private java.util.List<AnggotaArisan> list = new ArrayList<AnggotaArisan>();

    public void setList(java.util.List<AnggotaArisan> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    public boolean add(AnggotaArisan e) {
        try {
            return list.add(e);
        } finally  {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public AnggotaArisan get(int i) {
        return list.get(i);
    }

    public AnggotaArisan set(int i, AnggotaArisan e) {
        try {
            return list.set(i, e);
        } finally {
            fireTableCellUpdated(i, i);
        }
        
    }

    public AnggotaArisan remove(int i) {
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
                return "NAMA";
            case 2:
                return "ALAMAT";
            case 3:
                return "IKUT ARISAN";
            default:
                return null;

        }
    }

    @Override
    public Object getValueAt(int rowIndex, int ColumnIndex) {
        switch (ColumnIndex) {
            case 0:
                return list.get(rowIndex).getIdAnggotaArisan();
            case 1:
                return list.get(rowIndex).getNamaAnggotaArisan();
            case 2:
                return list.get(rowIndex).getAlamat();
            case 3:
                return list.get(rowIndex).getIkutArisan();
            default:
                return null;
        }
    }
}
