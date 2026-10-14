package com.jesusviloria.imc.aplicacion.mapper;

import com.jesusviloria.imc.aplicacion.dto.ProcesarPeticionUdpCommand;
import com.jesusviloria.imc.aplicacion.excepciones.ComandoInvalidoException;
import com.jesusviloria.imc.dominio.vo.Destinatario;
import java.util.Objects;

/**
 * Mapper de la capa de aplicación. Responsabilidad única: Convertir datos de
 * comandos de petición a
 * objetos de valor del dominio.
 */
public final class PeticionMapper {

  public Destinatario toDestinatario(final ProcesarPeticionUdpCommand comando) {
    if (Objects.isNull(comando)) {
      throw new ComandoInvalidoException("El comando de petición no puede ser nulo.");
    }
    return new Destinatario(comando.ipCliente(), comando.puertoCliente());
  }
}
