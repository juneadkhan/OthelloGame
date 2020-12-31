package othello;


import java.util.Iterator;

/* 
 * SpotBoard
 * 
 * A 2D field of Spots.
 * 
 * getSpotWidth() and getSpotHeight() retrieve geometry of SpotBoard.
 * 
 * The upper left spot is spot (0,0) and the lower right
 * spot is considered (getSpotWidth()-1, getSpotHeight()-1).
 * 
 * The method getSpotAt(int x, int y) will return the spot at position (x,y).
 * Throws IllegalArgumentException if x or y is illegal.
 * 
 * The SpotBoard provides convenience methods addSpotListener() and removeSpotListener()
 * for SpotListeners to register / deregister with all of the spots on the board.
 * 
 * SpotBoard extends Iterable<Spot> meaning the method iterator()
 * will provide an iterator of type Iterator<Spot> that will traverse each
 * spot on the board (order up to implementation).
 * 
 */


public interface SpotBoard extends Iterable<Spot> {

	int getSpotWidth();
 
	int getSpotHeight();

	Spot getSpotAt(int x, int y);

	void addSpotListener(SpotListener spot_listener);

	void removeSpotListener(SpotListener spot_listener);

	Iterator<Spot> iterator();

}