/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.tsi.ipli.servidorimc;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Rodrigo
 */
public class IMCServidor {
    public static void main(String[] args) {
        ImcService imcservice = new ImcService();
        String url = "http://localhost:8000/Imsc";
        System.out.println("imcService rodando:" + url); 
        Endpoint.publish(url, imcservice);   
    }
}
