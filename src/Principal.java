/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khriiz
 */
public class Principal {
    
    
    
    public static void main(String[] args){
    
        System.out.println ("hola primer programa");
        
        Lapicera lapicera1 = new Lapicera();
        
        lapicera1.marca = "BIC";
        lapicera1.modelo = "Trazo Fino";
        lapicera1.color = "Negro";
        lapicera1.año = 2018;
        lapicera1.estilo = "Descartable";
        
        
        Multifuncion multifuncion1 = new Multifuncion();
        
        
        multifuncion1.marca = "SHARP";
        multifuncion1.modelo = "ML-M314ND";
        multifuncion1.serie = 34111522;
        multifuncion1.contadortotal = 102659;
        multifuncion1.conectividad = "RED cableada";
        
        escaner escaner1 = new escaner();
        
        
        escaner1.marca = "KODAK";
        escaner1.modelo = "I940";
        escaner1.serie = 52678563;
        escaner1.contadortotal = 10963;
        escaner1.conectividad = "USB";
        
        
        multifuncion1.mostrardatos();
        
        lapicera1.mostrardatos();
        
        escaner1.mostrardatos();
        
                
    }
}
