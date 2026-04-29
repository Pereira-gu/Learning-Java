import java.util.Arrays;

 class Array {
    public static void main(String[] arg){
//  Arrays Definidos:
        String [] nomes = {"BMW", "Monza", "Mercedes"};
        System.out.println(Arrays.toString(nomes));

//        para alterar o valor de um elemento especifico:
        nomes[0] = "Opala";
        System.out.println(Arrays.toString(nomes));

//        para descobrir o tamanho de um array: .length

        System.out.println("O tamanho do array é: " + nomes.length);

//  Arrays vazios, com tamanhos definidos
        int [] num = new int[5];
        System.out.println("Array vazia: " + Arrays.toString(num));

//  adicionando valor ào array
        num[1] = 1;
        System.out.println("Array populada: " + Arrays.toString(num));

//      for que printa o indice e o valor do array
        for (int i = 0; i < num.length;i++) {
            System.out.println("indice: " + i + " | valor: " + num[i]);
        }
        System.out.println("=-=-=-");
//      soma de todos os valores de um array:
        num[0] = 2; //populando array
        num[2] = -12; //populando array
        num[3] = 20; //populando array
        num[4] = -2; //populando array

        int sum = num[0]; //variavel inicial
        System.out.println("valor sum inicial: "+sum);
        System.out.print("Printando o Array todo: ");
        System.out.println(Arrays.toString(num));

        for (int i = 1;i<num.length;i++){
            int a = sum;
            sum += num[i];
            System.out.println("calculo atual: " + a + " + " + num[i] + " = " + sum);
        }
        System.out.println("A soma de todos os valores do array(num) é: "+ sum);
//  outro modo de printar os valores dentro do array:

        System.out.println("=-=-=-");
        for (int i : num){
            System.out.print(i+", ");
        }
    }
}
