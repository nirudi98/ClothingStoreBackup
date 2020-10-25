/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ShoppingCart 
{
    private ArrayList<Product> products = new ArrayList<Product>();
    
    public ArrayList<Product> getProducts()
    {
        return products;
    }
    
    public void setProducts(ArrayList<Product> products)
    {
        this.products = products;
    }
}
