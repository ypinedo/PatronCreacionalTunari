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
public class ConcreteMenuFactory extends MenuFactory{

    @Override
    public Menu getMenu(String menu) {
        switch(menu){
            case "PiqueMacho":{
                return new PiqueMacho();
            }
            case "Charque":{
                return new Charque();
            }
            case "Planchita":{
                return new Planchita();
            }
            default:{
                return (Menu) new Exception("No se encuentra en el  menu: " + menu);
            }
        }
    }
}
