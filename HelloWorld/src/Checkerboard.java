import java.awt.*;
 
public class Checkerboard extends AnimationBase {

	/**
	 * @param args
	 */
	public void init() {
        // The init() method is called when the applet is first
        // created and can be used to initialize the applet.
        // Here, it is used to change the number of milliseconds
        // per frame from the default 100 to 30.  The faster
        // animation looks better.
     setMillisecondsPerFrame(100);
  }

	
	public void drawFrame(Graphics g) {
		int boardRow;
		int boardColumn;
		int x;
		int y;
		int movement = 0;
		
		movement = getFrameNumber() %40 ;
		
			for ( boardColumn = -8;  boardColumn < 8;  boardColumn++ ) {
				for (boardRow = -8;  boardRow < 8;  boardRow++ ) {
					x = boardRow * 20;
					y = boardColumn * 20;
					if ((boardRow % 2 == boardColumn % 2) && boardRow % 2 == 0){
						g.setColor(Color.red);
						g.fillRect(x + movement -20,y,20,20);
						if (movement > 0){
							g.setColor(Color.red);
							g.fillRect(movement,y,20 - (20-movement),20);
							g.setColor(Color.red);
							g.fillRect(140,y,20 - (20-movement),20);
						}
						if (movement > 20){
							g.setColor(Color.red);
							g.fillRect(movement,y,20 - (20-(movement-20)),20);
							g.setColor(Color.red);
							g.fillRect(140,y,20 - (20-(movement-20)),20);
						}
					}
					else if ((boardRow % 2 == boardColumn % 2) && boardRow % 2 != 0){
						g.setColor(Color.red);
						g.fillRect(x - movement -20,y,20,20);
						if (movement > 0){
							g.setColor(Color.red);
							g.fillRect(x - movement,y,20 - (20-movement),20);
							g.setColor(Color.black);
							g.fillRect(140 - movement,y,20,20);
						}
						if (movement > 20){
							g.setColor(Color.red);
							g.fillRect(x - movement,y,20 - (20-(movement-20)),20);
							g.setColor(Color.black);
							g.fillRect(140 - movement,y,20,20);
						}
					}
					else if ((boardRow % 2 != boardColumn % 2) && boardRow % 2 != 0){
						g.setColor(Color.black);
				 		g.fillRect(x + movement -20,y,20,20);
						if (movement > 0){
							g.setColor(Color.black);
							g.fillRect(movement,y,20,20);
						}
						if (movement > 20){
							g.setColor(Color.black);
							g.fillRect(movement,y,20,20);
						}
					}
					else {
						g.setColor(Color.black);
						g.fillRect(x - movement -20,y,20,20);
						if (movement > 0){
							g.setColor(Color.black);
							g.fillRect(x - movement,y,20 - (20- movement),20);
						}
						if (movement > 20){
							g.setColor(Color.black);
							g.fillRect(x - movement,y,20 - ((movement-20)),20);
						}
					}
				}
			}
		
		
		
	}
	

}
