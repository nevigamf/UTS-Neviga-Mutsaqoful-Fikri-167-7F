/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmii;

import java.util.scanner;
public class bmii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        scanner input = new sacnner(system.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("masukkan berat :");
        berat = input.nextInt();
        System.out.println("masukkan tinggi :");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmii=berat/(tinggi*tinggi);
        System.out.println("bmii mu adalah "+ bmii);
        
        if(bmii<18.5){
            System.out.println("krang berat badan");
        }
        else if(bmii<24.9){
            System.out.println("normal");
        }
        else if(bmii<28.9){
            System.out.println("gemuk");
        }
        else {
            System.out.println("obesitas");
        }
          
    }
    
}
