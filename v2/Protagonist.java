// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08
public class Protagonist extends Character {
    
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    
    private String name;
    private double normalAttackRating;
    private int fullHealth;
	   
    private int normalStrength;
    private int normalDefense;
    
    
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    
    public Protagonist( String input ) {
	name = input;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
	
	fullHealth = health;
	normalStrength = strength;
	normalDefense = defense;
	normalAttackRating = attackRating;
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
    

    public String getName() {
	return name;
    }

    public void specialize(){
	
	defense -= ((int)(Math.random() * 50));
	attackRating += Math.random();
	
    }
    public void normalize(){
	defense = normalDefense;
	attackRating = normalAttackRating;
	

    }
    
    


    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

}
    
