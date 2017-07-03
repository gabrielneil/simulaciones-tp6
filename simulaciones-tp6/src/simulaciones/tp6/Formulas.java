/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaciones.tp6;

/**
 *
 * @author gabrielneil
 */
public class Formulas {

    public static double tiempoCompraTicket(float tiempoCompra, float random) {

        return (-tiempoCompra) * Math.log(1 - random) / 60;
    }

    //Exp negativa, devuelve en minutos
    public static double tiempoEntregaPedido(float tiempoCompra, float random) {
        return ((-tiempoCompra) * Math.log(1 - random));
    }

    //box-muller.
    //Tiempo de llegada entre clientes en minutos, 
    //recibe como parametro la media y la desviacion en segundos y los randoms para box muller
    //retorna el tiempo de llegada entre cliente en MINUTOS
    public static double llegadaCliente(float rnd1, float rnd2, float media, float desviacion) {
        return (((Math.sqrt(-2 * Math.log(rnd1)) * Math.cos(2 * Math.PI * rnd2)) * desviacion) + media) / 60;
    }

//    //devuelve en minutos
//    public double tiempoConsumicion(int a, int b, float rnd) {
//        return (a - b) + (rnd * ((a + b) - (a - b)));
//    }

    //devuelve en minutos
    public static double tiempoUtilizacionMesa(int a, int b, float rnd) {
        return (a - b) + (rnd * ((a + b) - (a - b)));
    }
    static double h = 0.001;
    public static double tiempoConsumicion(int valorT, float valorK, double h1) {
        h = h1;
        System.out.println("el valor que metió es"+h);
        double t0 = 0;
        double T = 0;
        double valorDiferencial = 0;
        double t1 = 0;
        double T1 = 0;
        do {
            t0 = t1;
            T = T1;
            valorDiferencial = valorK * 0.3 * (valorT * valorT);
            t1 = t0 + h;
            T1 = T + (h * valorDiferencial);
        } while (T1 < valorT);
        
        
        return t1*10;
    }

}
