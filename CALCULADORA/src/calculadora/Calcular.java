/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author ING. DE LA TORRE
 */
public class Calcular {
    
    Scanner sc=new Scanner(System.in);
    int num1;
    int num2;
    int elegir;
    
    public void menu(){
        System.out.println("MENU");
        System.out.println("Selecciona el número de la operación a realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. División");
        System.out.println("4. Multiplicación");
        elegir=sc.nextInt();
        switch (elegir){
            case 1:{
                sumar();
            }
             case 2:{
                restar();
            }
              case 3:{
                dividir();
            }
               case 4:{
                multiplicar();
            }
               default:{
                   System.out.println("Solo captura ´úmeros del 1 al 4");
               }
        }
    }
    
    public void leerNumeros(){
        System.out.println("Dame el número 1");
        this.num1=sc.nextInt();
        System.out.println("Dame el número 2");
        this.num2=sc.nextInt();
    }
    
    public void sumar(){
        leerNumeros();
        int suma;
        suma=this.num1+this.num2;
        System.out.println("La suma es: "+suma);
    }
    
    public void restar(){
        leerNumeros();
        int resta;
        resta=this.num1-this.num2;
        System.out.println("La resta es: "+resta);
    }
    
    public void dividir(){
        leerNumeros();
        int resultado;
        resultado=this.num1/this.num2;
        System.out.println("La división es: "+resultado);
    }
    
    public void multiplicar(){
        leerNumeros();
        int producto;
        producto=this.num1*this.num2;
        System.out.println("La multiplicación es: "+producto);
    }
    
    Calcular(){
        
    }
    
}
