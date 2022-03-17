package ex1_poo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String opt = "";
        Pessoa pessoa = null;
        String cpf, nome;
        char sexo;
        int idade;
        

        while(!opt.equals("3")){
            opt = JOptionPane.showInputDialog("1- Criar pessoa \n 2- Mostrar pessoa \n 3- Sair");

                if (opt == null){
                    System.exit(0);
                }

            switch(opt){
                case"1":
                    cpf = JOptionPane.showInputDialog("CPF:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    sexo = JOptionPane.showInputDialog("Insira seu sexo:").charAt(0);
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                    

                    pessoa = new Pessoa();
                    pessoa.setCPF(cpf);
                    pessoa.setNome(nome);
                    pessoa.setSexo(sexo);
                    pessoa.setIdade(idade);
                 
                    break;

                case"2":
                    if(pessoa != null){
                    JOptionPane.showMessageDialog(null,pessoa.Imprimir());
                   }
                    else{
                    JOptionPane.showMessageDialog(null, "Você precisa cadastrar a pessoa antes.","Erro", JOptionPane.ERROR_MESSAGE);
                   }
                    break;

                case"3":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }
}