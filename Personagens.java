package arenaDosHerois;

public abstract class Personagens {

	private String nome;
	private int vida;
	private int danoBase;
	private int posicao;
	
	public Personagens (String nome, int vida, int danoBase) {
		this.nome = nome;
		this.vida = vida;
		this.danoBase = danoBase;
		this.posicao = 0; //posicaoinicial
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanoBase() {
		return danoBase;
	}

	public void setDanoBase(int danoBase) {
		this.danoBase = danoBase;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public void mover(int novaposicao) {
		this.posicao = novaposicao;
		System.out.println("se eu mocer para a posição" + novaposicao);
	}
	
	public abstract void atacar(Personagens oponente);
	
	public void receberDano(int dano) {
		vida -= dano;
		if (vida < 0) {
			vida = 0;
		}
		System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
	}
	
	public int calcularDistancia(Personagens oponente) {
		return Math.abs(this.posicao - oponente.getPosicao());
	}
	
}
