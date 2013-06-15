package br.com.poo.hotel.modelo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Estadia {
	private Date dataChegada;
	private Date horaChegada;
	private Date dataSaida;
	private Date horaSaida;
	private Date dataSaidaPrevista;
	private double valorTotal;
	private double valorTelefonemas;
	private double desconto;
	private Acomodacao acomodacao;
	private Hospede hospede;
	private Funcionario funcionario;
	private OpcaoPagamento opcaoPagamento;
	private List<Acompanhante> acompanhantes;
	private List<Consumo> consumos;

	public Estadia(Date dataChegada, Date horaChegada, Date dataSaidaPrevista, 
			Hospede hospede, Funcionario funcionario, Acomodacao acomodacao) {
		setDataChegada(dataChegada);
		setHoraChegada(horaChegada);
		setDataSaidaPrevista(dataSaidaPrevista);
		setHospede(hospede);
		setFuncionario(funcionario);
		setAcomodacao(acomodacao);
	}

	public Estadia(Date dataChegada, Date horaChegada, Date dataSaidaPrevista, double valorTotal,
			double valorTelefonemas, double desconto,
			List<Acompanhante> acompanhantes, OpcaoPagamento opcaoPagamento,
			Acomodacao acomodacao, List<Consumo> consumo, Hospede hospede, Funcionario funcionario) {
		
		this(dataChegada, horaChegada, dataSaidaPrevista, hospede, funcionario, acomodacao);
		setValorTelefonemas(valorTelefonemas);
		setDesconto(desconto);
		setAcompanhantes(acompanhantes);
		setOpcaoPagamento(opcaoPagamento);
		setConsumos(consumo);
	}

	public Estadia(Date dataChegada, Date horaChegada, Date dataSaida,
			Date horaSaida, Date dataSaidaPrevista, double valorTotal,
			double valorTelefonemas, double desconto,
			List<Acompanhante> acompanhantes, OpcaoPagamento opcaoPagamento,
			Acomodacao acomodacao, List<Consumo> consumo, Hospede hospede, Funcionario funcionario) {
		
		this(dataChegada, horaChegada, dataSaidaPrevista, valorTotal, 
			valorTelefonemas, desconto, acompanhantes, opcaoPagamento, 
			acomodacao, consumo, hospede, funcionario);
		setDataSaida(dataSaida);
		setHoraSaida(horaSaida);
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public boolean setDataChegada(Date dataChegada) {
		if (dataChegada != null) {
			this.dataChegada = dataChegada;
			return true;
		}
		return false;
	}

	public Date getHoraChegada() {
		return horaChegada;
	}

	public boolean setHoraChegada(Date horaChegada) {
		if (horaChegada != null) {
			this.horaChegada = horaChegada;
			return true;
		}
		return false;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public boolean setDataSaida(Date dataSaida) {
		if (dataSaida != null) {
			this.dataSaida = dataSaida;
			return true;
		}
		return false;
	}

	public Date getHoraSaida() {
		return horaSaida;
	}

	public boolean setHoraSaida(Date horaSaida) {
		if (horaSaida != null) {
			this.horaSaida = horaSaida;
			return true;
		}
		return false;
	}

	public Date getDataSaidaPrevista() {
		return dataSaidaPrevista;
	}

	public boolean setDataSaidaPrevista(Date dataSaidaPrevista) {
		if (dataSaidaPrevista != null) {
			this.dataSaidaPrevista = dataSaidaPrevista;
			return true;
		}
		return false;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public double getValorTelefonemas() {
		return valorTelefonemas;
	}

	public boolean setValorTelefonemas(double valorTelefonemas) {
		if (valorTelefonemas >= 0) {
			this.valorTelefonemas = valorTelefonemas;
			return true;
		}
		return false;
	}

	public double getDesconto() {
		return desconto;
	}

	public boolean setDesconto(double desconto) {
		if (desconto >= 0) {
			this.desconto = desconto;
			return true;
		}
		return false;
	}

	public OpcaoPagamento getOpcaoPagamento() {
		return opcaoPagamento;
	}

	public boolean setOpcaoPagamento(OpcaoPagamento opcaoPagamento) {
		if (opcaoPagamento != null) {
			this.opcaoPagamento = opcaoPagamento;
			return true;
		}
		return false;
	}

	public Acomodacao getAcomodacao() {
		return acomodacao;
	}

	public boolean setAcomodacao(Acomodacao acomodacao) {
		if (acomodacao != null) {
			this.acomodacao = acomodacao;
			return true;
		}
		return false;
	}

	public List<Acompanhante> getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhantes(List<Acompanhante> acompanhantes) {
		this.acompanhantes = acompanhantes;
	}

	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public boolean setHospede(Hospede hospede) {
		if (hospede != null) {
			this.hospede = hospede;
			return true;
		}
		return false;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public boolean setFuncionario(Funcionario funcionario) {
		if (funcionario != null) {
			this.funcionario = funcionario;
			return true;
		}
		return false;
	}

	public boolean adicionarConsumo(Consumo consumo) {
		if (consumos != null) {
			consumos.add(consumo);
			return true;
		}
		return false;
	}

	/**
	 * O método utiliza calcula o intervalo de dias entre a data de chegada e a data de saída
	 * do hospede. Para realizar esse calculo foi utilizada a biblioteca JodaTime.
	 * @return Um número inteiro que representa o intervalo de dias entre as datas de entrada
	 * e saída.
	 */
	public int numeroDiariariasCobradas() {
		return Days.daysBetween(new DateTime(dataChegada), new DateTime(dataSaida)).getDays();
	}
	
	/**
	 * Método calcula o valor total gasto pelo cliente em cada categoria. O retorno é feito
	 * em um HashMap onde a chave pode ser:
	 * <ul>
	 * <li>FRIGOBAR</li>
	 * <li>LAVANDERIA</li>
	 * <li>RESTAURANTE</li>
	 * </ul>
	 * Ligado com a chave temos o valor que foi gasto pelo cliente na categoria acessada.
	 * 
	 * @see Categoria
	 * @return Um HashMap com o valor gasto em cada categoria.
	 */
	public HashMap<Categoria, Double> calcularValorTotalPorCategoria() {
		HashMap<Categoria, Double> totais = new HashMap<>();
		for (Consumo c : consumos) {
			for (ItemConsumido i : c.getItensConsumido()) {
				if (i.getItem().getCategoria() == Categoria.FRIGOBAR)
					totais.put(Categoria.FRIGOBAR, totais.get(Categoria.FRIGOBAR) + i.totalItem());
				else if (i.getItem().getCategoria() == Categoria.LAVANDERIA)
					totais.put(Categoria.LAVANDERIA, totais.get(Categoria.LAVANDERIA) + i.totalItem());
				else if (i.getItem().getCategoria() == Categoria.RESTAURANTE)
					totais.put(Categoria.RESTAURANTE, totais.get(Categoria.RESTAURANTE) + i.totalItem());
			}
		}
		return totais;
	}
	
	/**
	 * Método calcula o valor total gasto na diária do hospede. Aqui são somadas as diárias, gasto telefonemas,
	 * valor gasto em itens de consumo e caso haja desconto é feito o decrescimo. 
	 * @return O valor gasto pelo hospede em sua estadia.
	 */
	public double calcularValorTotal() {
		for (Double valor : calcularValorTotalPorCategoria().values()) {
			valorTotal += valor; 
		}
		double valorDiaria = acomodacao.getTipoAcomodacao().getPrecoDiaria() * numeroDiariariasCobradas();
		valorTotal += valorTotal + valorTelefonemas + valorDiaria - desconto;
		return valorTotal;
	}
}