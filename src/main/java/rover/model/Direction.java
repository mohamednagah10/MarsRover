package rover.model;

import java.awt.Point;

public enum Direction {
    NORTH {
        @Override
        public void move(Rover rover) {
            Point nextPoint = rover.getNextPoint(this);
            
            if (rover.getObstacles().contains(nextPoint)) {
            	
            	Point p = new Point(rover.getX(), rover.getY());
            	
            	rover.updatePosition(p, " STOPPED");
           			 
            } else {
                rover.updatePosition(nextPoint , " ");
            }
        }
    },
    EAST {
        @Override
        public void move(Rover rover) {
            Point nextPoint = rover.getNextPoint(this);
            if (rover.getObstacles().contains(nextPoint)) {
            	
            	Point p = new Point(rover.getX(), rover.getY());
            	
            	rover.updatePosition(p, " STOPPED");
           			 
            } else {
                rover.updatePosition(nextPoint , " ");
            }
        }
    },
    SOUTH {
        @Override
        public void move(Rover rover) {
            Point nextPoint = rover.getNextPoint(this);
            if (rover.getObstacles().contains(nextPoint)) {
            	
            	Point p = new Point(rover.getX(), rover.getY());
            	
            	rover.updatePosition(p, " STOPPED");
           			 
            } else {
                rover.updatePosition(nextPoint , " ");
            }
        }
    },
    WEST {
        @Override
        public void move(Rover rover) {
        	
            Point nextPoint = rover.getNextPoint(this);
if (rover.getObstacles().contains(nextPoint)) {
            	
            	Point p = new Point(rover.getX(), rover.getY());
            	
            	rover.updatePosition(p, " STOPPED");
           			 
            } else {
                rover.updatePosition(nextPoint , " ");
            }        }
    };

    public abstract void move(Rover rover);

    public Direction turnLeft() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % 4];
    }
    
    
}