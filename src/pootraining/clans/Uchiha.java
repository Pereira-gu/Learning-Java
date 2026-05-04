package pootraining.clans;

import pootraining.Ninja;

public class Uchiha extends Ninja {

//  Objeto criado com o constructor
    public Uchiha(String nome, int idade, String aldeia) {super(nome, idade, aldeia);}

//  Metodo da classe especifica
    public void Sharingan() {System.out.println(getNome() + ", Sharingan ativado!");}

//  alterando o metodo glogal para classe especifica
    @Override
    public void atacar() {System.out.println(getNome() + " atacou com um Jutsu de Fogo!");}
}