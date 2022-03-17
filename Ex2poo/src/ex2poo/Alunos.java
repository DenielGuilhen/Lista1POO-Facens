package ex2poo;

public class Alunos {
    
    private String Ra;
    private String Nome;
    private float Ac1;
    private float Ac2;
    private float Ag;
    private float Af;

    public String getRa() {
        return Ra;
    }

    public void setRa(String ra) {
        this.Ra = ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public float getAc1() {
        return Ac1;
    }

    public void setAc1(float ac1) {
        this.Ac1 = ac1;
    }

    public float getAc2() {
        return Ac2;
    }

    public void setAc2(float ac2) {
        this.Ac2 = ac2;
    }

    public float getAg() {
        return Ag;
    }

    public void setAg(float ag) {
        this.Ag = ag;
    }

    public float getAf() {
        return Af;
    }

    public void setAf(float af) {
        this.Af = af;
    }

    public double calcularMedia(){
        return ((getAc1() * 0.15)+(getAc2() * 0.3)+(getAg() * 0.1)+(getAf() * 0.45));
    }

    public String verificarAprovacao(){
        if (calcularMedia()>=5){
            return "Aluno aprovado!";
        }
        else {
            return "Aluno reprovado.";
        }
    }

    public String Imprimir(){
        return "RA: " + getRa() +
                "\nNome: " + getNome() +
               "\nAC1: " + String.format("%.2f", getAc1()) +
               "\nAC2: " + String.format("%.2f", getAc2()) +
               "\nAG: " + String.format("%.2f", getAg()) +
               "\nAF: " + String.format("%.2f", getAf()) +
               "\nMedia: " + String.format("%.2f", calcularMedia()) +
               "\nSituação: " + verificarAprovacao();
    }   
}