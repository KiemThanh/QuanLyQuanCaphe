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
public class Ban {
    private String maBan;
    private int sucChua;
    private int viTriBan;
    private boolean tinhTrang;
    private Set nhanVien;
    
    public Ban(){
        
    }
    
    public Ban(String maBan, int sucChua, int vtr, boolean tt){
        this.maBan = maBan;
        this.sucChua = sucChua;
        this.viTriBan = vtr;
        this.tinhTrang = tt;
    }
    
    public String getTinhtrang(){
        if(this.tinhTrang == true)
            return "Còn bàn trống";
        return "Bàn đã đặt";
    }

    @Override
    public boolean equals(Object o) {
        
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * @return the maBan
     */
    public String getMaBan() {
        return maBan;
    }

    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    /**
     * @return the viTriBan
     */
    public int getViTriBan() {
        return viTriBan;
    }

    /**
     * @param viTriBan the viTriBan to set
     */
    public void setViTriBan(int viTriBan) {
        this.viTriBan = viTriBan;
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
     * @return the nhanVien
     */
    public Set getNhanVien() {
        return nhanVien;
    }

    /**
     * @param nhanVien the nhanVien to set
     */
    public void setNhanVien(Set nhanVien) {
        this.nhanVien = nhanVien;
    }
    
}
