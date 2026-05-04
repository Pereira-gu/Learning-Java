package pootraining;


public class Main {
    public static void main(String[] args){

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 13;
        naruto.aldeia = "Konoha";
//      naruto.Sharingan();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 14;
        sasuke.aldeia = "Konoha";
        sasuke.Sharingan();
    }
}
