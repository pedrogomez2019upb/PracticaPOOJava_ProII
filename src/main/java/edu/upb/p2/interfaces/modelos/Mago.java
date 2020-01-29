/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.p2.interfaces.modelos;

/**
 *
 * @author pipe22007
 */
public class Mago extends Personaje{

    @Override
    public void moverse() {
        System.out.println("Puedes correr pero no puedes planear.");
    }
    
}
