package com.jesusviloria.imc.dominio.puertos.salida;

import com.jesusviloria.imc.aplicacion.excepciones.ServidorRedException;
import com.jesusviloria.imc.dominio.vo.PuertoRed;

/**
 * Puerto de salida para el control de la infraestructura de red del servidor.
 * Recibe exclusivamente objetos de dominio.
 */
public interface ControladorServidorRedPort {
    void iniciar(PuertoRed puerto) throws ServidorRedException;

    void detener();

    boolean isActivo();

    PuertoRed getPuertoActual();
}
