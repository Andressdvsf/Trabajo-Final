/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package app.universidad.java;
import javax.swing.jFrame;

/**
 *
 * @author Andres
 */
public class UniversidadJava {

    public static void main(String[] args) {
         frmprincipal principal = new frmprincipal ();
         principal.setExtendedState(jFrame.MAXIMIEED_BOTH);
        
        principal.setVisible(true);
        
    }
}

