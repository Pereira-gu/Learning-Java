public class Variavels {
    public static void main (String[] args[]){
/*
        Variaveis e Tipo de dados
        sintaxe:
             type variableName = value;
*/

//      #Números Inteiros
        byte a = 1; //8 bits so armazena numero entre: (- 128 a 127)
        short b = 32767; //16 so armazena numero entre: (-32768  a 32767)
        int c = 123; //32 bits so armazena numero entre: (-2,1 bilhões a 2,1 bilhões)
        long d = 232; //64 bits armazena números gigantescos (ex: bilhões de bilhões)

//      Números Decimais
        float e = 4.6f; //32 bits, NECESSARIO "f" no fim (4.6f) Precisão simples
        double f = 4.5123421; //64 bits, Alta Precisão, padrao para calculos cientificos e DINHEIRO

//      #Outros tipos
        char g = 'A'; //16 bits, Armazena um unico caractere ou simbolo
        boolean h = true; //1 bit, (true ou false) (1 ou 0)

//      #String
        String i = "Sequencia de caracteres"; //String é uma classe, não um type primitivo, armazena um sequencing de caracteres

/*
        #Constante
            Constantes Imutavel:
            adiciona final no inicio, se torna uma constante,
            somente leitura
*/
        final int myNum = 15;
//        myNum = 20;  // Error: cannot assign a value to final variable 'myNum'

    }
}
