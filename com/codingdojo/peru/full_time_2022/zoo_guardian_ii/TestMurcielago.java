package com.codingdojo.peru.full_time_2022.zoo_guardian_ii;
/**
 * TestMurcielago
 */
public class TestMurcielago {
    public static void main(String[] args) {
         // Simulaciones de la aplicación
        
        // Prueba creación de instancia y de la clase
        Murcielago m = new Murcielago();
        
        // Prueba gorila arroja tres cosas
        System.out.println("\n----- Prueba murciélago ataca tres pueblos -----");
        m.atacarPueblo();
        m.atacarPueblo();
        m.atacarPueblo();
        
        // Prueba gorila come plátanos dos veces
        System.out.println("\n----- Prueba murciélago come humanos dos veces -----");
        m.comerHumanos();
        m.comerHumanos();

        // Prueba gorila trepa una vez
        System.out.println("\n----- Prueba murciélago vuela dos veces -----");
        m.volar();
        m.volar();
        
        // Prueba mostramos el nivel de energía del murciélago al final
        System.out.println("\n----- Prueba mostramos el nivel de energía del murciélago al final -----");
        System.out.println("Nivel de energía: " + m.getNivelDeEnergia());
    }
}