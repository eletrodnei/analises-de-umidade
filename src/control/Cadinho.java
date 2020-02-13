/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.math.BigDecimal;

/**
 *
 * @author Rodnei
 */
public class Cadinho {
    private BigDecimal PesoA;
    private BigDecimal PesoB;
    private BigDecimal PesoC;
    private BigDecimal resultado;

    public BigDecimal getPesoA() {
        return PesoA;
    }

    public void setPesoA(BigDecimal PesoA) {
        this.PesoA = PesoA;
    }

    public BigDecimal getPesoB() {
        return PesoB;
    }

    public void setPesoB(BigDecimal PesoB) {
        this.PesoB = PesoB;
    }

    public BigDecimal getPesoC() {
        return PesoC;
    }

    public void setPesoC(BigDecimal PesoC) {
        this.PesoC = PesoC;
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }
    
    
    
public void  CalcularUmidade (BigDecimal PesoA,BigDecimal PesoB,BigDecimal PesoC){
   
    BigDecimal resultado = PesoA.subtract(PesoB);
    this.resultado = resultado;
}    
    
}
