// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW30 -- Ye Olde Role Playing Game, Expanded
// 2017-11-09

public class Demon extends Monster{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    
    public Demon() {
	
	_hitPts = 90;
	_strength =  10 + (int)( Math.random() * 45 ); // [10,55);
	_defense = 20;
	_attack = 1;
    }
    
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    
    public Demon( String name ) {
	this();
	_name = name;
    }
    
}
