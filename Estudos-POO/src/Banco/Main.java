package Banco;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Bruna");
        conta1.abrirConta("CC");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(2222);
        conta2.setDono("João");
        conta2.abrirConta("CP");

        conta1.depositar(300);
        conta2.depositar(500);

        conta1.sacar(150);
        conta2.sacar(200);

        conta1.fecharConta();

        conta1.estadoAtual();
        conta2.estadoAtual();
        
    }


}
