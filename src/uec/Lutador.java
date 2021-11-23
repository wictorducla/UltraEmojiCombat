package uec;

public class Lutador {
	private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        //this.peso = peso;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

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
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else{
            this.categoria = "Invalido";
        }
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
    
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o Lutador: " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + "anos");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("");
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórioas");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
        System.out.println("");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
	
}
