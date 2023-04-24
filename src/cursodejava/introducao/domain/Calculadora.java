package cursodejava.introducao.domain;

import javax.swing.*;
import java.math.*;

public class Calculadora {

    public void somaDoisNumeros() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        JOptionPane.showMessageDialog(null,"O resultado é: " + (number1 + number2));
    }

    public void subtraiDoisNumeros() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        JOptionPane.showMessageDialog(null, "O resultado é: " + (number1 - number2));
    }

    public void multiplicaDoisNumeros() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        JOptionPane.showMessageDialog(null, "O resultado é: " + (number1 * number2));
    }

    public void divideDoisNumeros() {
        double number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        JOptionPane.showMessageDialog(null, "O resultado é: " + (number1 / number2));
    }

    public void raizQuadrada() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número: "));
        JOptionPane.showMessageDialog(null, "O resultado é: " + Math.sqrt(number1));
    }

    public void potenciacao() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o expoente: "));
        JOptionPane.showMessageDialog(null, "O resultado é: " + Math.pow(number1, number2));
    }

    public void fatorial() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número: "));
    }

}

//METODO: somaDoisNumeros
//PARAMETROS: variáveis locais recebidas
//Quando passa argumentos, na verdade ta passando uma cópia, independentes. A variável original não é alterada

