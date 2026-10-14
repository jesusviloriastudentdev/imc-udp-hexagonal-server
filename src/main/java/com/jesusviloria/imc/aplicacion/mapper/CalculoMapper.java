package com.jesusviloria.imc.aplicacion.mapper;

import com.jesusviloria.imc.aplicacion.dto.CalcularImcCommand;
import com.jesusviloria.imc.aplicacion.dto.ResultadoImcDto;
import com.jesusviloria.imc.aplicacion.excepciones.ComandoInvalidoException;
import com.jesusviloria.imc.dominio.modelos.Calculo;
import com.jesusviloria.imc.dominio.modelos.Resultado;
import com.jesusviloria.imc.dominio.vo.Altura;
import com.jesusviloria.imc.dominio.vo.Peso;
import java.util.Objects;

/**
 * Mapper de la capa de aplicación. Responsabilidad única: Convertir
 * comandos/DTOs de cálculo a
 * entidades del dominio y viceversa.
 */
public final class CalculoMapper {

  public Calculo toDomain(final CalcularImcCommand comando) {
    if (Objects.isNull(comando)) {
      throw new ComandoInvalidoException("El comando de cálculo no puede ser nulo.");
    }
    final Peso peso = new Peso(comando.peso());
    final Altura altura = new Altura(comando.altura());
    return new Calculo(peso, altura);
  }

  public Calculo toDomain(final double valorPeso, final double valorAltura) {
    final Peso peso = new Peso(valorPeso);
    final Altura altura = new Altura(valorAltura);
    return new Calculo(peso, altura);
  }

  public ResultadoImcDto toDto(final Resultado resultado) {
    if (Objects.isNull(resultado)) {
      throw new ComandoInvalidoException("El resultado del cálculo no puede ser nulo.");
    }
    return new ResultadoImcDto(
        resultado.getImc(),
        resultado.getImcFormateado(),
        resultado.getClasificacion(),
        resultado.getRecomendaciones());
  }
}
