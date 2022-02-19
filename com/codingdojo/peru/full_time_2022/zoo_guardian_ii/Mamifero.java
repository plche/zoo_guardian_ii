package com.codingdojo.peru.full_time_2022.zoo_guardian_ii;
/**
 * Mamifero
 */
class Mamifero {

    private int nivelDeEnergia;

    public Mamifero() {
        nivelDeEnergia = 100;
    }

    public int getNivelDeEnergia() {
        return nivelDeEnergia;
    }

    public void setNivelDeEnergia(int nivelDeEnergia) {
        this.nivelDeEnergia = nivelDeEnergia;
    }

    public int mostrarEnergia() {
        System.out.println("Nivel de Energía: " + nivelDeEnergia);
        return nivelDeEnergia;
    }
}