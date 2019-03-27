/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFiles;

/**
 *
 * @author ASUS
 */
public class DonationDetails {
    
    
    private String DonationNumber;
    private String BagNumber;
     private String  Hospital;
     private String CollectionDate;
     private String GivingDate;
     private String GivenAmount;
     
    
   
  
    public DonationDetails(String BagNumber,String Hospital , String CollectionDate , String GivingDate , String GivenAmount ) {
        
        this.BagNumber = BagNumber;
        this.Hospital = Hospital;
        this.CollectionDate = CollectionDate;
        this.GivingDate = GivingDate;
        this.GivenAmount = GivenAmount;
      
    }

    public String getDonationNumber() {
        return DonationNumber;
    }

    public String getBagNumber() {
        return BagNumber;
    }

    public String getHospital() {
        return Hospital;
    }

    public String getCollectionDate() {
        return CollectionDate;
    }

    public String getGivingDate() {
        return GivingDate;
    }

    public String getGivenAmount() {
        return GivenAmount;
    }
    
    
    
    
}
