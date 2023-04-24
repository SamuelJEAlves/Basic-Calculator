package cursodejava.introducao.test;

import cursodejava.introducao.domain.Calculadora;

import javax.swing.*;
import java.math.*;

public class Calculadora01 {
    public static void main(String[] args) {

            int menuOption = Integer.parseInt(JOptionPane.showInputDialog(null, "1 -> Adição\n" + "2 -> Subtração\n" + "3 -> Multiplicação\n" + "4 -> Divisão\n" + "5 -> Raiz quadrada\n" + "6 -> Potenciação\n" + "7 -> Fatorial\n" + "8 -> Sair do sistema\n" + "Escolha o número da operação desejada: "));

            Calculadora calculadora = new Calculadora();

            switch (menuOption) {
                case 1:
                    calculadora.somaDoisNumeros();
                    break;

                case 2:
                    calculadora.subtraiDoisNumeros();
                    break;

                case 3:
                    calculadora.multiplicaDoisNumeros();
                    break;

                case 4:
                    calculadora.divideDoisNumeros();
                    break;

                case 5:
                    calculadora.raizQuadrada();
                    break;

                case 6:
                    calculadora.potenciacao();
                    break;

                case 7:
                    calculadora.fatorial();
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
    }
}
//Criou o objeto da classe Calculadora e executou o seu método
//ARGUMENTOS: variáveis locais enviadas