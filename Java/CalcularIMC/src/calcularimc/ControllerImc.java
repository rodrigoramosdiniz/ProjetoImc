/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author Rodrigo
 */
public class ControllerImc {

    private IMCJanela imc;

    private double peso, altura, resultado, resultadoFinal;

    public ControllerImc(IMCJanela imc) {
        this.imc = imc;
        InicializarBotaoImc();
    }

    DecimalFormat formato = new DecimalFormat("0.00");

    public void InicializarBotaoImc() {
        imc.getCampoBotaoIMC().addActionListener((ActionEvent e) -> {
            altura = Double.parseDouble(imc.getCampoAltura().getText());
            peso = Double.parseDouble(imc.getCampoPeso().getText());

            resultado = ControllerImc.getImc(altura, peso);

            if (resultado <= 24.5) {

            }

            imc.getCampoResultado().setText(String.valueOf(formato.format(resultado)));

            imc.getBotaoCampoLimpar().addActionListener((ActionEvent e1) -> {
                imc.getCampoAltura().setText("");
                imc.getCampoPeso().setText("");
                imc.getCampoResultado().setText("");
            });

        });

    }

    private static double getImc(double altura, double peso) {
        br.ifms.tsi.ipli.servidorimc.ImcServiceService service = new br.ifms.tsi.ipli.servidorimc.ImcServiceService();
        br.ifms.tsi.ipli.servidorimc.ImcService port = service.getImcServicePort();
        return port.getImc(altura, peso);
    }

}
