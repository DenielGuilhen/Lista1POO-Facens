package ex2poo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String opt = "";
        Alunos aluno = null;
        String ra, nome;
        float ac1, ac2, ag, af;

        while(!opt.equals("3")){
            opt = JOptionPane.showInputDialog("1- Criar aluno\n 2- Mostrar aluno\n 3- Sair");

                if (opt == null){
                    System.exit(0);
                }

            switch(opt){
                case"1":
                    ra = JOptionPane.showInputDialog("RA:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog("Nota AC1:"));
                    ac2 = Float.parseFloat(JOptionPane.showInputDialog("Nota AC2:"));
                    ag = Float.parseFloat(JOptionPane.showInputDialog("Nota AG:"));
                    af = Float.parseFloat(JOptionPane.showInputDialog("Nota AF:"));

                    aluno = new Alunos();
                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setAc1(ac1);
                    aluno.setAc2(ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                    break;

                case"2":
                    if(aluno != null){
                    JOptionPane.showMessageDialog(null,aluno.Imprimir());
                   }
                    else{
                    JOptionPane.showMessageDialog(null, "Você precisa cadastrar o aluno antes.","Erro", JOptionPane.ERROR_MESSAGE);
                   }
                    break;

                case"3":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida.", "Erro", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }
}