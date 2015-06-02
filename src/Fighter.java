
public interface Fighter {
	
	
	public int attack();
	
	public int defend();
	
	public int getCurrentLife();
	
	public int getMaxLife();
	
	public int getAttackStat();
	
	public int getDefenseStat();
	
	public boolean damage(int damage);
	
	public boolean alive();
	
}
