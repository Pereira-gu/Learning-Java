package pootraining;
//Classe mae
public class Ninja {
//    =========
//    Atributos
//    =========
    private String nome;
    private int idade;
    private String aldeia;
//    ============
//    Constructor
//    ===========
    public Ninja(String nome, int idade, String aldeia){
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

//    =================
//    Getters e Setters
//    =================

    public String getNome(){
        return nome;
    };

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    };

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getAldeia(){
        return aldeia;
    };

    public void setAldeia(String aldeia){
        this.aldeia = aldeia;
    }

//    =================
//    Metodo Global
//    =================

    public void atacar(){
        System.out.println(nome + ", Atacou!");
    }

    public void defender(){
        System.out.println(nome + ", Defendeu!");
    }

}
