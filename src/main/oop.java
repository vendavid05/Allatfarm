
package main;


public class oop {
    public class allatok {
        int kecskear; 
        int juhar;
        int sertesar;
        
        
        public allatok(int kecskear, int juhar, int sertesar) {
        this.kecskear = kecskear;
        this.juhar = juhar;
        this.sertesar = sertesar;

    }
        

    
    
    public int getKecskedb() {
        return kecskear;
    }
    public int getJuhar(){
        return juhar;
    }

    public int getSertesar(){
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
