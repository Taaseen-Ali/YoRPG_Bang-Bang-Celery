// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2017-11-09

public class Sorcerer extends Protagonist{

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    
    public Sorcerer() {
	
	_hitPts = 60;
	_strength = 90;
	_defense = 70;
	_attack = .6;
    }
    
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    
    public Sorcerer( String name ) {
	this();
	_name = name;
    }

    //prepare a Sorcerer for a special attack
    public void specialize()
    {
	_attack = .8;
	_defense = 50;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = .6;
	_defense = 70;
    }
}
   
