/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.p2.interfaces.modelos.equipo;
import edu.upb.p2.interfaces.contratos.Equipable;
/**
 *
 * @author pipe22007
 */
public class Arma implements Equipable{

    @Override
    public void equipar() {
        System.out.println("Mi arma me protege.");
    }

    @Override
    public void desequipar() {
        System.out.println("Me siento desarmado.");
    }
    
}
