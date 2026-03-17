
package main;

public class teszteles {
    public static void main(String[] args) {
        
    
    program p = new program();
        
        System.out.println("1. : drága állatok");
        int eredmeny1 = p.megoldasokatKeres(1000.0, 1000.0, 1000.0);
        System.out.println("Várt eredmény: 0");
        System.out.println("Kapott eredmény: " + eredmeny1);
        if (eredmeny1 == 0) {
            System.out.println("Mukodik");
        } else {
            System.out.println("Hiba");
        }
        System.out.println("2.: Ingyen állatok");
        
        int eredmeny2 = p.megoldasokatKeres(0.0, 0.0, 0.0);
        System.out.println("Várt eredmény: 0");
        System.out.println("Kapott eredmény: " + eredmeny2);
        if (eredmeny2 == 0) {
            System.out.println("Helyes");
        } else {
            System.out.println("HIBA");
        }
    }
}


