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
public class QLMon {
    private ArrayList<Mon> dsMon = new ArrayList<>();
    
    public void themMon(Mon m){
        this.dsMon.add(m);
    }

    public void xoaMon(Mon m){
        this.dsMon.remove(m);
    }
    
    public QLMon timKiemMonTheoTen(String tenMon){
        QLMon ql = new QLMon();
        this.dsMon.stream().filter((m) -> 
                (m.getTenMon().contains(tenMon)))
                 .forEachOrdered((m) -> {
            ql.themMon(m);
        });
        return ql;
    }
    
    public QLMon timKiemTheoGia(int from, int to) {
        QLMon ql = new QLMon();
        this.dsMon.stream().filter((m) -> 
                (m.getGiaTien()>= from && m.getGiaTien()<= to))
                .forEachOrdered((m) -> {
            ql.themMon(m);
        });
        return ql;
    }
    
    

    /**
     * @return the dsMon
     */
    public ArrayList<Mon> getDsMon() {
        return dsMon;
    }

    /**
     * @param dsMon the dsMon to set
     */
    public void setDsMon(ArrayList<Mon> dsMon) {
        this.dsMon = dsMon;
    }
}
