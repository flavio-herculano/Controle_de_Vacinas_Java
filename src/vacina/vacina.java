package vacina;

import java.util.Scanner;

public class vacina {

	public static void main(String[] args) {

		int opt = 0;
		cadastro cadastro = new cadastro();
		String nome;
		int lote;
		int quantidade;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("\nBem-vindo ao sistema de controle de vacinas!");
			System.out.println("Criado por Flavio Herculano [RGM: 25966022] e Carolaine Rabelo [RGM: 626695499] \n");

			do {
				System.out.println("1 - Cadastrar vacina");
				System.out.println("2 - Consultar vacina");
				System.out.println("3 - Finalizar controle de vacinas");
				System.out.println("\nDigite uma opção:");

				opt = ler.nextInt();

				switch (opt) {
					case 1:
						System.out.println("\n\n\nVocê selecionou:");
						System.out.println("1 - Cadastrar vacina");
						System.out.println("========================");

						System.out.println("\nInsira o nome da vacina:");
						nome = ler.next();
						cadastro.setNome(nome);

						System.out.println("\nInsira o lote:");
						lote = ler.nextInt();
						cadastro.setLote(lote);

						System.out.println("\nInsira a quantidade:");
						quantidade = ler.nextInt();
						cadastro.setQuantidade(quantidade);

						System.out.println("\n\n\nCadatro efetuado!");
						System.out.println("Voltando ao menu anterior... \n");
						System.out.println("========================\n");
						break;

					case 2:
						System.out.println("\n\n\nVocê selecionou:");
						System.out.println("2 - Consultar vacina");
						System.out.println("========================");

						System.out.println("\nInforme o nome da vacina:");
						nome = ler.next();
						System.out.println("\nInforme o lote:");
						lote = ler.nextInt();
						System.out.println("\nInforme a quantidade:");
						quantidade = ler.nextInt();

						if (lote == cadastro.getLote() && nome.equals(cadastro.getNome())) {
							System.out.println("\n\n\nVacina encontrada!");
							System.out.println("========================");
							do {
								System.out.println("1 - Modificar vacina");
								System.out.println("2 - Excluir vacina");
								System.out.println("0 - Voltar ao menu inicial");
								System.out.println("\nDigite uma opção:");

								opt = ler.nextInt();

								switch (opt) {
									case 1:
										System.out.println("\n\n\nVocê selecionou:");
										System.out.println("1 - Modificar vacina");
										System.out.println("========================");

										System.out.println("\nInforme o nome da vacina:");
										nome = ler.next();
										System.out.println("\nInforme o lote:");
										lote = ler.nextInt();
										System.out.println("\nInforme a quantidade:");
										quantidade = ler.nextInt();
										System.out.println("\n\n\nVacina encontrada!");
										System.out.println("========================");
										System.out.println("\nDigite 1 para continuar");
										opt = ler.nextInt();

										if (lote == cadastro.getLote() && nome.equals(cadastro.getNome())) {
											do {
												System.out.println("\nInsira o novo nome da vacina:");
												nome = ler.next();
												cadastro.setNome(nome);

												System.out.println("\nInsira o novo lote");
												lote = ler.nextInt();
												cadastro.setLote(lote);

												System.out.println("\nInsira a nova quantidade");
												quantidade = ler.nextInt();
												cadastro.setQuantidade(quantidade);
											} while (opt != 1);
										}
										break;

									case 2:
										System.out.println("\n\n\nVocê selecionou:");
										System.out.println("2 - Excluir Vacina");
										System.out.println("========================");

										System.out.println("\nInforme o nome da vacina cadastrada:");
										nome = ler.next();
										System.out.println("\nInforme seu lote:");
										lote = ler.nextInt();
										System.out.println("\nInforme sua quantidade:");
										quantidade = ler.nextInt();

										if (lote == cadastro.getLote() && nome.equals(cadastro.getNome())) {
											do {
												System.out.println("\nVacina encontrada!\n");
												System.out.println("========================");
												System.out.println("1 - Excluir nome da vacina");
												System.out.println("2 - Excluir lote da vacina");
												System.out.println("3 - Excluir quantidade da vacina");
												System.out.println("4 - Finalizar");
												System.out.println("\nDigite uma opção:");
												opt = ler.nextInt();

												switch (opt) {
													case 1:
														nome = "";
														cadastro.setNome(nome);
														break;
													case 2:
														lote = 0;
														cadastro.setLote(lote);
														break;
													case 3:
														quantidade = 0;
														cadastro.setQuantidade(quantidade);
														break;
												}
											} while (opt != 4);
										}
										break;

									default:
										System.out.println("Opção invalida!");
								}
							} while (opt != 0);
						}
				}
			} while (opt != 3);
		}
	}
}
