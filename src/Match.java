
public class Match {
	private Fighter fighterOne;
	private Fighter fighterTwo;
	
	public Match() {
		this.fighterOne = new BasicFighter(70);
		this.fighterTwo = new BasicFighter(30);
	}
	private void fightLoop(){
		while(this.fighterOne.alive() && this.fighterTwo.alive())
		{
			this.fighterOne.damage(this.fighterTwo.attack());
			this.fighterTwo.damage(this.fighterTwo.attack());
		}
	}
}
