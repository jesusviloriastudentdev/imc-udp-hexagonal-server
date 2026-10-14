package com.jesusviloria.imc.adaptadores.red;

import com.jesusviloria.imc.dominio.enums.EstadoServidor;
import com.jesusviloria.imc.dominio.modelos.EventoServidor;

/**
 * Interfaz de observador para componentes interesados en los eventos y estados
 * del servidor.
 */
public interface ObservadorServidor {
  void onEvento(EventoServidor evento);

  void onCambioEstado(EstadoServidor nuevoEstado, int puerto);
}
