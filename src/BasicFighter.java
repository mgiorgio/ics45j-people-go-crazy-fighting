import java.util.Random;


public class BasicFighter implements Fighter {
	private static final int POINTS = 100;
	private int attack;
	private int defense;
	private int life;
	private static final int MAX_LIFE = 150;
	private static Random r = new Random();
	public BasicFighter(int attack) {
		// TODO Auto-generated constructor stub
		this.attack = attack;
		this.defense = POINTS - attack;
		this.life = MAX_LIFE;
	}
	@Override
	public int attack() {
		return r.nextInt(this.attack) + 1;
	}

	@Override
	public int defend() {
		return r.nextInt(this.defense) + 1;
	}

	@Override
	public int getCurrentLife() {
		return this.life;
	}

	@Override
	public int getMaxLife() {
		return MAX_LIFE;
	}

	@Override
	public int getAttackStat() {
		return this.attack;
	}

	@Override
	public int getDefenseStat() {
		return this.defense;
	}

	@Override
	public boolean damage(int damage) {
		this.life =- damage;
		return this.alive();
	}

	@Override
	public boolean alive() {
		return this.life > 0;
	}
}
