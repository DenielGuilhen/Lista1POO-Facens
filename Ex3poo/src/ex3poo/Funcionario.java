package ex3poo;

public class Funcionario {

    private int Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QuantidadeHora;
    private float Salario;
    private float ValorDesconto;

    public int getCracha() {
        return Cracha;
    }

    public void setCracha(int cracha) {
        this.Cracha = cracha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public char getTipoVinculo() {
        return TipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.TipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float valorHora) {
        this.ValorHora = valorHora;
    }

    public float getQuantidadeHora() {
        return QuantidadeHora;
    }

    public void setQuantidadeHora(float quantidadeHora) {
        this.QuantidadeHora = quantidadeHora;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        this.Salario = salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.ValorDesconto = valorDesconto;
    }

    public void calcularSalario() {
        this.Salario = getValorHora() * getQuantidadeHora();
    }

    public float valorReceber() {
        return getSalario() - getValorDesconto();
    }

    public String Imprimir() {

        return "Cracha: " + getCracha()
                + "\nNome: " + getNome()
                + "\nTipo vinculo: " + getTipoVinculo()
                + "\nSalario: R$" + String.format("%.2f", this.getSalario())
                + "\nDesconto: R$" + String.format("%.2f", getValorDesconto())
                + "\nValor a receber: R$" + String.format("%.2f", valorReceber());
    }
}