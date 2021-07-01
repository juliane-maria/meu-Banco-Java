public class TesteMetodo {
  public static void main(String[] args) {
    Conta contaDoPaulo = new Conta();
    contaDoPaulo.saldo = 100;
    contaDoPaulo.deposita(50);
    System.out.println(contaDoPaulo.saldo);

    boolean conseguiuRetirar = contaDoPaulo.saca(200);
    System.out.println(contaDoPaulo.saldo);
    System.out.println(conseguiuRetirar);

    Conta contaDaMarcela = new Conta();
    contaDaMarcela.saldo = 1000;

    contaDaMarcela.transfere(200, contaDoPaulo);
    System.out.println(contaDaMarcela.saldo);

  }

}
