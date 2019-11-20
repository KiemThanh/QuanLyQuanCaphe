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
public class DatBan {
    private Ban datBan;
    private int soLuong;
    private Date ngayDat;
    
    public DatBan(){
        
    }
    
    public DatBan(Ban dB, int sl, String ngayD){
        try {
            this.datBan = dB;
            this.soLuong = sl;
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
            this.ngayDat = f.parse(ngayD);
        } catch (ParseException ex) {
            Logger.getLogger(DatBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the datBan
     */
    public Ban getDatBan() {
        return datBan;
    }

    /**
     * @param datBan the datBan to set
     */
    public void setDatBan(Ban datBan) {
        this.datBan = datBan;
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
     * @return the ngayDat
     */
    public Date getNgayDat() {
        return ngayDat;
    }

    /**
     * @param ngayDat the ngayDat to set
     */
    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }
}
