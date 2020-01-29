/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.p2.interfaces;

import edu.upb.p2.interfaces.modelos.Personaje;
import edu.upb.p2.interfaces.modelos.Ladron;
import edu.upb.p2.interfaces.modelos.Mago;
import edu.upb.p2.interfaces.modelos.equipo.Armadura;

/**
 *
 * @author pipe22007
 */
public class Juego {
    public static void main(String[] args) {
        //Personaje p = new Personaje();
        Personaje p;
        p= new Ladron();
        p.moverse();
        
        p=new Mago();
        p.subirNivel();
        
        p.setEquipo(new Armadura());
        p.getEquipo().equipar();
    }
}
