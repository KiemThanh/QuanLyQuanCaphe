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
public class QLDatMon {
    private ArrayList<DatMon> dsDatMon = new ArrayList<>();
    
    public void them(DatMon dm){
        this.dsDatMon.add(dm);
    }
    
    public void xoa(DatMon dm){
        this.dsDatMon.remove(dm);
        
    }
    
    //Tìm kiếm theo ds đặt món
}
