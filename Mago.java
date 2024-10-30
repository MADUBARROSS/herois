package arenaDosHerois;

public class Mago extends Personagens{
	private int mana;
	
	public Mago(String nome) {
		super(nome, 100, 25);
		this.mana = 50;
	}
	
	@Override
	public void atacar(Personagens oponente) {
		if (mana >= 10) {
			oponente.receberDano(this.getDanoBase() + 15);
			mana =- 18;
			System.out.println(getNome() + " lançou um feitiço em " + oponente.getNome() + " á distância.");
		}else {
			System.out.println(getNome() + " não tenho mana o suficiente para atacar!");
		}
	}

}
