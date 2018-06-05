/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Pruebas_HashMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="1234";
        PasswordAuthentication seg=new PasswordAuthentication();
        
        String hassshi;
        try {
            hassshi = seg.hashing(a);
            System.out.println(hassshi);
        } catch (NoSuchAlgorithmException ex) {
           
        }catch(Exception ex){
            
        }
        
    }
    
}
