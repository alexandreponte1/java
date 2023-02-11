package variaveis_e_fluxo.src;
public class TestaConversao {
  public static void main(String[] args){
    double salario = 1270.5;
    int valor = (int )salario;  //casting tranformando o double em inteiro
    System.out.println(valor);

    // int pode guardar até 2bilhoes  32BitSet
    // long pode guardar acima disso
    // long numeroGrande = 324234234234234234234L; 64bits
    // short valorPequeno = 2323; 16bits
    // byte b = 127; 256
    double valor1 = 0.2;
    double valor2 = 0.1;
    double total = valor1 + valor2;

    // float pontoFlutuante = 3.14f ; 

    System.out.println(total);
  }
}


// int
// double
// long
// short

// idade = 30.0;
// System.out.println("A idade de Marcos é " + (int) idade + "!");

// Opção correta! Estamos fazendo o type cast no double que tem seu valor convertido para int. Desta forma não aparece a casa decimal.
