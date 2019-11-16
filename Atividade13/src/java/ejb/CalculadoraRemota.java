
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

import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.Remote;

@Remote
public interface CalculadoraRemota {
    
    int somar(int a, int b) throws EJBException;
    int subtrair(int a, int b) throws EJBException;
    int multiplicar(int a, int b) throws EJBException;
    int dividir(int a, int b) throws EJBException;
}
