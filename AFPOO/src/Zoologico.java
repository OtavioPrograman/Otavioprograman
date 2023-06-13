/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author otavio_virgilio
 */
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;
    private String endereco;
    private String nome;

    public Zoologico(String endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
        this.animais = new ArrayList<>();
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setAnimal(Animal animal) {
        animais.add(animal);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

