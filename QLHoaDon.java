/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquancafe.model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QLHoaDon {
    private ArrayList<HoaDon> dsHoaDon =  new ArrayList<>();
    
    
    public void themHD(HoaDon h){
        this.dsHoaDon.add(h);
    }
    
    public void xoaHD(HoaDon h){
        this.dsHoaDon.remove(h);
    }

    @Override
    public String toString() {
        String kq = "";
        for(HoaDon h: this.dsHoaDon){
            kq += h + "\n";
        }
                
        return kq;
    }
    
    

    /**
     * @return the dsHoaDon
     */
    public ArrayList<HoaDon> getDsHoaDon() {
        return dsHoaDon;
    }

    /**
     * @param dsHoaDon the dsHoaDon to set
     */
    public void setDsHoaDon(ArrayList<HoaDon> dsHoaDon) {
        this.dsHoaDon = dsHoaDon;
    }
    
    
}
