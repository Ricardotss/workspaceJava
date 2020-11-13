
public class Casa {

	private Quarto quarto = new Quarto();
	private Banheiro banheiro = new Banheiro();
	private Sala sala = new Sala();
	private Cozinha cozinha = new Cozinha();

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Banheiro getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Cozinha getCozinha() {
		return cozinha;
	}

	public void setCozinha(Cozinha cozinha) {
		this.cozinha = cozinha;
	}

}
