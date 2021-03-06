package cs1302.game;

/**
 * This class is the driver program for the {@code LatinSquaresGame}.
 * It reads a command line arguement as {@code args[0]} and creates a 
 * new {@code LatinSquaresGame} object. Then it runs the play method, 
 * starting the game. 
 * 
 * <p>
 * {@code args[0]} must be a pathway to the config file
 */
public class LatinSquaresDriver {
    public static void main (String[] args) {
	String config = args[0]; //String that specifies path to config file
	LatinSquaresGame lsGame = new LatinSquaresGame(config);
	lsGame.play(); //Plays the game		      
    }
}
