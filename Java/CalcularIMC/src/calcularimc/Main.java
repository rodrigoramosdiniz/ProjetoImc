/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Rodrigo
 */
public class Main {

    public static void main(String[] args) {
        IMCJanela view = new IMCJanela();
        JFrame janela = new JFrame();

        janela.setTitle("Minha Calculadora");
        janela.setSize(430, 500);

        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.add(view);
        janela.setVisible(true);

        ControllerImc ctl = new ControllerImc(view);

    }
}
