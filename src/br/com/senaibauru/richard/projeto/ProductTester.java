package br.com.senaibauru.richard.projeto;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int maxSize, menuChoice;
		// Pedindo a quantidade de itens
		maxSize = getNumProducts(scn);
		if (maxSize == 0) {
			//Se quantidade zero, encerramos o programa
			System.out.println("Obrigado por usar nossos " + "serviços!");
		} else {
			//Inicializamos o vetor de produtos com a quantidade 
			//informada pelo usuário
			Produto[] produtos = new Produto[maxSize];
			//Solicitamos os cadastramento dos produtos
			addToInventory(produtos, scn);
			//iniciando o laço de repetição
			do {
				//Solicitando as opções de menu do produto
				menuChoice = getMenuOption(scn);
				//Executando a opção do menu
				executeMenuChoice(menuChoice,produtos,scn);
				//Se a opção do menu não for zero, mantemos o laço 
			}while(menuChoice!=0);
			//Se for zero, sai do laço e encerra o programa
			System.out.println("Obrigado por usar "
					+ "nossos serviços");
		}
		//Fechamos o scanner
		scn.close();
	}
	/**
	 * Método que irá executar a opção do menu escolhido
	 * @param menuChoice - Opção do menu escolhida que deve ser de zero a 4
	 * @param produtos - Vetor dos produtos criado no método main
	 * @param scn - Objeto Scanner criado no método main
	 */
	private static void executeMenuChoice(int menuChoice, Produto[] produtos, Scanner scn) {
		//Pesquisaremos o produto para poder aplicar as opções do menu
		Produto prd = pesquisarProduto(produtos,scn);
		//Se encontrou o produto
		if (prd != null) {
			//se for exibir o inventário
			if (menuChoice==1) {
				//Mostramos o inventário
				System.out.println(prd.toString());
				//se for 2,3 ou 4 e produto estiver ativo
			} else if (menuChoice!=0 && prd.isAtivo()) {
				//se opções 2 ou 3
				if (menuChoice!=4) { 
					//Opções 2 ou 3
					int qtde = getValorInteiro(
							"Digite a quantidade a ser movimentada:", scn, 
							"Quantidade deve ser maior que zero", 
							1, Integer.MAX_VALUE);
					//Temos que tratar por conta do throw que está
					//no produto
					try {
						//se adicionar estoque
						if (menuChoice==2) {
							prd.addToInvetory(qtde);
						} else {
							//se deduzir do estoque
							prd.deductFromInventory(qtde);
						}
						//qualquer erro que ocorrer
					} catch (Exception e) {
						//mostraremos a mensagem do erro para o usuário
						System.out.println(e.getMessage());
					}
				} else {
					//Se for opção 4 (inativar produto)
					String resp = getValorString(
							"Tem certeza que deseja inativar? (S/N)",
							scn, "Deve ter pelo menos 1 caracter", 
							1, 20);
					//Se S ou s, inativamos o produto
					if (resp.charAt(0)=='S'||resp.charAt(0)=='s') {
						prd.setAtivo(false);
					}
				}
			} else if (!prd.isAtivo()) {
				//Se não estiver ativo mostramos a mensagem
				System.out.println("Produto inativo!");
			}
		}
	}
	/**
	 * Método responsável por pesquisar um produto dentro do vetor de produtos e retornar o produto ou null
	 * @param produtos - Informar o vetor de produtos criado no método main
	 * @param scn - Informar o objeto Scanner criado no método main
	 * @return - Retorna null ou objeto produto encontrado
	 */
	private static Produto pesquisarProduto(Produto[] produtos, Scanner scn) {
		Produto ret = null;
		int nrItem = getValorInteiro("Digite o numero do item "
				+ "que deseja pesquisar (0-fim): ", scn, 
				"Valor deve ser maior ou igual a zero", 0, 
				Integer.MAX_VALUE);
		//Percorrendo os produtos para encontrar o item
		for(Produto prd : produtos) {
			//Se o produto não for nulo e o número for igual
			if (prd!=null && prd.getNumeroItem()==nrItem) {
				//Atribuimos o endereço do objeto para a variável
				//ret para poder retornar
				ret = prd;
				//forçamos a saída do for porque já encontramos o item
				break;
			}
		}
		//Se o numero do item não for zero e o ret for nulo
		//significa que não encontrou um produto
		if (nrItem != 0 && ret == null) {
			System.out.println("Item não encontrado!");
		}
		//retornando nulo ou a referência do objeto produto encontrado
		return ret;
	}
	/**
	 * Método que exibe o menu dos produtos e retorna a opção escolhida
	 * @param scn - Informar o objeto Scanner criado no método main
	 * @return - Retorna a opção do menu escolhida pelo usuário
	 */
	private static int getMenuOption(Scanner scn) {
		return getValorInteiro("Menu" +
							   "\n1 - Exibir Inventário"+
							   "\n2 - Adicionar Estoque" + 
							   "\n3 - Deduzir Estoque" + 
							   "\n4 - Descontinuar Produto"+
							   "\n0 - Fim"+
							   "\nDigite sua opção:", scn, 
							   "Opções devem ser de 0 a 4", 
							   0, 4);
	}
	/**
	 * Método que adiciona produtos ao vetor de produtos criado no método main
	 * @param produtos - Informar o vetor de produtos criado no método main
	 * @param scn - Informar o objeto Scanner criado no método main
	 */
	private static void addToInventory(Produto[] produtos, Scanner scn) {
		//iniciando o laço de repetição
		for (int indice=0;indice<produtos.length;indice++) {
			//Obtendo o tipo de produto
			int opc = getValorInteiro("Você deseja incluir 1-DVD ou 2 CD?", scn, "Informar somente 1 ou 2", 1, 2);
			System.out.println("Você deseja incluir " + "1 - DVD ou 2 - CD?");

			// solicitar os dados do produto
			int numeroItem = getValorInteiro("Digite o número do item: ", scn, "Valor deve ser maior que zero!", 1,
					Integer.MAX_VALUE);
			String nome = getValorString("Digite o nome do produto:", scn, "Texto deve ter pelo menos 1 caracter", 1,
					80);
			int qtde = getValorInteiro("Digite a Qtde do item: ", scn, "Valor deve ser maior que zero!", 1,
					Integer.MAX_VALUE);
			double preco = getValorDouble(
					"Digite o preço do produto:", 
					scn, "Valor deve ser maior que zero", 
					0.01, Double.MAX_VALUE);
			//Se o produto for DVD
			if (opc == 1) { 
				//Entramos com os dados do DVD
				int duracao = getValorInteiro(
						"Digite a duração em minutos: ",
						scn,"Valor deve ser maior que 1",
						1,500);
				String classificacao = getValorString(
						"Digite a Classificação etária:", scn, 
						"Deve conter pelo menos 3 caracteres", 
						3, 50);
				String studio = getValorString(
						"Digite o Estúdio de gravação:", scn, 
						"Deve conter pelo menos 3 caracteres", 
						3, 120);
				//Criando o produto DVD com os dados
				produtos[indice] = new Dvd(numeroItem, nome, 
											qtde, preco, duracao, 
											classificacao, studio);
			} else {
				//Se for CD, entramos com os dados do CD
				int numeroMusica = getValorInteiro(
						"Digite número de músicas: ",
						scn,"Valor deve ser maior que 1",
						1,500);
				String artista = getValorString(
						"Digite o nome do Artista:", scn, 
						"Deve conter pelo menos 3 caracteres", 
						3, 50);
				String selo = getValorString(
						"Digite o Selo da Gravadora:", scn, 
						"Deve conter pelo menos 3 caracteres", 
						3, 120);
				//Criando o produto CD com os dados
				produtos[indice] = new Cd(numeroItem, nome, qtde, 
										preco, numeroMusica, 
										artista, selo);
			}
		}
	}
	/**
	 * Método de apoio para obter valores String
	 * @param msgInput - Informar a mensagem de input para o usuário
	 * @param scn - Informar o objeto Scanner criado no método main
	 * @param msgErro - Informar a mensagem de erro de tratamento de limites de tamanho de String
	 * @param tamMin - Informar o tamanho mínimo da String
	 * @param tamMax - Informar o tamanho máximo da String
	 * @return - Retorna a String digitada pelo usuário
	 */
	private static String getValorString(String msgInput, Scanner scn, String msgErro, int tamMin, int tamMax) {
		//Inicializaremos com null
		String ret;
		do {
			//Mostrando a mensagem para o usuário
			System.out.println(msgInput);
			ret = scn.nextLine();
			//se o valor digitado for inválido
			if (ret.length() < tamMin || ret.length() > tamMax) {
				//apresentamos a mensagem de erro de tratamento
				System.out.println(msgErro);
			}
		//Se for inválido o valor, pedimos novamente (loop)
		} while (ret.length() < tamMin || ret.length() > tamMax);
		//retornando o valor digitado
		return ret;
	}
	/**
	 * Método de apoio para obter valores inteiros
	 * @param msgInput - Informar a mensagem de input para o usuário
	 * @param scn - Informar o objeto Scanner criado no método main
	 * @param msgErro - Informar a mensagem de erro de tratamento de limites mínimos de valores
	 * @param lmtMin - Informar o limite mínimo de valor
	 * @param lmtMax - Informar o limite máximo de valor
	 * @return - Retorna o inteiro digitado pelo usuário
	 */
	private static int getValorInteiro(String msgInput, Scanner scn, String msgErro, int lmtMin, int lmtMax) {
		//Inicializaremos com o valor mínimo possível
		int ret = Integer.MIN_VALUE;
		do {
			//Mostrando a mensagem para o usuário
			System.out.println(msgInput);
			//Protegendo o bloco de entrada de valores 
			//para prevenir de valores textos no lugar de inteiros
			try {
				ret = scn.nextInt();
				//se o valor digitado for inválido
				if (ret < lmtMin || ret > lmtMax) {
					//apresentamos a mensagem de erro de tratamento
					System.out.println(msgErro);
				}
			} catch (Exception e) {
				//Se ocorrer erro na digitação, informamos que tem 
				//que digitar números
				System.out.println("Somente Números pf!");
			}
			//Limpando o buffer para evitar os problemas com o nextLine()
			scn.nextLine();
			//Se for inválido o valor, pedimos novamente (loop)
		} while (ret < lmtMin || ret > lmtMax);
		//retornando o valor digitado
		return ret;
	}
	/**
	 * Método de apoio para obter valores de ponto flutuante
	 * @param msgInput - Informar a mensagem de input para o usuário
	 * @param scn - Informar o objeto Scanner criado no método main
	 * @param msgErro - Informar a mensagem de erro de tratamento de limites mínimos de valores
	 * @param lmtMin - Informar o limite mínimo de valor
	 * @param lmtMax - Informar o limite máximo de valor
	 * @return - Retorna o double digitado pelo usuário
	 */
	private static double getValorDouble(String msgInput, Scanner scn, String msgErro, double lmtMin, double lmtMax) {
		//Inicializando com o valor mínimo double possível
		double ret = Double.MIN_VALUE;
		do {
			//Mostrando a mensagem para o usuário
			System.out.println(msgInput);
			//Protegendo o bloco de entrada de valores 
			//para prevenir de valores textos no lugar de numéricos
			try {
				ret = scn.nextDouble();
				//se o valor digitado for inválido
				if (ret < lmtMin || ret > lmtMax) {
					//apresentamos a mensagem de erro de tratamento
					System.out.println(msgErro);
				}
			} catch (Exception e) {
				//Se ocorrer erro na digitação, informamos que tem 
				//que digitar numérico
				System.out.println("Somente Números pf!");
			}
			//Limpando o buffer para evitar os problemas com o nextLine()
			scn.nextLine();
			//Se for inválido o valor, pedimos novamente (loop)
		} while (ret < lmtMin || ret > lmtMax);
		//retornando o valor digitado
		return ret;
	}
	/**
	 * Método que obtem a quantidade de produtos a ser digitada
	 * @param scn - Informar o objeto Scanner criado no método main
	 * @return - Retorna a quantidade de produtos a serem inseridas no vetor de produtos
	 */
	private static int getNumProducts(Scanner scn) {

		return getValorInteiro("Digite o numero de " + "produtos que você deseja (0 - fim) :", scn,
				"Valor deve ser maior ou igual a zero", 0, Integer.MAX_VALUE);
	}

}
