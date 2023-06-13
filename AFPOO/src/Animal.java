/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavio_virgilio
 */
public abstract class Animal {
    protected String gênero;
    protected String nome;

    public Animal(String gênero, String nome) {
        this.gênero = gênero;
        this.nome = nome;
    }

    public abstract void andar();

    public abstract void falar();
}

