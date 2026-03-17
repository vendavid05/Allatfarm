
package main;

public class program {
    
    public int megoldasokatKeres(double kecskear, double juhar, double sertesar) {
        int db = 0;
        for (int s = 0; s <= 28; s++) {
            for(int j =0; j<=75;j++){
            
                int k = 100- s- j; 
                
            
               if (s+k+j ==100
                       && s*sertesar + k*kecskear + j*juhar==100){
                   db++;
                }
               
            }
            
            
        }
        
        return db;
    
    }
}