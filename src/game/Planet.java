package game;

/*
 * The maximum value for properties will be 50. This will allow for information
 * to be more easily displayed to the screen. 
 */

public class Planet {
	
	// This will be used to decide which tier the player is playing in currently.
	private int tier = 1;
	
	// This is the constant to adjust base difficulty
	private int BASE_STATS = 10;
	
	/* This will allow the user to set the difficulty of the game
	 * 3 = easy
	 * 2 = medium
	 * 1 = hard
	 * The reason this is backwards to what you would normally expect is so
	 * that I can apply the difficulty as a modifier for the starting values
	 */
	private int difficulty;
	
	// Tier one variables
	private int water;
	private int land;
	private int air;
	
	// Tier two variables
	private int plants;
	private int herbivores;
	private int carnivores;
	// also water
	
	//  Tier three variables
	private int humans;
	private int animals;
	// also water
	// also plants
	
	/* Boolean values to indicate which items are being used currently.
	 * This is to make accessing information for displaying easier using
	 * if statements and the like.
	 */
	//TODO: These can also be removed if unnecessary
//	private boolean waterBool = false;
//	private boolean landBool = false;
//	private boolean airBool = false;
//	private boolean plantsBool = false;
//	private boolean herbivoresBool = false;
//	private boolean carnivoresBool = false;
//	private boolean humansBool = false;
//	private boolean animalsBool = false;
	
	// Empty Constructor
	public Planet(){
		this.tier = 1;
		this.difficulty = 3;
		this.setAll(BASE_STATS * this.difficulty);
	}
	
	// Tier Constructor
		public Planet(int tier){
			this.tier = tier;
			this.difficulty = 3;
			this.setAll(BASE_STATS * this.difficulty);
		}
	
	// Non-Boolean Constructor
	public Planet(int tier, int difficulty, int water, int land, int air, int plants, int herbivores, int carnivores,
			int humans, int animals) {
		super();
		this.tier = tier;
		this.difficulty = difficulty;
		this.water = water;
		this.land = land;
		this.air = air;
		this.plants = plants;
		this.herbivores = herbivores;
		this.carnivores = carnivores;
		this.humans = humans;
		this.animals = animals;
		// The following line would defeat the purpose of inputting all the values individually
//		this.setAll(BASE_DIFFICULTY * difficulty);
	}
	
	// Getters and Setter
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getLand() {
		return land;
	}
	public void setLand(int land) {
		this.land = land;
	}
	public int getAir() {
		return air;
	}
	public void setAir(int air) {
		this.air = air;
	}
	public int getPlants() {
		return plants;
	}
	public void setPlants(int plants) {
		this.plants = plants;
	}
	public int getHerbivores() {
		return herbivores;
	}
	public void setHerbivores(int herbivores) {
		this.herbivores = herbivores;
	}
	public int getCarnivores() {
		return carnivores;
	}
	public void setCarnivores(int carnivores) {
		this.carnivores = carnivores;
	}
	public int getHumans() {
		return humans;
	}
	public void setHumans(int humans) {
		this.humans = humans;
	}
	public int getAnimals() {
		return animals;
	}
	public void setAnimals(int animals) {
		this.animals = animals;
	}
	public int getTier() {
		//TODO: Remove this code if found to be completely unnecessary.
//		switch(tier){
//		case 1:
//			this.setAirBool(true);
//			this.setAnimalsBool(false);
//			this.setCarnivoresBool(false);
//			this.setHerbivoresBool(false);
//			this.setHumansBool(false);
//			break;
//		case 2:
//			break;
//		case 3:
//			
//			break;
//		default:
//			/* This will force the game to use tier 1 if somehow it tries to
//			 * use a tier that does not exist. It will set the tier to 1,
//			 * then it will call this method recursively so that it can
//			 * get the tier(1) and return it properly from this method.
//			 * It stores the return in the variable tier before breaking.
//			*/
//			this.setTier(1);
//			tier = this.getTier();
//			break;
//		}
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	//TODO: Remove these if unecessary
//	public boolean isWaterBool() {
//		return waterBool;
//	}
//	public void setWaterBool(boolean waterBool) {
//		this.waterBool = waterBool;
//	}
//	public boolean isLandBool() {
//		return landBool;
//	}
//	public void setLandBool(boolean landBool) {
//		this.landBool = landBool;
//	}
//	public boolean isAirBool() {
//		return airBool;
//	}
//	public void setAirBool(boolean airBool) {
//		this.airBool = airBool;
//	}
//	public boolean isPlantsBool() {
//		return plantsBool;
//	}
//	public void setPlantsBool(boolean plantsBool) {
//		this.plantsBool = plantsBool;
//	}
//	public boolean isHerbivoresBool() {
//		return herbivoresBool;
//	}
//	public void setHerbivoresBool(boolean herbivoresBool) {
//		this.herbivoresBool = herbivoresBool;
//	}
//	public boolean isCarnivoresBool() {
//		return carnivoresBool;
//	}
//	public void setCarnivoresBool(boolean carnivoresBool) {
//		this.carnivoresBool = carnivoresBool;
//	}
//	public boolean isHumansBool() {
//		return humansBool;
//	}
//	public void setHumansBool(boolean humansBool) {
//		this.humansBool = humansBool;
//	}
//	public boolean isAnimalsBool() {
//		return animalsBool;
//	}
//	public void setAnimalsBool(boolean animalsBool) {
//		this.animalsBool = animalsBool;
//	}
	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	/**
	 * Description: This sets all values to whatever value we pass into it.
	 * 
	 * @param value is the value we will be setting everything to.
	 * 				this allows us to set specific values based on difficulty
	 */
	public void setAll(int value) {
		this.setAir(value);
		this.setAnimals(value);
		this.setCarnivores(value);
		this.setHerbivores(value);
		this.setHumans(value);
		this.setLand(value);
		this.setPlants(value);
		this.setWater(value);
	}

	@Override
	public String toString() {
		return "Planet [tier=" + tier + ", BASE_STATS=" + BASE_STATS + ", difficulty=" + difficulty + ", water=" + water
				+ ", land=" + land + ", air=" + air + ", plants=" + plants + ", herbivores=" + herbivores
				+ ", carnivores=" + carnivores + ", humans=" + humans + ", animals=" + animals + "]";
	}
	
	
	
	

}
