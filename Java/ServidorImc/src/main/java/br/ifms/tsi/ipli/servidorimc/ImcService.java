/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.tsi.ipli.servidorimc;

import java.text.DecimalFormat;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Rodrigo
 */

@WebService
public class ImcService {
    double resultado;
    
    @WebMethod
    public double getImc( @WebParam(name="altura") double altura,
                          @WebParam(name="peso") double peso
                           ){
    
        
        resultado = (peso)/(altura*altura);   
         
        return resultado;
  }
}
