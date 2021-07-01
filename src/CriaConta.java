import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class CriaConta {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 200;
    primeiraConta.saldo += 100;
    System.out.println(primeiraConta.saldo);

    // Conta primeiraAgencia = new Conta();
    // primeiraAgencia.agencia = 15;
    // System.out.println(primeiraAgencia.agencia);

    // Conta nomeTitular = new Conta();
    // nomeTitular.titular = "juliane maria";
    // System.out.println(nomeTitular.titular);

    // Conta primeiroNumero = new Conta();
    // primeiroNumero.numero = 2222;
    // System.out.println(primeiroNumero.numero);

    // Conta segundaConta = primeiraConta;
    // segundaConta.saldo = 50;
    // System.out.println(segundaConta.saldo);
  }

}
