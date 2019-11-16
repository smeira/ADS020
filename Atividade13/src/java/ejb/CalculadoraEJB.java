/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samanta
 */
package ejb;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(CalculadoraRemota.class)
public class CalculadoraEJB implements CalculadoraRemota{

    public CalculadoraEJB()throws EJBException {
    }

    @Override
    public int somar(int a, int b) throws EJBException {
        int result = a + b;

        return result;
    }

    @Override
    public int subtrair(int a, int b) throws EJBException {
        int result = a - b;

        return result;
    }

    @Override
    public int multiplicar(int a, int b) throws EJBException {
        int result = a * b;

        return result;
    }

    @Override
    public int dividir(int a, int b) throws EJBException {
       int result = a / b;

        return result;
    }
    
    
}
