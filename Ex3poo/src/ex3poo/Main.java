package ex3poo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String opt = "";
        Funcionario funcionario = null;
        int cracha;
        String nome;
        char tipoVinculo;
        float valorHora, quantidadeHora, salario, valorDesconto;

        while (!opt.equals("4")) {
            opt = JOptionPane.showInputDialog("1- Criar funcionario\n 2- Mostrar folha de pagamento\n 3- Alterar remuneração\n 4- Sair");

            if (opt == null) {
                System.exit(0);
            }
            switch (opt) {
                case "1":
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Cracha:"));
                    nome = JOptionPane.showInputDialog("Nome:");
                    tipoVinculo = JOptionPane.showInputDialog("Vinculo").charAt(0);
                    funcionario = new Funcionario();
                    funcionario.setCracha(cracha);
                    funcionario.setNome(nome);
                    funcionario.setTipoVinculo(tipoVinculo);
                    if (("H").charAt(0) == funcionario.getTipoVinculo()) {
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor hora:"));
                        quantidadeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de horas:"));
                        valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Valor descontado:"));
                        funcionario.setValorDesconto(valorDesconto);
                        funcionario.setValorHora(valorHora);
                        funcionario.setQuantidadeHora(quantidadeHora);
                        funcionario.calcularSalario();
                    } else if (("N").charAt(0) == funcionario.getTipoVinculo()) {
                        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario:"));
                        funcionario.setSalario(salario);
                        valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Valor descontado:"));
                        funcionario.setValorDesconto(valorDesconto);

                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo vinculo não permitido.");
                    }
                    break;

                case "2":
                    if (funcionario != null) {
                        JOptionPane.showMessageDialog(null, funcionario.Imprimir());
                    } else {
                        JOptionPane.showMessageDialog(null, "Você precisa cadastrar o funcionario antes.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "3":
                    if (funcionario != null) {
                        if (("H").charAt(0) == funcionario.getTipoVinculo()) {
                            valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor hora:"));
                            quantidadeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade de Horas:"));
                            funcionario.setValorHora(valorHora);
                            funcionario.setQuantidadeHora(quantidadeHora);
                            funcionario.calcularSalario();
                        } else if (("N").charAt(0) == funcionario.getTipoVinculo()) {
                            salario = Float.parseFloat(JOptionPane.showInputDialog("Salario:"));
                            funcionario.setSalario(salario);

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Você precisa cadastrar o funcionario antes.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }

                    break;

                case "4":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida.", "Erro", JOptionPane.WARNING_MESSAGE);
                    break;
            }

        }

    }
}
