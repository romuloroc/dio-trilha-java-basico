public class ExemploForArray {
  public static void main(String[] args) {
    String alunos [] = {"João", "Maria", "José", "Pedro", "Ana"};

    // em arrays o indice começa em 0
    // Versão mais simples do for
    // for (int i = 0; i < alunos.length; i++) {
    //   System.out.println("O aluno no índice [" + i + "] é " + alunos[i]);
    // }

    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}
