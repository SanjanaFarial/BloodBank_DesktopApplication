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
public class BloodInfo {
    
    private String donarID;
    private String quantityAvailabe;
     private String plasma;
     private String platelets;
     private String redBloodCells;
     private String whiteBloodCells;
     
     private String heamoglobin;
   
  
    public BloodInfo(String donarID,String quantityAvailabe , String plasma , String platelets , String redBloodCells , String whiteBloodCells,String heamoglobin ) {
        
        this.donarID = donarID;
        this.quantityAvailabe = quantityAvailabe;
        this.plasma = plasma;
        this.platelets = platelets;
        this.redBloodCells = redBloodCells;
        this.whiteBloodCells = whiteBloodCells;
        this.heamoglobin = heamoglobin;
      
    }

    public String getDonarID() {
        return donarID;
    }

    public String getQuantityAvailabe() {
        return quantityAvailabe;
    }

    public String getPlasma() {
        return plasma;
    }

    public String getPlatelets() {
        return platelets;
    }

    public String getRedBloodCells() {
        return redBloodCells;
    }

    public String getWhiteBloodCells() {
        return whiteBloodCells;
    }

    public String getHeamoglobin() {
        return heamoglobin;
    }
    
}
