import java.text.DecimalFormat;
import java.util.Scanner;

public class Projeto_Vendas {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		Double ValorCelular1 = 7612.99;
		Double ValorFrete = 13.99;
		Double ValorComFrete = ValorCelular1 + ValorFrete;
		Double ValorSemFrete = ValorCelular1;
		Double JurosParcelamento= 3.3;
		Double PorcentagemComFrete = (ValorComFrete + ((ValorComFrete * JurosParcelamento)/100));
		Double PorcentagemSemFrete = (ValorSemFrete + ((ValorSemFrete * JurosParcelamento)/100));
		

			System.out.println("O que você precisa (1)Celular |(2)Tablet | (3)Notebook | (4)Televisão ");
			Double escolhaAparelho = scanner.nextDouble(); {
	
			if (escolhaAparelho == 1) {
			System.out.println(
					"Escolha o modelo: (1)Samsung S22 Ultra 512GB | (2)Iphone 14 Pro 1TB | (3)Samsung Pocket 2,5GB");
			Double ModeloAparelho = scanner.nextDouble();
			// ----------
			if (ModeloAparelho == 1) {
				System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorCelular1);
				System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFrete+ " | (2)Buscar na loja Gratis");
				Double Entrega = scanner.nextDouble();
				
				
				// -----------
				if (Entrega == 1) {
					System.out.println("Seu valor Sub-Total é: R$"+ (ValorComFrete));
					System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + " + JurosParcelamento+ "% juros");
					int Pagamento = scanner.nextInt();

					if (Pagamento == 1) {
						System.out.println("Certo, compra aprovada no valor de R$"+ (ValorComFrete));
						System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
					}
					if (Pagamento == 2) {
						System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFrete/2) + 
								" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFrete));
						System.out.println("Aproveite sua compra, não aceitamos devolução");
					}					
					
				}
				
				if (Entrega == 2) {
						System.out.println("Seu valor final é R$"+ ValorSemFrete);
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + " + JurosParcelamento+ "% juros");
						Double pagamento1 = scanner.nextDouble();

					if (pagamento1 == 2) {
						System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFrete/ 2)
								+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFrete));
						System.out.println("Aproveite sua compra, Não aceitamos devolução");
						
						}else if (pagamento1 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFrete);
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
			}
			}
			}
			//****************************************************************************
			//CELULAR MODELO 2
			
			Double ValorCelular2 = 13458.90;
			Double ValorFrete2 = 17.99;
			Double ValorComFrete2 = ValorCelular2 + ValorFrete2;
			Double ValorSemFrete2 = ValorCelular2;
			Double PorcentagemComFrete2 = (ValorComFrete2 + ((ValorComFrete2 * JurosParcelamento)/100));
			Double PorcentagemSemFrete2 = (ValorSemFrete2 + ((ValorSemFrete2 * JurosParcelamento)/100));
			
			
			
			if (ModeloAparelho == 2) {
				System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorCelular2);
				System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFrete2 + " | (2)Buscar na loja Gratis");
				Double Entrega = scanner.nextDouble();
				
				
				// -----------
				if (Entrega == 1) {
					System.out.println("Seu valor Sub-Total é: R$"+ (ValorComFrete2));
					System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + " + JurosParcelamento+ "% juros");
					int Pagamento = scanner.nextInt();

					if (Pagamento == 1) {
						System.out.println("Certo, compra aprovada no valor de R$"+ (ValorComFrete2));
						System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
					}
					if (Pagamento == 2) {
						System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFrete2/2) + 
								" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFrete2));
						System.out.println("Aproveite sua compra, não aceitamos devolução");
					}					
					
				}
				
				if (Entrega == 2) {
						System.out.println("Seu valor final é "+"R$"+ ValorSemFrete2);
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2 "+ JurosParcelamento + "% juros");
						Double pagamento1 = scanner.nextDouble();

					if (pagamento1 == 2) {
						System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFrete2/ 2)
								+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFrete2));
						System.out.println("Aproveite sua compra, Não aceitamos devolução");
						
						}else if (pagamento1 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFrete2);
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
			}
			}
			}
	//*************************************************************
		//CELULAR MODELO 3
			
			
			Double ValorCelular3 = 247.60;
			Double ValorFrete3 = 14.76;
			Double ValorComFrete3 = ValorCelular3 + ValorFrete3;
			Double ValorSemFrete3 = ValorCelular3;
			Double PorcentagemComFrete3 = (ValorComFrete3 + ((ValorComFrete3 * JurosParcelamento)/100));
			Double PorcentagemSemFrete3 = (ValorSemFrete3 + ((ValorSemFrete3 * JurosParcelamento)/100));
			
			
			
			if (ModeloAparelho == 3) {
				System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorCelular3);
				System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFrete3 + " | (2)Buscar na loja Gratis");
				Double Entrega = scanner.nextDouble();
				
				
				// -----------
				if (Entrega == 1) {
					System.out.println("Seu valor Sub-Total é: R$"+ (ValorComFrete3));
					System.out.println("Você deseja (1)A vista (2)Parcelado em 2X +" + JurosParcelamento+ "% juros");
					int Pagamento = scanner.nextInt();

					if (Pagamento == 1) {
						System.out.println("Certo, compra aprovada no valor de R$"+ (ValorComFrete3));
						System.out.println("Quando a bomba relogio estourar não me procure");
					}
					if (Pagamento == 2) {
						System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFrete3/2) + 
								" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFrete3));
						System.out.println("Em pleno 2022, ano da copa do mundo, ano de eleição e você parcelando um pocket ? Mundo está perdido mesmo ");
					}					
					
				}
				
				if (Entrega == 2) {
						System.out.println("Seu valor final é R$"+ ValorSemFrete3);
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2 vezes com 7% juros");
						Double pagamento1 = scanner.nextDouble();

					if (pagamento1 == 2) {
						System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##1").format(PorcentagemSemFrete3/ 2)
								+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFrete3));
						System.out.println("Parcelar um Pocket é triste em, Não aceito devolução");
						
						}else if (pagamento1 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFrete3);
							System.out.println("Comprar um Pocket em pleno 2022 irmão ?"
									+ " Aproveite sua bomba relógio, não aceitamos devolução");
			}
			}
			}}
	//*****************************************************
			
			//TABLET MODELO 1
			
				Double ValorTablet = 1149.70;
				Double ValorFreteTablet = 13.99;
				Double ValorComFreteTablet = ValorTablet + ValorFreteTablet;
				Double ValorSemFreteTablet = ValorTablet;
				Double PorcentagemComFreteTablet = (ValorComFreteTablet + ((ValorComFreteTablet * JurosParcelamento)/100));
				Double PorcentagemSemFreteTablet = (ValorSemFreteTablet + ((ValorSemFreteTablet * JurosParcelamento)/100));
				
				{ if (escolhaAparelho == 2) {
					System.out.println("Escolha o modelo: (1)Tablet Samsung Tab A8 64GB | (2)Ipad Pro 4ºGeração 128GB | (3)Tablet Positivo 32GB");
					Double ModeloTablet = scanner.nextDouble();
				
						if (ModeloTablet == 1) {
						System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorTablet);
						System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteTablet+ " | (2)Buscar na loja Gratis");
						Double EntregaTablet = scanner.nextDouble();
					
					
					// -----------
						if (EntregaTablet == 1) {
						System.out.println("Seu valor Sub-Total é: "+"R$"+ (ValorComFreteTablet));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X +" + JurosParcelamento+"% juros");
						int PagamentoTablet = scanner.nextInt();

						if (PagamentoTablet == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ ValorComFreteTablet);
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoTablet == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteTablet/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteTablet));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaTablet == 2) {
							System.out.println("Seu valor final é R$"+ ValorSemFreteTablet);
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + " + JurosParcelamento + " juros");
							Double pagamentoTablet = scanner.nextDouble();

						if (pagamentoTablet == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteTablet/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteTablet));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoTablet == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteTablet);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
				}
				}
				}
				
				
	//************************************
			//TABLET MODELO 2
				
				Double ValorTablet2 = 6699.30;
				Double ValorFreteTablet2 = 24.99;
				Double ValorComFreteTablet2 = ValorTablet2 + ValorFreteTablet2;
				Double ValorSemFreteTablet2 = ValorTablet2;
				Double PorcentagemComFreteTablet2 = (ValorComFreteTablet2 + ((ValorComFreteTablet2 * JurosParcelamento)/100));
				Double PorcentagemSemFreteTablet2 = (ValorSemFreteTablet2 + ((ValorSemFreteTablet2 * JurosParcelamento)/100));
				
				{
				
				if (ModeloTablet == 2) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorTablet2);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteTablet2+ " | (2)Buscar na loja Gratis");
					Double EntregaTablet2 = scanner.nextDouble();
					
					
					// -----------
						if (EntregaTablet2 == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ (ValorComFreteTablet2));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoTablet2 = scanner.nextInt();

						if (PagamentoTablet2 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (ValorComFreteTablet2));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoTablet2 == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteTablet2/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteTablet2));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaTablet2 == 2) {
							System.out.println("Seu valor final é R$"+ ValorSemFreteTablet2);
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoTablet2 = scanner.nextDouble();

						if (pagamentoTablet2 == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteTablet2/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteTablet2));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoTablet2 == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteTablet2);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
				}
				}
				}
				}	
				
				Double ValorTablet3 = 360.20;
				Double ValorFreteTablet3 = 9.88;
				Double ValorComFreteTablet3 = ValorTablet3 + ValorFreteTablet3;
				Double ValorSemFreteTablet3 = ValorTablet3;
				Double PorcentagemComFreteTablet3 = (ValorComFreteTablet3 + ((ValorComFreteTablet3 * JurosParcelamento)/100));
				Double PorcentagemSemFreteTablet3 = (ValorSemFreteTablet3 + ((ValorSemFreteTablet3 * JurosParcelamento)/100));
				
				{
				
				if (ModeloTablet == 3) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorTablet3);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteTablet3+ " | (2)Buscar na loja Gratis");
					Double EntregaTablet3 = scanner.nextDouble();
					
					
					// -----------
					if (EntregaTablet3 == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ (ValorComFreteTablet3));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoTablet3 = scanner.nextInt();

						if (PagamentoTablet3 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (ValorComFreteTablet3));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoTablet3 == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteTablet3/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteTablet3));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaTablet3 == 2) {
							System.out.println("Seu valor final é R$"+ ValorSemFreteTablet3);
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoTablet3 = scanner.nextDouble();

						if (pagamentoTablet3 == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteTablet3/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteTablet3));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoTablet3 == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteTablet3);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
	}}}}}}
			
		//****************************************************
				// NOTEBOOK MODELO 1
				
				Double ValorNotebook = 2484.30;
				Double ValorFreteNotebook = 17.80;
				Double ValorComFreteNotebook = ValorNotebook + ValorFreteNotebook;
				Double ValorSemFreteNotebook = ValorNotebook;
				Double PorcentagemComFreteNotebook = (ValorComFreteNotebook + ((ValorComFreteNotebook* JurosParcelamento)/100));
				Double PorcentagemSemFreteNotebook = (ValorSemFreteNotebook + ((ValorSemFreteNotebook * JurosParcelamento)/100));
				
				
			{  
				if (escolhaAparelho == 3) {
				System.out.println("Escolha o modelo: (1)Acer Celeron 256GB | (2)Lenovo Celeron 128Gb | (3)Macbook Pro 13 512GB");
				Double ModeloNotebook = scanner.nextDouble();
			
				
				if (ModeloNotebook == 1) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorNotebook);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteNotebook+ " | (2)Buscar na loja Gratis");
					Double EntregaNotebook = scanner.nextDouble();
					
					
					// -----------
					if (EntregaNotebook == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ new DecimalFormat(".##").format(ValorComFreteNotebook));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoNotebook = scanner.nextInt();

						if (PagamentoNotebook == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (double)Math.round((ValorComFreteNotebook)));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoNotebook == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteNotebook/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteNotebook));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaNotebook == 2) {
							System.out.println("Seu valor final é R$"+ new DecimalFormat(".##").format(ValorSemFreteNotebook));
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoNotebook = scanner.nextDouble();

						if (pagamentoNotebook == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteNotebook/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteNotebook));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoNotebook == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteNotebook);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
				}}}
		//**************************************
				//NOTEBOOK MODELO 2
				
				Double ValorNotebook2 = 3739.56;
				Double ValorFreteNotebook2 = 17.80;
				Double ValorComFreteNotebook2 = ValorNotebook2 + ValorFreteNotebook2;
				Double ValorSemFreteNotebook2 = ValorNotebook2;
				Double PorcentagemComFreteNotebook2 = (ValorComFreteNotebook2 + ((ValorComFreteNotebook2 * JurosParcelamento)/100));
				Double PorcentagemSemFreteNotebook2 = (ValorSemFreteNotebook2 + ((ValorSemFreteNotebook2 * JurosParcelamento)/100));
				
				
			  
				
				if (ModeloNotebook == 2) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorNotebook2);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteNotebook2+ " | (2)Buscar na loja Gratis");
					Double EntregaNotebook2 = scanner.nextDouble();
					
					
					// -----------
					if (EntregaNotebook2 == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ new DecimalFormat(".##").format(ValorComFreteNotebook2));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoNotebook2 = scanner.nextInt();

						if (PagamentoNotebook2 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (double)Math.round((ValorComFreteNotebook2)));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoNotebook2 == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteNotebook2/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteNotebook2));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaNotebook2 == 2) {
							System.out.println("Seu valor final é R$"+ new DecimalFormat(".##").format(ValorSemFreteNotebook2));
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoNotebook = scanner.nextDouble();

						if (pagamentoNotebook == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteNotebook2/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteNotebook2));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoNotebook == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteNotebook2);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
				}}}
				
			//**********************************************
				//NOTEBOOK MODELO 3
				
				Double ValorNotebook3 = 10599.80;
				Double ValorFreteNotebook3 = 17.80;
				Double ValorComFreteNotebook3 = ValorNotebook3 + ValorFreteNotebook3;
				Double ValorSemFreteNotebook3 = ValorNotebook3;
				Double PorcentagemComFreteNotebook3 = (ValorComFreteNotebook3 + ((ValorComFreteNotebook3 * JurosParcelamento)/100));
				Double PorcentagemSemFreteNotebook3 = (ValorSemFreteNotebook3 + ((ValorSemFreteNotebook3 * JurosParcelamento)/100));
				
				
			  
				
				if (ModeloNotebook == 3) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorNotebook3);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteNotebook3+ " | (2)Buscar na loja Gratis");
					Double EntregaNotebook3 = scanner.nextDouble();
					
					
					// -----------
					if (EntregaNotebook3 == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ new DecimalFormat(".##").format(ValorComFreteNotebook3));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoNotebook3 = scanner.nextInt();

						if (PagamentoNotebook3 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (double)Math.round((ValorComFreteNotebook3)));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoNotebook3 == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteNotebook3/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteNotebook3));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaNotebook3 == 2) {
							System.out.println("Seu valor final é R$"+ new DecimalFormat(".##").format(ValorSemFreteNotebook3));
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoNotebook3 = scanner.nextDouble();

						if (pagamentoNotebook3 == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteNotebook3/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteNotebook3));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoNotebook3 == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteNotebook3);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
				}}}}
			//****************************************
				//TELEVISÃO MODELO 1
				
				Double ValorTelevisao = 1240.20;
				Double ValorFreteTelevisao = 27.80;
				Double ValorComFreteTelevisao = ValorTelevisao + ValorFreteTelevisao;
				Double ValorSemFreteTelevisao = ValorTelevisao;
				Double PorcentagemComFreteTelevisao = (ValorComFreteTelevisao + ((ValorComFreteTelevisao * JurosParcelamento)/100));
				Double PorcentagemSemFreteTelevisao = (ValorSemFreteTelevisao + ((ValorSemFreteTelevisao * JurosParcelamento)/100));
				
				if (escolhaAparelho == 4) {
					System.out.println("Escolha o modelo: (1)Smart TV Samsung 32º | (2)Smart TV TCL 45º | (3)Smart TV Samsung 82º");
					Double ModeloTelevisao = scanner.nextDouble(); 
				
				if (ModeloTelevisao == 1) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorTelevisao);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteTelevisao+ " | (2)Buscar na loja Gratis");
					Double EntregaTelevisao = scanner.nextDouble();
					
					
					// -----------
					if (EntregaTelevisao == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ new DecimalFormat(".##").format(ValorComFreteTelevisao));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoTelevisao = scanner.nextInt();

						if (PagamentoTelevisao == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (double)Math.round((ValorComFreteTelevisao)));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoTelevisao == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteTelevisao/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteTelevisao));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaTelevisao == 2) {
							System.out.println("Seu valor final é R$"+ new DecimalFormat(".##").format(ValorSemFreteTelevisao));
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoTelevisao = scanner.nextDouble();

						if (pagamentoTelevisao == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteTelevisao/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteTelevisao));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoTelevisao == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteTelevisao);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
				}}}
		//****************************************
				//TELEVISÃO MODELO 2
				
				Double ValorTelevisao2 = 1570.40;
				Double ValorFreteTelevisao2 = 16.80;
				Double ValorComFreteTelevisao2 = ValorTelevisao2 + ValorFreteTelevisao2;
				Double ValorSemFreteTelevisao2 = ValorTelevisao2;
				Double PorcentagemComFreteTelevisao2 = (ValorComFreteTelevisao2 + ((ValorComFreteTelevisao2 * JurosParcelamento)/100));
				Double PorcentagemSemFreteTelevisao2 = (ValorSemFreteTelevisao2 + ((ValorSemFreteTelevisao2 * JurosParcelamento)/100));
				
				if (ModeloTelevisao == 2) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorTelevisao2);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteTelevisao2+ " | (2)Buscar na loja Gratis");
					Double EntregaTelevisao2 = scanner.nextDouble();
					
					
					if (EntregaTelevisao2 == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ new DecimalFormat(".##").format(ValorComFreteTelevisao2));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoTelevisao2 = scanner.nextInt();

						if (PagamentoTelevisao2 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (double)Math.round((ValorComFreteTelevisao2)));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoTelevisao2 == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteTelevisao2/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteTelevisao2));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaTelevisao2 == 2) {
							System.out.println("Seu valor final é R$"+ new DecimalFormat(".##").format(ValorSemFreteTelevisao2));
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoTelevisao2 = scanner.nextDouble();

						if (pagamentoTelevisao2 == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteTelevisao2/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteTelevisao2));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoTelevisao2 == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteTelevisao2);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
				}}}
		//****************************************
				//TELEVISÃO MODELO 3
				
				Double ValorTelevisao3 = 3560.70;
				Double ValorFreteTelevisao3 = 16.80;
				Double ValorComFreteTelevisao3 = ValorTelevisao3 + ValorFreteTelevisao3;
				Double ValorSemFreteTelevisao3 = ValorTelevisao3;
				Double PorcentagemComFreteTelevisao3 = (ValorComFreteTelevisao3 + ((ValorComFreteTelevisao3 * JurosParcelamento)/100));
				Double PorcentagemSemFreteTelevisao3 = (ValorSemFreteTelevisao3 + ((ValorSemFreteTelevisao3 * JurosParcelamento)/100));
				
				if (ModeloTelevisao == 3) {
					System.out.println("Certo, Até o momento sua compra é de: R$"+ ValorTelevisao3);
					System.out.println("Forma de Entrega: (1)Frete 3 dias úteis R$" + ValorFreteTelevisao3+ " | (2)Buscar na loja Gratis");
					Double EntregaTelevisao3 = scanner.nextDouble();
					
					
					if (EntregaTelevisao3 == 1) {
						System.out.println("Seu valor Sub-Total é: R$"+ new DecimalFormat(".##").format(ValorComFreteTelevisao3));
						System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento +"% juros");
						int PagamentoTelevisao3 = scanner.nextInt();

						if (PagamentoTelevisao3 == 1) {
							System.out.println("Certo, compra aprovada no valor de R$"+ (double)Math.round((ValorComFreteTelevisao3)));
							System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
						}
						if (PagamentoTelevisao3 == 2) {
							System.out.println("Ótimo, compra aprovada em 2X R$"+ new DecimalFormat(".##").format(PorcentagemComFreteTelevisao3/2) + 
									" com valor final de " + "R$" + new DecimalFormat(".##").format(PorcentagemComFreteTelevisao3));
							System.out.println("Aproveite sua compra, não aceitamos devolução");
						}					
						
					}
					
					if (EntregaTelevisao3 == 2) {
							System.out.println("Seu valor final é R$"+ new DecimalFormat(".##").format(ValorSemFreteTelevisao3));
							System.out.println("Você deseja (1)A vista (2)Parcelado em 2X + "+ JurosParcelamento+ "% juros");
							Double pagamentoTelevisao3 = scanner.nextDouble();

						if (pagamentoTelevisao3 == 2) {
							System.out.println("Ótimo, compra aprovada em 2x R$"+ new DecimalFormat(".##").format(PorcentagemSemFreteTelevisao3/ 2)
									+ " com valor final de R$" + new DecimalFormat(".##").format(PorcentagemSemFreteTelevisao3));
							System.out.println("Aproveite sua compra, Não aceitamos devolução");
							
							}else if (pagamentoTelevisao3 == 1) {
								System.out.println("Certo, compra aprovada no valor de R$" + ValorSemFreteTelevisao3);
								System.out.println("Aproveite sua compra, Qualquer duvida não me procure");
		
			}}}}}}}}


