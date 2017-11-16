# YoRPG_Bang-Bang-Celery
APCS1 YoRPG
-------------------------------------------------------
## Plan: Vision
To produce a game with more playability and more choices.
------------------------------------------------------- 
## Feature Additions
* Use of Number of Monsters Slain to determine ending of game instead of encounters;
* magic() method in Protagonists
* normalize() & specialize() in Monsters
* more detailed about() in Protagonists
------------------------------------------------------
## Code Restructurings
* no need of encounters
* Monsters have different attack status (normal & special)
------------------------------------------------------
## How to play our game
1. Choose your difficulty (input n, n is an integer from one to three)
2. Select your type(1 == Archer; 2 == Sorcerer; 3 == Warrior), and only your type
3. Encounter Monster and fight
  * Choose if you feel to be lucky (1 == Normal Attack; 2 == Special Attack; 3 ==  magic), and only choose that.
4. Repeat till fate decides 'tis over
  

-----------------------------------------------------
## Character
-------------------------------------------------------
### Protagonists   


#### Archer
* HP:90
* Strength:80
* Defense: 30 (sp 10)
* Attack Rating: .9(sp 1.6)
* Info: The Archeris weak in defense but her hitpoints and attack are higher
* magic: 0<= x <20, x is integer, hitpoints -x, strength +x

#### Sorcerer
* HP:60
* Strength:70 (sp 100; if strength<70, normalize = strength +10, else strength =70 )
* Defense: 60 (sp -=30)
* Attack Rating: .6(sp .8)
* Info: The Sorcerer has a high defense and attack while sacrificing hit-points to achieve such magic
* magic: defense + 3, attack +.1, strength /10

#### Warrior
* HP:60
* Strength:125
* Defense: 50 (sp 30)
* Attack Rating: .8(sp 1)
* Info: The Warrior has uncomparable strength but his life weak as the magician's
* magic: -3<=x<4, x is integer, hitpoints +x, strength -x
-------------------------------------------------------------
### Monsters
* HP:150
* Strength:20<=x<65
* Defense: 20
* Attack Rating: 1
* Info: Default values


#### Bandit
* HP:90
* Strength:10<=x<55
* Defense: 20 (sp 10)
* Attack Rating: 1 (sp 1.5)
* Info: Bandits have weak hit-points, high attack rating 

#### Beast
* HP:120
* Strength:70<=x<95
* Defense: 40 (sp 30)
* Attack Rating: .5 (sp 1)
* Info: Beasts are strong and fat but lack in spirit of attack 

#### Demon
* HP:80
* Strength:20<=x<35
* Defense: 70 (sp 30)
* Attack Rating: 1 (sp 2.5)
* Info: Demons are weak but enduring creatures, with strong intelligence
