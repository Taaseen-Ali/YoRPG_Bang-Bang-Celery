// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW30 -- 
// 2017-11-09

public class Character{
    public int health;
    public int strength;
    public int defense;
    public double attackRating;
    
    public boolean isAlive() {
	return health >0;
    }

    public int getDefense() {
	return defense;
    }
    
    public void lowerHP(int decrease) {
	health -= decrease;
    }
    
    public int attack(Character enemy) {
	int damage = ((int) (strength * attackRating)) - enemy.getDefense();
	if ((int)strength * attackRating < enemy.getDefense()){
	    damage = 0;
	}
	enemy.lowerHP(damage);
	return damage;
    }
}
