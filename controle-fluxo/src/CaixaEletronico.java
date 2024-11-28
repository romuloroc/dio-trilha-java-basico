public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolitado = 22.0;

    if (valorSolitado < saldo) {
      saldo = saldo - valorSolitado;
      System.out.println("Novo saldo: " + saldo);
    } else {
      System.out.println("Saldo insuficiente");
    }
}
}
