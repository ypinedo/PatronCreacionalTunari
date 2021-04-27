/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.creacional.tunari;

/**
 *
 * @author Yurguen Pinedo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuFactory factory = new ConcreteMenuFactory();
        
        Menu piqueMacho = factory.getMenu("PiqueMacho");
        piqueMacho.guardarPrecio(70);
        
        Menu Charque = factory.getMenu("Charque");
        Charque.guardarPrecio(50);
        
        String menu;
        menu = javax.swing.JOptionPane.showInputDialog("Que Menu desea(Planchita): ");
        
        Menu planchita = factory.getMenu(menu);
        planchita.guardarPrecio(60);
    }
    
}
