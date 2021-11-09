package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import algoritmos.AlgoritmoTransformacao;
import algoritmos.CaMeLcAsEfY;
import algoritmos.Clean;
import algoritmos.CleanSpaces;
import algoritmos.ComparatorAlgoritmo;
import algoritmos.ConverteInterrogacoesParaPontos;
import algoritmos.InsertSpaces;
import algoritmos.UpperCase;
import logger.LogSystem;

/**
 * 
 * classe responsavel por controlar as transformacoes dos textos armazenamento
 * os algoritmos de transformacao
 * 
 * @author Welbber Vital
 *
 */
public class TransformaTexto {

	private Map<String, AlgoritmoTransformacao> algoritmos;
	private Integer contadorTransformacoes;
	private List<String> historicoTransformacao;
	private Set<String> textosOriginais;
	private LogSystem logger;

	public TransformaTexto(LogSystem logger) {
		this.algoritmos = new HashMap<String, AlgoritmoTransformacao>();
		this.contadorTransformacoes = 0;
		this.historicoTransformacao = new ArrayList<>();
		this.textosOriginais = new HashSet<>();
		this.logger = logger;

		this.algoritmos.put("CaMeLcAsEfY", new CaMeLcAsEfY());
		this.algoritmos.put("Clean", new Clean());
		this.algoritmos.put("CleanSpaces", new CleanSpaces());
		this.algoritmos.put("InterrogacoesParaPontos", new ConverteInterrogacoesParaPontos());
		this.algoritmos.put("InsertSpaces", new InsertSpaces());
		this.algoritmos.put("UpperCase", new UpperCase());

	}

	public TransformaTexto() {
		this.algoritmos = new HashMap<String, AlgoritmoTransformacao>();
		this.contadorTransformacoes = 0;
		this.historicoTransformacao = new ArrayList<>();
		this.textosOriginais = new HashSet<>();

		this.algoritmos.put("CaMeLcAsEfY", new CaMeLcAsEfY());
		this.algoritmos.put("Clean", new Clean());
		this.algoritmos.put("CleanSpaces", new CleanSpaces());
		this.algoritmos.put("InterrogacoesParaPontos", new ConverteInterrogacoesParaPontos());
		this.algoritmos.put("InsertSpaces", new InsertSpaces());
		this.algoritmos.put("UpperCase", new UpperCase());
	}

	/**
	 * Cadastra um algoritmo de transformacao no cadastro
	 * 
	 * @param nomeAlgoritmo - Nome pelo qual sera utilizado para invocar o objeto
	 *                      quando usado
	 * @param transformacao - Algoritmo que sera salvo para ser usado depois
	 */
	public void cadastraTransformacao(String nomeAlgoritmo, AlgoritmoTransformacao transformacao) {
		log("cadastraTransformacao", nomeAlgoritmo);

		this.algoritmos.put(nomeAlgoritmo, transformacao);
	}

	/**
	 * metodo que consulta o algoritmo para transformar o campo e realiza
	 * 
	 * @param nomeAlgoritmo qual algoritmo deve ser utilzado para transformar o
	 *                      campo
	 * @param campo         - texto que deseja ser formatado
	 * @return o campo com a transformacao realizada
	 */
	public String transforma(String nomeAlgoritmo, String campo) {
		log("transforma", nomeAlgoritmo);
		AlgoritmoTransformacao algoritmo = algoritmos.get(nomeAlgoritmo);

		String textoTransformado = algoritmo.transforma(campo);
		registraTransformacao(campo, textoTransformado, algoritmo.getNome());

		return textoTransformado;
	}

	/**
	 * Metodo que retorna uma lista os nomes dos algoritmos transaformacao
	 * 
	 * @return lista dos nomes dos algoritmos existentes
	 */
	public List<String> listaTransformacoes() {
		log("listaTransformacoes");

		List<AlgoritmoTransformacao> listaAlgoritmos = new ArrayList<>(this.algoritmos.values());

		Collections.sort(listaAlgoritmos, new ComparatorAlgoritmo());

		return listaAlgoritmos.stream().map(a -> a.getNome()).collect(Collectors.toList());
	}

	/**
	 * Metodo que retorna quantidade de transformacoes realizadas
	 * 
	 * @return quantidade de transformacoes realizadas
	 */
	public Integer contaTransformacoes() {
		log("contaTransformacoes");

		return this.contadorTransformacoes;
	}

	/**
	 * Metodo que registra em uma lista o texto original, o algoritmo que
	 * transformou o texto e o texto transformatado ja com formato definido
	 * 
	 * @param textoOriginal     - texto informado para transformar
	 * @param textoTransformado - texto apos transformado
	 * @param nomeTransformacao algoritmo utilizado para transformar texto
	 */
	private void registraTransformacao(String textoOriginal, String textoTransformado, String nomeTransformacao) {

		log("registraTransformacao", nomeTransformacao);

		this.contadorTransformacoes++;
		this.textosOriginais.add(textoOriginal);
		historicoTransformacao
				.add(String.format("%s -> %s -> %s", textoOriginal, nomeTransformacao, textoTransformado));
	}

	/**
	 * texto que retorna historico de uma determinada transformacao
	 * 
	 * @param posicao - posicao do historico
	 * @return string com campos formatados
	 */
	public String historico(Integer posicao) {

		log("historico", posicao.toString());

		return this.historicoTransformacao.get(posicao);
	}

	/**
	 * Todos os textos formatados, idenpendente do algoritmo utilizado
	 * 
	 * @return Set com todas textos transformados
	 */
	public Set<String> listaOriginais() {
		log("listaOriginais");
		return this.textosOriginais;
	}

	/**
	 * metodo que realiza uma checagem para invodar o log caso ele tenha sido
	 * instanciado
	 * 
	 * @param msg mensagem que ser imprimida no log
	 */
	private void log(String... msg) {
		if (logger != null && msg != null) {
			this.logger.log(msg);
		}
	}
}
