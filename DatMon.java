/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquancafe.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DatMon {
    private Mon datMon;
    private int soLuong;
    private Date ngayDatMon;
    
    public DatMon(){
        
    }
    public DatMon(Mon dm, int sl, String ngayD){
        try {
            this.datMon = dm;
            this.soLuong = sl;
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
            this.ngayDatMon = f.parse(ngayD);
        } catch (ParseException ex) {
            Logger.getLogger(DatMon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

    /**
     * @return the datMan
     */
    public Mon getDatMon() {
        return datMon;
    }

    /**
     * @param datMan the datMan to set
     */
    public void setDatMon(Mon datMon) {
        this.datMon = datMon;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * @return the ngayDatMon
     */
    public Date getNgayDatMon() {
        return ngayDatMon;
    }

    /**
     * @param ngayDatMon the ngayDatMon to set
     */
    public void setNgayDatMon(Date ngayDatMon) {
        this.ngayDatMon = ngayDatMon;
    }

    
    
}
