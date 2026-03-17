
package main;


public class oop {
    public class allatok {
        double kecskear; 
        double juhar;
        double sertesar;
        
        
        public allatok(int kecskear, int juhar, int sertesar) {
        this.kecskear = kecskear;
        this.juhar = juhar;
        this.sertesar = sertesar;

    }
        

    
    
    public double getKecskedb() {
        return kecskear;
    }
    public double getJuhar(){
        return juhar;
    }

    public double getSertesar(){
        return sertesar;
    }
    public void setKecskear(int kecskear) { 
        this.kecskear = kecskear; 
    }


    public void setJuhar(int juhar) {
        this.juhar = juhar;
    }

    public void setSertesar(int sertesar) {
        this.sertesar = sertesar;
    }

    
    }
}
