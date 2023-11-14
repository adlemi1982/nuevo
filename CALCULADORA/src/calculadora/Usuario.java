/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author ING. DE LA TORRE
 */
public class Usuario {
    
    String user;
    String password;
    
    Usuario(String usuario,String contrasena){
    user=usuario;
    password=contrasena;
    }

    public void autenticar (){
     if((this.user.compareTo("Administrador")==0)&&
             (this.password.compareTo("Admin12345")==0)){
         System.out.println("BIENVENIDO AL SISTEMA");
         Calcular menu=new Calcular();
         menu.menu();        
         
     } else{
         System.out.println("DATOS INCORRECTOS");
     }  
    }
    
}
