package UEC;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates; 
    //Esses são os atributos privados do objeto Lutador, ou seja, suas características. Eles estão encapsulados (private), o que é um princípio da POO para proteger os dados e só permitir acessos controlados por métodos (getters/setters).

    public void apresentar () {
        System.out.println("-------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e ");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + " kg");
        System.out.println("Já ganhou " + this.getVitorias() + " lutas");
        System.out.println("perdeu " + this.getDerrotas());
        System.out.println("e empatou " + this.getEmpates());
    }
    //Imprime os dados do lutador de forma apresentável. Serve como exibição dos atributos de maneira amigável.

    public void status () {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias() + " vezes");
        System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
        System.out.println("Empatou: " + this.getEmpates() + " vezes");
    }
    //Mostra um resumo da categoria e das lutas ganhas, perdidas e empatadas. É como se fosse uma ficha de desempenho.

    public void ganharLuta () {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta () {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta () {
        this.setEmpates(this.getEmpates() + 1);
    }
    //Esses métodos atualizam o histórico de lutas. Cada um chama o setter adequado e incrementa o valor. É a forma segura de modificar os atributos encapsulados.

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //O construtor é o método chamado ao criar um novo objeto Lutador. Ele recebe todos os valores necessários e os atribui aos atributos do objeto.
    //Destaque: Usa this.setPeso(peso) e não this.peso = peso direto, pois o método setPeso() atualiza automaticamente a categoria do lutador com base no peso.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    //Ao alterar o peso, o método chama setCategoria() para garantir que a categoria seja atualizada corretamente.

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    // Esse método define a categoria do lutador com base no peso. Ele é privado, pois deve ser chamado apenas internamente, quando o peso for alterado.

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
