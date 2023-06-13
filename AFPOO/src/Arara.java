/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavio_virgilio
 */
public class Arara extends Animal {
    public Arara(String gênero, String nome) {
        super(gênero, nome);
    }

    @Override
    public void andar() {
        System.out.println("Voando");
    }

    @Override
    public void falar() {
        System.out.println("aaaahaaaarrr");
    }

    @Override
    public String toString() {
        return "Arara [gênero=" + gênero + ", nome=" + nome + "]";
    }
}


