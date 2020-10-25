/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author DELL
 */
public class Product 
{
    private int pid;
    private int quatity;
    private String color;
    private String pname;
    private Double total;
    private String size;

    
    public int getPid() {
        return pid;
    }

    
    public void setPid(int pid) {
        this.pid = pid;
    }

    
    public int getQuatity() {
        return quatity;
    }

    
    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    
    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    
    public String getPname() {
        return pname;
    }

    
    public void setPname(String pname) {
        this.pname = pname;
    }

   
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    
    public String getSize() {
        return size;
    }

    
    public void setSize(String size) {
        this.size = size;
    }
    
    
    
    
}
