/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.mavenproject1.models.Warehouse;

/**
 *
 * @author bingx
 */
public class WarehouseRepository {
    private static List<Warehouse> warehouses =new ArrayList<>();
    
    public void addWarehouse(Warehouse warehouse){
        warehouses.add(warehouse);
    }
    public void deleteWarehouse(int warehouseId){
        // warehouse warehouseToDelete= this.getwarehouseByID(warehouseId);
        // warehouses.remove(warehouseToDeleteId);
        for(int i=0; i< warehouses.size(); i++){
            if(warehouseId == warehouses.get(i).warehouseId){
                warehouses.remove(i);
                break;
            }
        }
    }
    
    public Warehouse getwarehouseByID(int warehouseId)
    {
        for(Warehouse warehouse : warehouses){
            if(warehouse.getwarehouseId() ==warehouseId){
            return warehouse;
            }
        }
        return null; // warehouse not found;

    }
    public void updateWarehouse(Warehouse updateWarehouse)
    {
        for(int i=0;i<warehouses.size();i++){
            if(warehouses.get(i).getwarehouseId() == updateWarehouse.getwarehouseId()){
                warehouses.set(i, updateWarehouse);
        break;
            }
        }}

        public List<Warehouse> getAllwWarehouses(){

            return warehouses;
        }
    }

