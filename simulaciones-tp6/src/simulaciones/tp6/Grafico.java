/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaciones.tp6;

import Objects.Cliente;
import Objects.Servidor;
import front.Tabla;
import front.Tabla_clientes;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gneil
 */
public class Grafico {

    DefaultTableModel model;
    DefaultTableModel model_cliente;
    DefaultTableModel model_euler;
    Controller controller;
    Tabla_clientes t;
    Tabla_clientes tEuler;
    Tabla tabla;
    ArrayList<Cliente> lista = new ArrayList<>();
    double hasta = 0;

    public Grafico(ArrayList lista, Controller controller) {
        tabla = new Tabla(controller);
        t = new Tabla_clientes(controller);
        tEuler = new Tabla_clientes(controller);
        this.controller = controller;
        model_euler = (DefaultTableModel) tEuler._tblSimulacion.getModel();
        model = (DefaultTableModel) tabla._tblSimulacion.getModel();
        model_cliente = (DefaultTableModel) t._tblSimulacion.getModel();
        this.lista = lista;
    }

    public void hacerVisible() {
        tabla.setVisible(true);
    }

    public void primeraVuelta(String eventoInicio, double reloj, float rnd1TiempoLlegada, float rnd2TiempoLlegada, double tiempoLlegada, double proxLlegada, Servidor cajero, Servidor empleado1, Servidor empleado2) {
        model.addRow(new Object[]{
            eventoInicio, //Evento (0)
            reloj, //Reloj (1)
            rnd1TiempoLlegada, //Llegada cliente - RND1 (2)
            rnd2TiempoLlegada, //Llegada cliente - RND2 (3)
            tiempoLlegada, //Tiempo llegada cliente (4)
            tiempoLlegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            "", //Accion : mesa o a comprar (7)
            null, //Tiempo fin atención caja (8)
            null, //Tiempo espera pedido - RND (9)
            null, //Tiempo espera pedido (10)
            null, //Tiempo entrega de pedido (11)
            null, //Accion mesa: - RND (12)
            "", //Accion mesa (13)
            null, //Tiempo uso de mesa - RND (14)
            null, //Tiempo uso de mesa (15)
            null, //Tiempo fin uso mesa (16)
            null, //Tamaño consumicion - RND (17)
            null,//Tamaño consumicion(18)
            null, //Tiempo de consumicion (18)
            null, //Tiempo fin de consumicion (19)
            cajero.getEstado(),//Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(), //Empleado 2 - Cola (23)
            empleado2.getCola(), //Empleado 2 - Cola (24)
            0.0, //Tiempo de permanencia acumulado (25)
            0 //Cantidad clientes en cafeteria (26)
        });
        
    }

    public void entraMesa(String eventoLlegadaMesa, double reloj, float rnd1TiempoLlegada, float rnd2TiempoLlegada, double tiempoLlegada, double proxLlegada, float rndAccion, String eventoUtilizacionMesa, double minTerminaAtencionCaja, double minEntregaPedido, float rndTiempoUtilizacionMesa, double tiempoUtilizacionMesa, double tiempoFinUtilizacionMesa, double minTerminaConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes) {

        model.addRow(new Object[]{
            eventoLlegadaMesa, //Evento (0)
            reloj, //Reloj (1)
            rnd1TiempoLlegada, //Llegada cliente - RND1 (2)
            rnd2TiempoLlegada, //Llegada cliente - RND2 (3)
            tiempoLlegada, //Tiempo llegada cliente (4)
            proxLlegada, //Próxima Llegada cliente (5)
            rndAccion,//Acción - RND (6)
            eventoUtilizacionMesa, //Accion : mesa o a comprar (7)
            (minTerminaAtencionCaja == 0) ? null : minTerminaAtencionCaja,//Tiempo fin atención caja (8)
            null,//Tiempo espera pedido - RND (9)
            null, //Tiempo espera pedido (10)
            (minEntregaPedido == 0) ? null : minEntregaPedido,//Tiempo entrega de pedido(11)
            null,//Accion mesa: - RND (12)
            null, //Accion mesa (13)
            rndTiempoUtilizacionMesa,//Tiempo uso de mesa - RND (14)
            tiempoUtilizacionMesa,//Tiempo uso de mesa (15)
            tiempoFinUtilizacionMesa,//Tiempo fin uso mesa (16)
            null, //Tamaño consumicion - RND (17)
            null,//Tamaño consumicion (18)
            null,//Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion,//Tiempo fin de consumicion (19)
            cajero.getEstado(),//Cajero - Estado (20)
            cajero.getCola(),//Cajero - Cola (21)
            empleado1.getEstado(),//Empleado 1 - Estado (22)
            empleado2.getEstado(),//Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola(24)
            tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            cantClientes}); //Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void entraComprar(String eventoLlegadaComprar, double reloj, float rnd1TiempoLlegada, float rnd2TiempoLlegada, double tiempoLlegada, double proxLlegada, float rndAccion, String eventoCompra, double minimoTiempoFinAtencionCaja, double minTerminaEntrega, double minTerminaUsarMesa, double minTerminaConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes) {
        model.addRow(new Object[]{
            eventoLlegadaComprar, //Evento (0)
            reloj, //Reloj (1)
            rnd1TiempoLlegada, //Llegada cliente - RND1 (2)
            rnd2TiempoLlegada, //Llegada cliente - RND2 (3)
            tiempoLlegada, //Tiempo llegada cliente (4)
            proxLlegada, //Próxima Llegada cliente (5)
            rndAccion, //Acción - RND (6)
            eventoCompra, //Accion : mesa o a comprar (7)
            (minimoTiempoFinAtencionCaja == 0) ? null : minimoTiempoFinAtencionCaja, //Tiempo fin atención caja (8)
            null, //Tiempo espera pedido - RND (9)
            null, //Tiempo espera pedido (10)
            (minTerminaEntrega == 0) ? null : minTerminaEntrega,//Tiempo entrega de pedido(11)
            null, //Accion mesa: - RND (12)
            null, //Accion mesa (13)
            null,//Tiempo uso de mesa - RND (14)
            null, //Tiempo uso de mesa (15)
            (minTerminaUsarMesa == 0) ? null : minTerminaUsarMesa, //Tiempo fin uso mesa (16)
            null, //Tiempo consumicion - RND (17)
            null,//Tamaño consumicion (18)
            null, //Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion, //Tiempo fin de consumicion (19)
            cajero.getEstado(), //Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(),//Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola (24)
            tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            cantClientes}); //Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void finConsumicion(String eventoFinConsumicion, double reloj, double minProximaLLegada, double minTerminaAtencionCaja, double minTerminaEntrega, double minTerminaUsarMesa, double minTerminaConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes) {
        model.addRow(new Object[]{
            eventoFinConsumicion,//Evento (0)
            reloj, //Reloj (1)
            null,//Llegada cliente - RND1 (2)
            null,//Llegada cliente - RND2 (3)
            null,//Tiempo llegada cliente (4)
            (minProximaLLegada == 0) ? null : minProximaLLegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            null, //Accion : mesa o a comprar (7)
            (minTerminaAtencionCaja == 0) ? null : minTerminaAtencionCaja,//Tiempo fin atención caja (8)
            null,//Tiempo espera pedido - RND (9)
            null,//Tiempo espera pedido (10)
            (minTerminaEntrega == 0) ? null : minTerminaEntrega,//Tiempo entrega de pedido (11)
            null,//Accion mesa: - RND (12)
            null, //Accion mesa - se retira (13)
            null,//Tiempo uso de mesa - RND (14)
            null, //Tiempo uso de mesa (15)
            (minTerminaUsarMesa == 0) ? null : minTerminaUsarMesa,//Tiempo fin uso mesa (16)
            null, //Tiempo consumicion - RND (17)
            null,//Tamaño consumicion (18)
            null,//Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion, //Tiempo fin de consumicion (19)
            cajero.getEstado(),//Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(),//Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola (24)
            tiempoAcumulado, //Tiempo de permanencia (25)
            cantClientes});//Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void atencionEmpleados(String eventoFinAtencion, double reloj, float rndEspera, double minProxLlegada, double minTerminaAtencionCaja, double tiempoEntrega, double finTiempoEntrega, double minTerminaUsarMesa, double minTerminaConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes) {

        model.addRow(new Object[]{
            eventoFinAtencion,//Evento (0)
            reloj, //Reloj (1)
            null, //Llegada cliente - RND1 (2)
            null, //Llegada cliente - RND2 (3)
            null, //Tiempo llegada cliente (4)
            (minProxLlegada == 0) ? null : minProxLlegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            "",//Accion : mesa o a comprar (7)
            (minTerminaAtencionCaja == 0) ? null : minTerminaAtencionCaja, //Tiempo fin atención caja (8)
            rndEspera, //Tiempo espera pedido - RND (9)
            tiempoEntrega, //Tiempo espera pedido (10)
            finTiempoEntrega, //Tiempo entrega de pedido (11)
            null, //Accion mesa: - RND (12)
            null, //Accion mesa (13)
            null, //Tiempo uso de mesa - RND (14)
            null,//Tiempo uso de mesa (15)
            (minTerminaUsarMesa == 0) ? null : minTerminaUsarMesa, //Tiempo fin uso mesa (16)
            null, //Tiempo consumicion - RND (17)
            null,//Tamaño consumicion (18)
            null, //Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion,//Tiempo fin de consumicion (19)
            cajero.getEstado(), //Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(), //Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola (24)
            tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            cantClientes});//Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void aColaEmpleados(String eventoFinAtencion, double reloj, double minProximaLLegada, double minTerminaAtencionCaja, double minTerminaEntrega, double minTerminaUsarMesa, double minTerminaConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes) {
        model.addRow(new Object[]{
            eventoFinAtencion,//Evento (0)
            reloj, //Reloj (1)
            null, //Llegada cliente - RND1 (2)
            null, //Llegada cliente - RND2 (3)
            null, //Tiempo llegada cliente (4)
            (minProximaLLegada == 0) ? null : minProximaLLegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            "",//Accion : mesa o a comprar (7)
            null, //Tiempo fin atención caja (8)
            null, //Tiempo espera pedido - RND (9)
            null, //Tiempo espera pedido (10)
            (minTerminaEntrega == 0) ? null : minTerminaEntrega, //Tiempo entrega de pedido (11)
            null, //Accion mesa: - RND (12)
            null, //Accion mesa (13)
            null, //Tiempo uso de mesa - RND (14)
            null,//Tiempo uso de mesa (15)
            (minTerminaUsarMesa == 0) ? null : minTerminaUsarMesa, //Tiempo fin uso mesa (16)
            null, //Tiempo consumicion - RND (17)
            null,//Tamaño consumicion (18)
            null, //Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion,//Tiempo fin de consumicion (19)
            cajero.getEstado(), //Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(), //Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola (24)
            tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            cantClientes});//Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void comproYSeRetira(String eventoFinAtencion, double reloj, double minProximaLLegada, double minTerminaAtencionCaja, double minTerminaEntrega, float rndAccion, double minTerminaUsarMesa, double minTerminaConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes) {
        model.addRow(new Object[]{
            eventoFinAtencion,//Evento (0)
            reloj, //Reloj (1)
            null,//Llegada cliente - RND1 (2)
            null,//Llegada cliente - RND2 (3)
            null,//Tiempo llegada cliente (4)
            (minProximaLLegada == 0) ? null : minProximaLLegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            null, //Accion : mesa o a comprar (7)
            (minTerminaAtencionCaja == 0) ? null : minTerminaAtencionCaja,//Tiempo fin atención caja (8)
            null,//Tiempo espera pedido - RND (9)
            null,//Tiempo espera pedido (10)
            (minTerminaEntrega == 0) ? null : minTerminaEntrega,//Tiempo entrega de pedido (11)
            rndAccion, //Accion mesa: - RND (12)
            "Se retira",//Accion mesa (13)
            null, //Tiempo uso de mesa - RND(14)
            null,//Tiempo uso mesa (15)
            (minTerminaUsarMesa == 0) ? null : minTerminaUsarMesa,//Tiempo fin uso mesa (16)
            null, //Tiempo consumicion - RND (17)
            null,//Tamaño consumicion (18)
            null,//Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion, //Tiempo fin de consumicion (19)
            cajero.getEstado(),//Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(),//Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola (24)
            tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            cantClientes});//Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void noComioYUsoMesa(String eventoFinMesa, double reloj, double minProximaLLegada, double minTerminaAtencionCaja, double minTerminaEntrega, double minTerminaConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes) {
        model.addRow(new Object[]{
            eventoFinMesa,//Evento (0)
            reloj, //Reloj (1)
            null,//Llegada cliente - RND1 (2)
            null,//Llegada cliente - RND2 (3)
            null,//Tiempo llegada cliente (4)
            (minProximaLLegada == 0) ? null : minProximaLLegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            null, //Accion : mesa o a comprar (7)
            (minTerminaAtencionCaja == 0) ? null : minTerminaAtencionCaja,//Tiempo fin atención caja (8)
            null,//Tiempo espera pedido - RND (9)
            null,//Tiempo espera pedido (10)
            (minTerminaEntrega == 0) ? null : minTerminaEntrega,//Tiempo entrega de pedido (11)
            null,//Accion mesa: - RND (12)
            null, //Accion mesa - se retira (13)
            null,//Tiempo uso de mesa - RND (14)
            null, //Tiempo uso de mesa (15)
            null,//Tiempo fin uso mesa (16)
            null, //Tiempo consumicion - RND (17)
            null,//Tamaño consumicion (18)
            null,//Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion, //Tiempo fin de consumicion (19)
            cajero.getEstado(),//Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(),//Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola (24)
            tiempoAcumulado, //Tiempo de permanencia (25)
            cantClientes});//Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void comproYSeSienta(String eventoEntregaPedido, double reloj, double minProximaLLegada, double minTerminaAtencionCaja, double minTerminaEntrega, float rndAccion, String consumiendo, float rndTiempoConsumicion, double tiempoConsumicion, double finConsumicion, Servidor cajero, Servidor empleado1, Servidor empleado2, double tiempoAcumulado, int cantClientes, int valorT) {
        model.addRow(new Object[]{
            eventoEntregaPedido,//Evento (0)
            reloj, //Reloj (1)
            null,//Llegada cliente - RND1 (2)
            null,//Llegada cliente - RND2 (3)
            null,//Tiempo llegada cliente (4)
            (minProximaLLegada == 0) ? null : minProximaLLegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            null, //Accion : mesa o a comprar (7)
            (minTerminaAtencionCaja == 0) ? null : minTerminaAtencionCaja,//Tiempo fin atención caja (8)
            null,//Tiempo espera pedido - RND (9)
            null,//Tiempo espera pedido (10)
            (minTerminaEntrega == 0) ? null : minTerminaEntrega,//Tiempo entrega de pedido (11)
            rndAccion,//Accion mesa: - RND (12)
            consumiendo,//Accion mesa (13)
            null, //Tiempo uso de mesa - RND (14)
            null, //Tiempo uso mesa (15)
            null, //Tiempo fin uso mesa (16)
            rndTiempoConsumicion, //Tiempo consumicion - RND (17)
            valorT,//Tamaño consumicion (18)
            tiempoConsumicion,//Tiempo de consumicion (18)
            finConsumicion, //Tiempo fin de consumicion (19)
            cajero.getEstado(),//Cajero - Estado (20)
            cajero.getCola(), //Cajero - Cola (21)
            empleado1.getEstado(), //Empleado 1 - Estado (22)
            empleado2.getEstado(),//Empleado 2 - Estado (23)
            empleado2.getCola(),//Empleado 2 - Cola (24)
            tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            cantClientes});//Cantidad clientes en cafeteria (26)
        cargaClientes();
    }

    public void tiempoPermanencia(BigDecimal resultado) {
        tabla.setResultado(resultado);
    }

    public void mostrarClientes() {
        t.setVisible(true);
    }

    public void mostrarEuler(int valorT1, int valorT, float valorK, double h1) {
        tEuler.setVisible(true);
        calcularEuler(valorT1, valorT, valorK, h1);

    }

    String arreglo[];

    public void cargaClientes() {
        int cantidadClientes = controller.mostrarCantidadClientes();
        arreglo = new String[3 * cantidadClientes];

        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int suma = i;
            arreglo[suma] = "Estado (" + contador + ")";
            suma++;
            arreglo[suma] = "Hora Llegada (" + contador + ")";
            suma++;
            if (suma > 3 * cantidadClientes) {
                return;
            }
            arreglo[suma] = "Hora Partida (" + contador + ")";
            i = suma;
            contador++;
        }

        for (int i = 0; i < lista.size(); i++) {
            int posicion = lista.get(i).getPosicion();
            arreglo[(posicion * 3)] = "Estado (" + posicion + ")";
            arreglo[(posicion * 3) + 1] = "Hora Llegada (" + posicion + ")";
            arreglo[(posicion * 3) + 2] = "Hora Partida (" + posicion + ")";
        }
        model_cliente.setColumnIdentifiers(arreglo);

        Object valoresClientes[] = new Object[3 * cantidadClientes];
        for (int i = 0; i < lista.size(); i++) {
            int posicion = lista.get(i).getPosicion();
            valoresClientes[(posicion * 3)] = lista.get(i).getEstado();
            valoresClientes[(posicion * 3) + 1] = lista.get(i).getHoraLlegada();
            valoresClientes[(posicion * 3) + 2] = (lista.get(i).getHoraPartida() == -1) ? null : lista.get(i).getHoraPartida();
        }
        model_cliente.addRow(valoresClientes);
    }

    public void buscarLosMayores() {
        double menorEnCaja = 0;
        for (int i = 1; i < model.getRowCount(); i++) {
            //double value = Double.parseDouble(String.valueOf(model.getValueAt(i, 8)));
            if (model.getValueAt(i, 8) != null) {
                if (menorEnCaja == 0 || menorEnCaja > (double) model.getValueAt(i, 8)) {
                    double value = (double) model.getValueAt(i, 8);
                    System.out.println("Entro con valor " + value);
                }
            }
        }
    }

    static double h;

    private void calcularEuler(int valorT1, int valorT, float valorK, double h1) {
        h = h1;
        //System.out.println("el valor que metió es" + h);
        double t0 = 0;
        double T = 0;
        double valorDiferencial = 0;
        double t1 = 0;
        double T1 = 0;

        String[] columna = {"t", "T", "dT/dt", "t+1", "T(t+1)", ""};
        Object[] filas = {null, null, null, t1, T1, "PARA 50"};
        model_euler.setColumnIdentifiers(columna);
        model_euler.addRow(filas);
        do {
            t0 = t1;
            T = T1;
            valorDiferencial = valorK * 0.3 * (valorT * valorT);
            t1 = t0 + h;
            T1 = T + (h * valorDiferencial);
            Object[] filas1 = {t0, T, valorDiferencial, t1, T1};
            model_euler.addRow(filas1);
        } while (T1 < valorT);
        Object[] filas2 = {t1, T1, null, null, null};
        model_euler.addRow(filas2);

        Object[] hueco = {"//////////", "//////////", "//////////", "//////////", "//////////"};
        model_euler.addRow(hueco);
        model_euler.addRow(hueco);
        model_euler.addRow(hueco);

        t0 = 0;
        T = 0;
        valorDiferencial = 0;
        t1 = 0;
        T1 = 0;
        Object[] filas12 = {null, null, null, t1, T1, "PARA 20"};
        model_euler.addRow(filas12);
        do {
            t0 = t1;
            T = T1;
            valorDiferencial = valorK * 0.3 * (valorT1 * valorT1);
            t1 = t0 + h;
            T1 = T + (h * valorDiferencial);
            Object[] filas1 = {t0, T, valorDiferencial, t1, T1};
            model_euler.addRow(filas1);
        } while (T1 < valorT1);
        Object[] filas23 = {t1, T1, null, null, null};
        model_euler.addRow(filas23);
    }
    
    
    
    
    
      String evento = ""; //Evento (0)
           double reloj = 0; //Reloj (1)
            float rnd1TiempoLlegada = 0; //Llegada cliente - RND1 (2)
            float rnd2TiempoLlegada = 0; //Llegada cliente - RND2 (3)
            double tiempoLlegada = 0; //Tiempo llegada cliente (4)
            double proxLlegada = 0; //Próxima Llegada cliente (5)
            float rndAccion = 0; //Acción - RND (6)
            String eventoCompra = ""; //Accion : mesa o a comprar (7)
            double minimoTiempoFinAtencionCaja = 0; //Tiempo fin atención caja (8)
            float rndEsperaPedido = 0; //Tiempo espera pedido - RND (9)
            double tiempoEsperaPedido = 0; //Tiempo espera pedido (10)
            double finEsperaPedido = 0;//Tiempo entrega de pedido(11)
            float rndAccionMesa = 0; //Accion mesa: - RND (12)
            String accion = ""; //Accion mesa (13)
            float rndTiempoUsoMesa = 0;//Tiempo uso de mesa - RND (14)
            double tiempoUsoMesa = 0; //Tiempo uso de mesa (15)
            double minTerminaUsarMesa = 0; //Tiempo fin uso mesa (16)
            float rndTiempoConsumicion = 0; //Tiempo consumicion - RND (17)
            int tamañoConsumicion = 0;//Tamaño consumicion (18)
            double finTiempoConsumicion = 0; //Tiempo de consumicion (18)
            double minTerminaConsumicion = 0; //Tiempo fin de consumicion (19)
            Servidor cajero; //Cajero - Estado (20)
            Servidor Empleado1; //Empleado 1 - Estado (22)
            Servidor Empleado2; //Empleado 1 - Estado (22)//Empleado 2 - Estado (23)
            double tiempoAcumulado = 0; //Tiempo de permanencia acumulado(25)
            int cantClientes = 0; //Cantidad clientes en cafeteria (26)
    
    
    public void ultimaFila(String evento1, //Evento (0)
           double reloj1, //Reloj (1)
            float rnd1TiempoLlegada1, //Llegada cliente - RND1 (2)
            float rnd2TiempoLlegada1, //Llegada cliente - RND2 (3)
            double tiempoLlegada1, //Tiempo llegada cliente (4)
            double proxLlegada1, //Próxima Llegada cliente (5)
            float rndAccion1, //Acción - RND (6)
            String eventoCompra1, //Accion : mesa o a comprar (7)
            double minimoTiempoFinAtencionCaja1, //Tiempo fin atención caja (8)
            float rndEsperaPedido1, //Tiempo espera pedido - RND (9)
            double tiempoEsperaPedido1, //Tiempo espera pedido (10)
            double finEsperaPedido1,//Tiempo entrega de pedido(11)
            float rndAccionMesa1, //Accion mesa: - RND (12)
            String accion1, //Accion mesa (13)
            float rndTiempoUsoMesa1,//Tiempo uso de mesa - RND (14)
            double tiempoUsoMesa1, //Tiempo uso de mesa (15)
            double minTerminaUsarMesa1, //Tiempo fin uso mesa (16)
            float rndTiempoConsumicion1, //Tiempo consumicion - RND (17)
            int tamañoConsumicion1,//Tamaño consumicion (18)
            double finTiempoConsumicion1, //Tiempo de consumicion (18)
            double minTerminaConsumicion1, //Tiempo fin de consumicion (19)
            Servidor cajero1, //Cajero - Estado (20)
            Servidor Empleado11, //Empleado 1 - Estado (22)
            Servidor Empleado21, //Empleado 2 - Estado (22)
            double tiempoAcumulado1, //Tiempo de permanencia acumulado(25)
            int cantClientes1){
        
        if (reloj1<hasta) {
          evento = evento1; //Evento (0)
            reloj = reloj1; //Reloj (1)
         rnd1TiempoLlegada = rnd1TiempoLlegada1; //Llegada cliente - RND1 (2)
         rnd2TiempoLlegada = rnd2TiempoLlegada1; //Llegada cliente - RND2 (3)
         tiempoLlegada = tiempoLlegada1; //Tiempo llegada cliente (4)
         proxLlegada = proxLlegada1; //Próxima Llegada cliente (5)
         rndAccion = rndAccion1; //Acción - RND (6)
          eventoCompra = eventoCompra1; //Accion : mesa o a comprar (7)
         minimoTiempoFinAtencionCaja = minimoTiempoFinAtencionCaja1; //Tiempo fin atención caja (8)
         rndEsperaPedido = rndEsperaPedido1; //Tiempo espera pedido - RND (9)
         tiempoEsperaPedido = tiempoEsperaPedido1; //Tiempo espera pedido (10)
         finEsperaPedido = finEsperaPedido1;//Tiempo entrega de pedido(11)
         rndAccionMesa = rndAccionMesa1; //Accion mesa: - RND (12)
          accion = accion1; //Accion mesa (13)
         rndTiempoUsoMesa = rndTiempoUsoMesa1;//Tiempo uso de mesa - RND (14)
         tiempoUsoMesa = tiempoUsoMesa1; //Tiempo uso de mesa (15)
         minTerminaUsarMesa = minTerminaUsarMesa1; //Tiempo fin uso mesa (16)
         rndTiempoConsumicion = rndTiempoConsumicion1; //Tiempo consumicion - RND (17)
         tamañoConsumicion = tamañoConsumicion1;//Tamaño consumicion (18)
         finTiempoConsumicion = finTiempoConsumicion1; //Tiempo de consumicion (18)
         minTerminaConsumicion = minTerminaConsumicion1; //Tiempo fin de consumicion (19)
          cajero = cajero1; //Cajero - Estado (20)
          Empleado1 = Empleado11; //Empleado 1 - Estado (22)
          Empleado2 = Empleado21; //Empleado 1 - Estado (22)//Empleado 2 - Estado (23)
         tiempoAcumulado = tiempoAcumulado1; //Tiempo de permanencia acumulado(25)
         cantClientes = cantClientes1; //Cantidad clientes en cafeteria (26)
         
        }
    }
    
    
    
     public void impresionUltima() {
         
        model.addRow(new Object[]{
            evento, //Evento (0)
            reloj, //Reloj (1)
            (rnd1TiempoLlegada == 0)? null : rnd1TiempoLlegada, //Llegada cliente - RND1 (2)
            (rnd2TiempoLlegada == 0)? null : rnd2TiempoLlegada, //Llegada cliente - RND2 (3)
            (tiempoLlegada == 0)? null:tiempoLlegada, //Tiempo llegada cliente (4)
            (proxLlegada==0)?null:proxLlegada, //Próxima Llegada cliente (5)
            (rndAccion ==0)?null:rndAccion, //Acción - RND (6)
            (eventoCompra == "")? null:eventoCompra, //Accion : mesa o a comprar (7)
            (minimoTiempoFinAtencionCaja == 0) ? null : minimoTiempoFinAtencionCaja, //Tiempo fin atención caja (8)
            (rndEsperaPedido == 0)? null : rndEsperaPedido, //Tiempo espera pedido - RND (9)
            (tiempoEsperaPedido ==0)? null : tiempoEsperaPedido, //Tiempo espera pedido (10)
            (finEsperaPedido == 0) ? null : finEsperaPedido,//Tiempo entrega de pedido(11)
            (rndAccionMesa ==0)? null : rndAccionMesa, //Accion mesa: - RND (12)
            (accion == "")?null:accion, //Accion mesa (13)
            (rndTiempoUsoMesa == 0)? null:rndTiempoUsoMesa,//Tiempo uso de mesa - RND (14)
            (tiempoUsoMesa == 0)? null: tiempoUsoMesa, //Tiempo uso de mesa (15)
            (minTerminaUsarMesa == 0) ? null : minTerminaUsarMesa, //Tiempo fin uso mesa (16)
            (rndTiempoConsumicion ==0)? null : rndTiempoConsumicion, //Tiempo consumicion - RND (17)
            (tamañoConsumicion == 0)? null : tamañoConsumicion,//Tamaño consumicion (18)
            (finTiempoConsumicion == 0)? null :finTiempoConsumicion, //Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion, //Tiempo fin de consumicion (19)
            (cajero ==null)?null:cajero.getEstado(), //Cajero - Estado (20)
            (cajero ==null)?null:cajero.getCola(), //Cajero - Cola (21)
            (Empleado1 == null)? null: Empleado1.getEstado(), //Empleado 1 - Estado (22)
            (Empleado2 == null)? null: Empleado2.getEstado(),//Empleado 2 - Estado (23)
            (Empleado2 == null)? null: Empleado2.getCola(),//Empleado 2 - Cola (24)
            (tiempoAcumulado == 0)? null : tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            (cantClientes == 0)? null :cantClientes}); //Cantidad clientes en cafeteria (26)
        cargaClientes();
       
        model.addRow(new Object[]{
            "FIN SIMULACIÓN", //Evento (0)
            null, //Reloj (1)
            null, //Llegada cliente - RND1 (2)
            null, //Llegada cliente - RND2 (3)
            null, //Tiempo llegada cliente (4)
            (proxLlegada==0)?null:proxLlegada, //Próxima Llegada cliente (5)
            null, //Acción - RND (6)
            null, //Accion : mesa o a comprar (7)
            (minimoTiempoFinAtencionCaja == 0) ? null : minimoTiempoFinAtencionCaja, //Tiempo fin atención caja (8)
            null, //Tiempo espera pedido - RND (9)
            null, //Tiempo espera pedido (10)
            (finEsperaPedido == 0) ? null : finEsperaPedido,//Tiempo entrega de pedido(11)
            null, //Accion mesa: - RND (12)
            null, //Accion mesa (13)
            null,//Tiempo uso de mesa - RND (14)
            null, //Tiempo uso de mesa (15)
            (minTerminaUsarMesa == 0) ? null : minTerminaUsarMesa, //Tiempo fin uso mesa (16)
            null, //Tiempo consumicion - RND (17)
            null,//Tamaño consumicion (18)
           null, //Tiempo de consumicion (18)
            (minTerminaConsumicion == 0) ? null : minTerminaConsumicion, //Tiempo fin de consumicion (19)
            (cajero ==null)?null:cajero.getEstado(), //Cajero - Estado (20)
            (cajero ==null)?null:cajero.getCola(), //Cajero - Cola (21)
            (Empleado1 == null)? null: Empleado1.getEstado(), //Empleado 1 - Estado (22)
            (Empleado2 == null)? null: Empleado2.getEstado(),//Empleado 2 - Estado (23)
            (Empleado2 == null)? null: Empleado2.getCola(),//Empleado 2 - Cola (24)
            (tiempoAcumulado == 0)? null : tiempoAcumulado, //Tiempo de permanencia acumulado(25)
            (cantClientes == 0)? null :cantClientes});
        
     }
     
     public void setHasta(double hasta){
     this.hasta = hasta;
     }
     
    public void pintarMenores(){
    
    }
}
