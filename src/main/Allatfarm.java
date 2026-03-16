
package main;

public class Allatfarm {
        
        

    public static void main(String[] args) {
        double kecskear = 0.5;
        double sertesar =3.5;
        double juhar = 4.0/3;
        
        
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
         System.out.println("jo megoldasok szama: " + db);
}
    
}
