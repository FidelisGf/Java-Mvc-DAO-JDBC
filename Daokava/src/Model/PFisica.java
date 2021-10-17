package Model;

public class PFisica extends Pessoa{
    private int idade;
    private int cpf;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    public PFisica(String nome, int idade, int cpf) {
        super(nome);
        this.idade = idade;
        this.cpf = cpf;
    }

    public PFisica() {

    }
    @Override
    public String toString() {
        return "Pessoa-Fisica{" +
                "Nome= " + getNome() +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}
