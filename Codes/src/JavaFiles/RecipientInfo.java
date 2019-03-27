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
public class RecipientInfo {
    
    
    private String RecipientID;
     private String RecipientName;
      private String RecipientAge;
     private String RecipientGender;
     private String RecipientBloodGroup;
     private String RecipientAddress;
      private String RecipientArea;
       private String RecipientPhoneNumber;
        private String DonationNumber;
   
  
    public RecipientInfo(String RecipientName ,String RecipientAge, String RecipientGender , String RecipientBloodGroup , String RecipientAddress , String RecipientArea
                         ,String RecipientPhoneNumber , String DonationNumber) {
        this.RecipientName = RecipientName;
        this.RecipientAge = RecipientAge;
        this.RecipientGender = RecipientGender;
        this.RecipientBloodGroup = RecipientBloodGroup;
        this.RecipientAddress = RecipientAddress;
        this.RecipientArea = RecipientArea;
         this.RecipientPhoneNumber = RecipientPhoneNumber;
           this.DonationNumber = DonationNumber;
      
    }

    public String getRecipientAge() {
        return RecipientAge;
    }

    public String getRecipientID() {
        return RecipientID;
    }

    public String getRecipientName() {
        return RecipientName;
    }

    public String getRecipientGender() {
        return RecipientGender;
    }

    public String getRecipientBloodGroup() {
        return RecipientBloodGroup;
    }

    public String getRecipientAddress() {
        return RecipientAddress;
    }

    public String getRecipientArea() {
        return RecipientArea;
    }

    public String getRecipientPhoneNumber() {
        return RecipientPhoneNumber;
    }

    public String getDonationNumber() {
        return DonationNumber;
    }
    
    
    
}
