public class Typecasting {
    public static void main(String[] args){
        int meuInteiro = 9;
        double meuDouble = meuInteiro; // automatic casting: int to double

//      #Função de Alargamento de tamanho de type
        System.out.println(meuInteiro); // outputs 9
        System.out.println(meuDouble); // outputs 9.0

//      #Função de Estreitamento de tamanho de type
        double myDouble = 9.78d; //qnd for double pode ou n colocar d, (opcional)
        int myInt = (int) myDouble; //manual casting: double to int

        System.out.println(myDouble); //outputs 9.78
        System.out.println(myInt); //outputs 9

//       #Função int to string type
        int num = 10;
        String data = String.valueOf(num);
        System.out.println("The integer value is: " + num);
        System.out.println("The string value is: " + data);

    }
}
