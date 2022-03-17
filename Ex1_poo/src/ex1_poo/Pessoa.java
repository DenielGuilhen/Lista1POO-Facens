
package ex1_poo;

public class Pessoa {
    
    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;
   

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        this.Sexo = sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }


   public String Imprimir(){
        return "CPF: " + getCPF() +
                "\nNome: " + getNome() +
               "\nSexo: " + getSexo() +
               "\nIdade: " + getIdade();
              
    }
    
}