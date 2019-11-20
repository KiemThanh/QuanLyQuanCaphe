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
public class QLBan {
    ArrayList<Ban> qlBan = new ArrayList<>();
    
    public void themBan(Ban b){
        this.qlBan.add(b);
    }
    
    public void xoaBan(Ban b){
        this.qlBan.remove(b);
    }
    
    //Tìm kiếm
}
