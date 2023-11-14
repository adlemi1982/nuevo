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
public class CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String usuario;
        String contrasena;
        System.out.println("Escribe nombre de usuario");
        usuario= sc.nextLine();
        System.out.println("Escribe la contraseña");
        contrasena=sc.nextLine();  
        
        Usuario objUsuario=new Usuario(usuario,contrasena);
        objUsuario.autenticar();
        
    }
    
}
