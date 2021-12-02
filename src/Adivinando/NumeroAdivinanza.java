
package Adivinando;

import javax.swing.JOptionPane;

/*
Realizar un juego para adivinar un numero. 
Para ello generar un numero aleatorio entre 0-100 y luego ir pidiendo 
numero indicando es mayor o es menor segun sea mayor o menor 
con respoecto a N. El proceso termina cuando el usuario acierta y 
mostrar el numero de intentos. 
 */
public class NumeroAdivinanza {
    public static void main(String[] args) {
        int nIngresado, aleatorio;
        
        nIngresado = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
                + "un numero de 0 - 100 \nA ver si adivinas el numero correcto: "));

        aleatorio = (int)(Math.random()*100);
        
        while(aleatorio != nIngresado){
            
            if (nIngresado > aleatorio){
                JOptionPane.showMessageDialog(null, "Aleatorio es menor ");

            }
            else {
                JOptionPane.showMessageDialog(null, "Aleatorio es mayor ");                
            }
            
            nIngresado = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
                + "un numero, a ver si adivinas el numero correcto: "));
        }
        
        JOptionPane.showMessageDialog(null, "Perfecto!! El numero aleatorio es: "+aleatorio);
        
    }
}
