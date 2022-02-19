package com.codingdojo.peru.full_time_2022.zoo_guardian_ii;
/**
 * Murcielago
 */
class Murcielago extends Mamifero {

    public Murcielago() {
        super();
        setNivelDeEnergia(300);
    }

    public void volar() {
        System.out.println("Murciélago despegando y emitiendo sonido");
        setNivelDeEnergia(getNivelDeEnergia() - 50);
    }

   public void comerHumanos() {
        System.out.println("Murciélago comiendose un... ya saben...");
        setNivelDeEnergia(getNivelDeEnergia() + 25);
    }

    public void atacarPueblo() {
        System.out.println("Sonido de pueblo en llamas...");
        setNivelDeEnergia(getNivelDeEnergia() - 100);
    }
}