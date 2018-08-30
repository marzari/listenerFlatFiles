/**
 * 
 */
package br.com.agibank.testeSelecao.parse;

import br.com.agibank.testeSelecao.domain.Line;

/**
 * @author tiago marzari
 * @since 21/08/2018
 */
public interface LineParse {
	
	public abstract Line parse(String[] data);

}
