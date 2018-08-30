/**
 * 
 */
package br.com.agibank.testeSelecao.parse;

import org.springframework.stereotype.Component;

import br.com.agibank.testeSelecao.config.PositionFileConfig;
import br.com.agibank.testeSelecao.domain.Line;
import br.com.agibank.testeSelecao.domain.LineSalesmanFactory;

/**
 * @author tiago marzari
 * @since 21/08/2018
 */
@Component
public class LineParseSaleman implements LineParse {

	@Override
	public Line parse(String[] data) {
		String cpf = data[PositionFileConfig.PLACE_SALESMAN_CPF];
		String name = data[PositionFileConfig.PLACE_SALESMAN_NAME];
		String salary = data[PositionFileConfig.PLACE_SALESMAN_SALARY];

		return new LineSalesmanFactory(cpf, name, salary);
	}

}
