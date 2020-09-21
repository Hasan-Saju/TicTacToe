# TicTacToe

The basic game UI:
There are two horizontal and two black vertical lines
In the right part there are three radio button containing 
three theme options.
1.Classic Theme
2.Forrest Theme
3.High Contrast Theme 

There are two oppponent to play agains.
1. RandomAI
2. DefensiveAI

As a Player, Human will make the first move always. 
Human should not be able to make a move when waiting for AI move.
As a player, I want the AI player to make a move as soon as I complete my move.

As a player, I will start a new game with a specific AI opponent.
As a player, I will change the theme of the game anytime.

As a player, I want the classic theme to be available. The classic theme should look as follows:

1. The background should be white
2. The lines should be black
3. The pieces should be X for the human player and O for the AI


As a player, I want the forest theme to be available. The classic theme should look as follows:

1. The background will be light green
2. The lines will be dark green
3. Human player's symbols will be (any good looking) flower
4. The AI player's symbol will be (any tasty) fruit


As a player, I want the high contrast theme to be available. The high contrast theme should look as follows:

1. The background will be dark grey
2. The lines will be light grey
3. A cell occupied by the human player will be coloured black
4. A cell occupied by the AI player will be coloured white

AI Random:
As a player, I want to play with a random AI opponent. After the human player makes a move, 
the random AI player will select a random unoccupied cell.

AI Defensive:
As a player, I want to play with a defensive AI opponent. The AI should work as follows

1 Case: The human player is occupying two cells in a line and the third cell is empty:
		i.Occupy the third cell
2 Case: Otherwise
		ii.Occupy a random cell
		
Game End:
As a player, I want the ending of the game is correctly identified.

1. If a player has occupied three cells in a line, the game should end and the player wins
		i.When this happens, the three cells will be connected with a line

2. No moves available but the first condition does not satisfy, the game ends with a draw