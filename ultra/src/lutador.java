public class lutador {
    private String nome, nacionalidade, categoria;
    private double altura, peso;
    private int idade, vitorias, derrotas, empates;

    public lutador(String no, String na, double al, double pe, int id, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.altura = al;
        setPeso(pe);
        this. idade = id;
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    public void apresentar() {
        System.out.println("-------------------------------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("--------------------------------------------------");
    }



    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso " +  this.getCategoria());
        System.out.println("E tem:\n" + this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }



    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        peso = pe;
        this.setCategoria();
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Categoria inválida";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else{
            this.categoria = "Categoria inválida";
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

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
