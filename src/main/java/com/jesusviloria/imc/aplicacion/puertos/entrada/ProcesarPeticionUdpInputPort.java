package com.jesusviloria.imc.aplicacion.puertos.entrada;

import com.jesusviloria.imc.aplicacion.dto.ProcesarPeticionUdpCommand;

/**
 * Puerto de entrada para procesar las peticiones recibidas por el listener UDP.
 */
public interface ProcesarPeticionUdpInputPort {
  void procesar(ProcesarPeticionUdpCommand comando);
}
