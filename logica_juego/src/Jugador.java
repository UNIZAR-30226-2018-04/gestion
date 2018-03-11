/*
 * Autor: Crisan, Marius Sorin
 * Fecha: 11-03-18
 * Fichero: Clase jugador de la lógica del guiñote
 */

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    int id;
    List<Carta> cartasEnMano;
    int equipo;
    List<Carta> cartasGanadas;

    public Jugador(int id, List<Carta> cartasEnMano, int equipo) {
        this.id = id;
        this.cartasEnMano = cartasEnMano;
        if (equipo == 0 || equipo == 1){
            this.equipo = equipo;
        }
        this.cartasGanadas = new ArrayList<Carta>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Carta> getCartasEnMano() {
        return cartasEnMano;
    }

    public void setCartasEnMano(List<Carta> cartasEnMano) {
        this.cartasEnMano = cartasEnMano;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        if (equipo == 0 || equipo == 1){
            this.equipo = equipo;
        }
    }

    public List<Carta> getCartasGanadas() {
        return cartasGanadas;
    }

    public void setCartasGanadas(List<Carta> cartasGanadas) {
        this.cartasGanadas = cartasGanadas;
    }

    public void anyadirCartasGanadas(List<Carta> nuevasCartas){
        this.cartasGanadas.addAll(nuevasCartas);
    }
}
