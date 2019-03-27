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
public class DonorInfo {
    
    
     private String DonorID;
     private String DonorName;
     private String DonorGender;
     private String DonorBloodGroup;
     private String DonorAddress;
     private String DonorArea;   
     private String DonorPhoneNumber;  
     private String Eligibility;
     
     
     public DonorInfo(String DonorName , String DonorGender , String DonorBloodGroup , String DonorAddress , String DonorArea,String DonorPhoneNumber ) {
        this.DonorName = DonorName;
        this.DonorGender = DonorGender;
        this.DonorBloodGroup = DonorBloodGroup;
        this.DonorAddress = DonorAddress;
        this.DonorArea = DonorArea;
        this.DonorPhoneNumber = DonorPhoneNumber;
      
    }

    public String getDonorID() {
        return DonorID;
    }

    public String getDonorName() {
        return DonorName;
    }

    public String getDonorGender() {
        return DonorGender;
    }

    public String getDonorBloodGroup() {
        return DonorBloodGroup;
    }

    public String getDonorAddress() {
        return DonorAddress;
    }

    public String getDonorArea() {
        return DonorArea;
    }

    public String getDonorPhoneNumber() {
        return DonorPhoneNumber;
    }

    public String getEligibility() {
        return Eligibility;
    }
     
     
    
}
