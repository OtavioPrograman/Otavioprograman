/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavio_virgilio
 */
public class Leao extends Animal {
    public Leao(String gênero, String nome) {
        super(gênero, nome);
    }

    @Override
    public void andar() {
        System.out.println("Com as patas");
    }

    @Override
    public void falar() {
        System.out.println("aaarrrrrrrr");
    }
}

