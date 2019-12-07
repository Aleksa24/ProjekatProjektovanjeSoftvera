/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components.table.model;

import domain.OsobaIzvodjac;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aleksa
 */
public class OsobaIzvodjacTableModel extends AbstractTableModel{

    private final List<OsobaIzvodjac> izvodjaci;
    private String[] columnNames = new String[]{"ID OsobaIzvodjac","Ime","Prezime","Email","Telefon"};
    private Class[] columnClasses = new Class[]{Long.class,String.class,String.class,String.class,String.class};
    

    public OsobaIzvodjacTableModel(List<OsobaIzvodjac> izvodjaci) {
        this.izvodjaci = izvodjaci;
    }
    
    
    
    @Override
    public int getRowCount() {
        return izvodjaci.size();
    }

    @Override
    public int getColumnCount() {
        return columnClasses.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OsobaIzvodjac osobaIzvodjac = izvodjaci.get(rowIndex);
        switch(columnIndex){
            case 0:return osobaIzvodjac.getIdIzvodjac();
            case 1:return osobaIzvodjac.getIme();
            case 2:return osobaIzvodjac.getPrezime();
            case 3:return osobaIzvodjac.getEmail();
            case 4:return osobaIzvodjac.getTelefon();
            
            default:return "n/a";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        OsobaIzvodjac osobaIzvodjac = izvodjaci.get(rowIndex);
        switch(rowIndex){
            case 0: osobaIzvodjac.setIdIzvodjac(Long.parseLong(aValue.toString()));
                    break;
            case 1: osobaIzvodjac.setIme(aValue.toString());
                    break;
            case 2: osobaIzvodjac.setPrezime(aValue.toString());
                    break;
            case 3: osobaIzvodjac.setEmail(aValue.toString());
                    break;
            case 4: osobaIzvodjac.setTelefon(aValue.toString());
                    break;
        }
    }

    //potencijalno izmeniti
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public String getColumnName(int column) {
        if (column > columnNames.length) {
            return "n/a";
        }
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }
    
    
    
}
