/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.p2.interfaces.modelos;

import edu.upb.p2.interfaces.contratos.Equipable;
import edu.upb.p2.interfaces.modelos.equipo.Armadura;

/**
 *
 * @author pipe22007
 */
public abstract class Personaje {
    private int nivel;
    private String nombre;
    private Equipable equipo;
    
    public Personaje(int nivel,String nombre){
        this.nivel=nivel;
        this.nombre=nombre;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Personaje(){
    nivel=0;
    nombre="No name";
    }
    public abstract void moverse();
    
    public void subirNivel(){
        nivel=nivel +1;
    }

    public Personaje(Equipable equipo) {
        this.equipo = equipo;
    }

    public void setEquipo(Armadura armadura) {
        this.equipo=equipo;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Equipable getEquipo() {
        return equipo;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
