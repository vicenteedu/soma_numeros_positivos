package org.example;

import javax.swing.JOptionPane;

public class Main {
    static void main() {
        int soma = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo ou -1 para sair"));

        while (n > 0){
            soma = soma + n;

            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo ou -1 para sair"));

        }
        JOptionPane.showMessageDialog(null,"A soma é " + soma);

    }
}
