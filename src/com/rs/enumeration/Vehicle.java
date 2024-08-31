package com.rs.enumeration;

public class Vehicle {
   private String issuer;
   private VehicleTypeV2 type;

   public Vehicle (String issuer, VehicleTypeV2 type){
       this.issuer = issuer;
       this.type = type;
   }

   public int getPrice(){
       return type.getPrice();
   }

}
