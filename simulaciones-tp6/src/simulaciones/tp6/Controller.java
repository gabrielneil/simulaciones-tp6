/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaciones.tp6;

import front.CargaDatos;
import front.CargaTiempos;

/**
 *
 * @author gabrielneil
 */
public class Controller {

    private static Controller controller;
    CargaDatos cargaDatos;
    CargaTiempos cargaTiempos;
    Calculator calculator;

    public Controller() {
        calculator = new Calculator(this);
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        } else {
        }

        return controller;
    }

    public void cargaDatos() {
        cargaDatos = new CargaDatos(this);
    }
    
    public CargaDatos getCargaDatos(){
        return cargaDatos;
    }

    public void valoresCargaTiempos(int tiempoTicket, int tiempoEspera, 
            int tiempoConsumicion1, int tiempoConsumicion2, 
            int tiempoUtilizacionMesa1, int tiempoUtilizacionMesa2) {
        calculator.cargaTiempos(tiempoTicket, tiempoEspera, tiempoConsumicion1, 
                                  tiempoConsumicion2, tiempoUtilizacionMesa1, tiempoUtilizacionMesa2);
    }

    public void valoresCargaDatos(int media, int desviacion, int entranAComprar, 
            int entranAMesa, int sientaEnMesa, int seRetira, int desde, int hasta, float k, double h) {
        calculator.cargaDatos(media, desviacion, entranAComprar, entranAMesa, sientaEnMesa, seRetira, desde, hasta, k, h);
    }

    public void simulacion() {
        calculator.initSimulacion();
    }

    public void mostrarClientes() {
       calculator.mostrarClientes();
    }
    
    public void mostrarEuler() {
       calculator.mostrarEuler();
    }
    public int mostrarCantidadClientes(){
        return calculator.cantClientes();
    }

}
