package br.com.poo.hotel.modelo;

import br.com.poo.hotel.utilitarios.Verificador;

/**
 * 
 * @author guilherme
 * @version 1.0.0
 */

public class Telefone {

	private String codigoArea;
	private String prefixo;
	private String numeroLinha;
	
	public Telefone(String codigoArea, String prefixo, String numeroLinha) {
		this.codigoArea = codigoArea;
		this.prefixo = prefixo;
		this.numeroLinha = numeroLinha;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	/**
	 * Modifica o código de área do número telefônico e retorna uma mensagem informando o status
	 * da operação.
	 * @param codigoArea
	 * @return Retorna o resultado da operação.
	 */
	public String setCodigoArea(String codigoArea) {
		
		String log = "Operação realizada com sucesso!";
		
		if (codigoArea.length() <= 3 && codigoArea.length() > 0)
			if (Verificador.isNumero(codigoArea))
				this.codigoArea = codigoArea;
			else
				log = "O código de área deve ser númerico, não podendo haver letras!";
		else
			log = "O código de área deve conter de 1 à 3 digitos!";
		
		return log;
	}

	public String getPrefixo() {
		return prefixo;
	}

	/**
	 * Modifica o prefixo do número telefônico e retorna uma mensagem informando o status
	 * da operação.
	 * @param prefixo 
	 * @return Retorna o resultado da operação.
	 */
	public String setPrefixo(String prefixo) {
		
		String log = "Operação realizada com sucesso!"; 
		
		if (prefixo.length() <= 3 && prefixo.length() > 0) {
			if (Verificador.isNumero(prefixo))
				this.prefixo = prefixo;
			else
				log = "O prefixo deve ser númerico, não podendo haver letras!";
		} else
			log = "O prefixo deve conter de 1 à 3 digitos!";
		
		return log;
	}

	public String getNumeroLinha() {
		return numeroLinha;
	}

	/**
	 * Modifica o número telefônico e retorna uma mensagem informando o status
	 * da operação.
	 * @param numeroLinha
	 * @return Retorna o resultado da operação.
	 */
	public String setNumeroLinha(String numeroLinha) {
		
		String log = "Operação realizada com sucesso!";
		
		if (numeroLinha.length() > 0 && numeroLinha.length() < 9)
			if (Verificador.isNumero(numeroLinha))
				this.numeroLinha = numeroLinha;
			else
				log = "O número telefônico deve ser númerico, não podendo haver letras!";
		else
			log = "O número telefônico deve conter de 1 - 9 dígitos!";
		
		return log;
	}
	
	/**
	 * @return Retorna o número telefônico no formato brasileiro.
	 */
	public String toString() {
		return "(+" + prefixo + ") (" + codigoArea + ") " + numeroLinha.substring(0, 4) + "-" + numeroLinha.substring(4);
	}
	
}
