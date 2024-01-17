/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.models;

/**
 *
 * @author bingx
 */
public class Item extends StorageBin{
    
    public int itemId;
    public String name;
    public int descrption;
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
      }
    
      public String getName() {
        return name;
      }
    
      public void setName(String name) {
        this.name = name;
      }
    
      public int getQuantity() {
        return quantity;
      }
    
      public int getDescrption() {
        return descrption;
      }
      public void setQuantity(int quantity) {
        this.quantity = quantity;
      }
}
