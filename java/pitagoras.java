/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.universidad.java;

/**
 *
 * @author Andres
 */
public class pitagoras {
    public static double calcular_hipotenusa(double catetoa,double catetob){
    double hipotenusa;
            hipotenusa = Math.sqrt(Math.pow( catetoa,2) + Math.pow(catetob,2));
            return hipotenusa;
    }
}
