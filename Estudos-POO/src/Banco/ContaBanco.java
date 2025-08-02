package Banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("===================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo); 
        this.setStatus(true); // Métodos modificadores de acesso
        if (tipo.equals("CC")) { // Define tipo de conta
            this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) { // Verifica se a conta tem saldo
            // Se a conta tem saldo, não pode ser fechada
            System.out.println("Conta com dinheiro, não posso fechar.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, não posso fechar.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor); // Trabalhando diretamente com métodos especiais
            // Modificador de acesso para alterar o saldo
            System.out.println("Depósito realizado com sucesso." + this.getDono() + " agora tem " + this.getSaldo() + " reais."); 
        } else {
            System.out.println("Conta fechada, não posso depositar.");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso." + this.getDono() + " agora tem " + this.getSaldo() + " reais.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Conta fechada, não posso sacar.");
        }
    }

    public void pagarMensal() {
        int mensalidade = this.getTipo().equals("CC") ? 12 : 20; // Define uma nova variável mensalidade de acordo com o tipo de conta
         // Se for CC, mensalidade é 12, se for CP, mensalidade é 20
        if (this.isStatus()) {
            if (this.getSaldo() >= mensalidade) {
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("Mensalidade paga com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade.");
            }
        } else {
            System.out.println("Conta fechada, não posso pagar mensalidade.");
        }
    }

    // Métodos Especiais (Construtores, Getters e Setters)

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

}
