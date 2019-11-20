/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquancafe.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
    
    @Id @GeneratedValue
    @Column(name ="maNV")
    private int maNv;
    @Column(name="tenNV")
    private String tenNV;
    @Column(name="queQuan")
    private String queQuan;
    @Column(name ="ngaySinh")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ngaySinh;
    @Column(name="soDienThoai")
    private String soDienThoai;
    @Column(name="gioiTinh")
    private String gioiTinh;
    @Column(name="gamil")
    private String gmail;
    @Column(name="tenTaiKhoan")
    private String tenTaiKhoan;
    @Column(name ="matKhau")
    private String matKhau;
    private static int dem;
    {
        dem++;
        
    }
    
    public NhanVien(){
        
    }
    
    public NhanVien(String ten, String qq, String ns, String sdt,
            String gt, String g, String ttk, String mk){
        
        try {
            this.maNv = dem;
            this.tenNV = ten;
            this.queQuan = qq;
            this.soDienThoai = sdt;
            this.gmail = g;
            this.gioiTinh  = gt;
            this.tenTaiKhoan = ttk;
            this.matKhau = mk;
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
            this.ngaySinh = f.parse(ns);
        } catch (ParseException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

 

    /**
     * @return the tenNV
     */
    public String getTenNV() {
        return tenNV;
    }

    /**
     * @param tenNV the tenNV to set
     */
    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the soDienThoai
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * @param soDienThoai the soDienThoai to set
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the gmail
     */
    public String getGmail() {
        return gmail;
    }

    /**
     * @param gmail the gmail to set
     */
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    /**
     * @return the tenTaiKhoan
     */
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    /**
     * @param tenTaiKhoan the tenTaiKhoan to set
     */
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    /**
     * @return the matKhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * @return the maNv
     */
    public int getMaNv() {
        return maNv;
    }

    /**
     * @param maNv the maNv to set
     */
    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }
}
