/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.models;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author bingx
 */
public class Warehouse{
    public int warehouseId;
    public String location;
    public int currentQuantity;
    public int maxCapacity;
    public List<Section> sections;

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
      }
    
    public int getwarehouseId() {
        return warehouseId;
      }
    
      public void setLocation(String location) {
        this.location = location;
      }

      public String getLocation() {
        return location;
      }
      public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
      }
      public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
      }
      public int getMaxCapacity() {
        return maxCapacity;
      }
    
    
}
