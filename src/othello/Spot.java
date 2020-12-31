package othello;


import java.awt.Color;

/*
 * Spot
 * 
 * A Spot knows about which SpotBoard it is associated with as well as its
 * x and y position on the board. These can be accessed as getters for
 * properties X, Y, and Board.
 * 
 * A Spot is either empty or not empty. A Spot is constructed as empty.
 * The empty status can be checked with isEmpty(), set as not empty with setSpot(),
 * cleared to empty with clearSpot(), and toggled with toggleSpot().
 * 
 * Similarly, a spot is either highlighted or not. Highlight methods are:
 * isHighlighted(), highlightSpot(), unhighlightSpot(), toggleHighlight().
 * 
 * A Spot has three mutable color properties that can be configured:
 * 		SpotColor - The color used to draw the spot if the spot has been set.
 * 		Background - Background color of the spot.
 *      Highlight - Highlight color of the spot. 
 *      
 * Spot will paint itself with the current background, an oval filled spot if 
 * not empty and framed by a 4 pixel wide stroke in the highlight color if highlighted.
 * 
 * A Spot is observable to objects that implement SpotListener.
 * Spot listeners are informed about "enter", "exit", and "click" events.
 * It is up to an implementation to determine how / when those are events occur.
 * 
 * Register and deregister methods are addSpotListener() and removeSpotListener()
 * 
 * getCoordString() constructs coordinate string as "(x,y)"
 * 
 */

public interface Spot {

	int getSpotX();
	int getSpotY();
	SpotBoard getBoard();

	boolean isEmpty();
	void setSpot();
	void clearSpot();
	default void toggleSpot() {
		if (isEmpty()) {
			setSpot();
		} else {
			clearSpot();
		}
	}

	boolean isHighlighted();
	void highlightSpot();
	void unhighlightSpot();
	default void toggleHighlight() {
		if (isHighlighted()) {
			unhighlightSpot();
		} else {
			highlightSpot();
		}
	}

	void setBackground(Color c);
	Color getBackground();
	void setSpotColor(Color c);
	Color getSpotColor();
	void setHighlight(Color c);
	Color getHighlight();

	void addSpotListener(SpotListener l);
	void removeSpotListener(SpotListener l);

	default String getCoordString() {
		return "(" + getSpotX() + ", " + getSpotY() + ")";
	}
}