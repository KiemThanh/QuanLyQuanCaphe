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
public class HoaDon {
    private int maHD;
    private Date ngayDat;
    private double tongTien;
    private String maBan;
    private int maNV;
    private QLDatMon qlDatMon;
    private static int dem;
    
    {
        dem++;
    }
    
    public HoaDon(String maB, int maN, String ngayD, QLDatMon ql, double tt){
        try {
            this.maHD = dem;
            this.maBan = maB;
            this.maNV = maN;
            this.qlDatMon = ql;
            this.tongTien = tt;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            this.ngayDat = f.parse(ngayD);
        } catch (ParseException ex) {
            Logger.getLogger(HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public HoaDon(){
        
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String m = String.format("Mã hóa đơn: %d\nMã NV: %d\n"
                + "Mã bàn: %s\nNgày đặt: %s\nTổng Tiền: %,.2f", this.maHD,
                this.maNV,this.maBan,f.format(ngayDat), this.tongTien);
        m += "\n\t-- Chi tiết hóa đơn --\n" +this.qlDatMon;
        return m ;
    }
    
    


    /**
     * @return the maHD
     */
    public int getMaHD() {
        return maHD;
    }

    /**
     * @param maHD the maHD to set
     */
    public void setMaHD(int maHD) {
        this.maHD = maHD;
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

    /**
     * @return the tongTien
     */
    public double getTongTien() {
        return tongTien;
    }

    /**
     * @param tongTien the tongTien to set
     */
    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
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
     * @return the maNV
     */
    public int getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the qlDatMon
     */
    public QLDatMon getQlDatMon() {
        return qlDatMon;
    }

    /**
     * @param qlDatMon the qlDatMon to set
     */
    public void setQlDatMon(QLDatMon qlDatMon) {
        this.qlDatMon = qlDatMon;
    }
    
    
    

    
}
