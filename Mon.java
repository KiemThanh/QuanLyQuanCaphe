/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquancafe.model;

import java.util.Set;


/**
 *
 * @author admin
 */
public class Mon {
    private String maMon;
    private String tenMon;
    private double giaTien;
    private boolean tinhTrang;
    private Set hoaDon;
    
    public Mon(){
        
    }
    
    public Mon(String maM, String ten, double gt, boolean tt){
        this.maMon = maM;
        this.tenMon = ten;
        this.giaTien = gt;
        this.tinhTrang = tt;
        
    }
    
    public String getTinhTrang(){
        if(this.tinhTrang == true)
            return "Chưa hết hạn sử dụng";
        return "Hết hạn sử dụng";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * @return the maMon
     */
    public String getMaMon() {
        return maMon;
    }

    /**
     * @param maMon the maMon to set
     */
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    /**
     * @return the tenMon
     */
    public String getTenMon() {
        return tenMon;
    }

    /**
     * @param tenMon the tenMon to set
     */
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    /**
     * @return the giaTien
     */
    public double getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    /**
     * @return the tinhTrang
     */
    public boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the hoaDon
     */
    public Set getHoaDon() {
        return hoaDon;
    }

    /**
     * @param hoaDon the hoaDon to set
     */
    public void setHoaDon(Set hoaDon) {
        this.hoaDon = hoaDon;
    }
}
