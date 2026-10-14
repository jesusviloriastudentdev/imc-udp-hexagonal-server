package com.jesusviloria.imc.aplicacion.puertos.entrada;

import com.jesusviloria.imc.aplicacion.dto.CalcularImcCommand;
import com.jesusviloria.imc.aplicacion.dto.ResultadoImcDto;

/** Puerto de entrada (Caso de Uso) para el cálculo de IMC. */
public interface CalcularImcInputPort {
  ResultadoImcDto calcular(CalcularImcCommand comando);
}
