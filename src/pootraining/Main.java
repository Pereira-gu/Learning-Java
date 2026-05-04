package pootraining;


import pootraining.clans.Uchiha;

public class Main {
    public static void main(String[] args){

//      Objeto criado com o constructor
        Ninja naruto = new Ninja("Naruto Uzimaki", 13, "Konoha");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 14, "Konoha");

//      Chamando os Metodos
        naruto.atacar();
        sasuke.atacar();
        sasuke.Sharingan();
    }
}
