// package variaveis_e_fluxo.src;

// public class TestaCondicional2 {
//   public static void main(String[] args) {
//     System.out.println("testando condicionais");
//     int idade = 16;
//     int quantidadePessoas = 3;
//     if (idade >= 18 ||quantidadePessoas >= 2 ) {     //IF sem chaves apenas uma instrução pertence a ele
//       System.out.println("seja bem vindo");
//     } else{
//       System.out.println("Infelizmente você não pode entrar");
//       }
//     }
//   }



//   //  Operador ou ||
//   //  Operador e &&



package variaveis_e_fluxo.src;

public class TestaCondicional2 {
  public static void main(String[] args) {
    System.out.println("testando condicionais");
    int idade = 20;
    int quantidadePessoas = 3;
    boolean acompanhado = quantidadePessoas >= 2;
    System.out.println("valor de acompanhado = " + acompanhado);
    if (idade >= 18 && acompanhado ) {
      System.out.println("seja bem vindo");
    } else{
      System.out.println("Infelizmente você não pode entrar");
      }
    }
  }


//  int não entra em boolean

