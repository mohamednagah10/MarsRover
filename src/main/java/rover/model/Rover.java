package rover.model;

import java.awt.Point;

import java.util.Set;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class Rover {
	
    private  Integer x = 0;	// Starting x-coordinate
    private  Integer y  =0; 	// Starting y-coordinate
    private  Direction direction = Direction.NORTH; 
    private Set<Point> obstacles ;
    private String status;
    
    public Point getNextPoint(Direction direction) {
        Integer newX = x;
        Integer newY = y;
        if (direction == Direction.NORTH) {
            newY++;
        } else if (direction == Direction.EAST) {
            newX++;
        } else if (direction == Direction.SOUTH) {
            newY--;
        } else if (direction == Direction.WEST) {
            newX--;
        }
//        System.out.println("nextPoint" + newX + "" + newY);
        return new Point(newX, newY);
    }


    public void updatePosition(Point point , String stat) {
        x = point.x;
        y = point.y;
        status = stat;
    }

    public String getPosition( ) {    	
    		return String.format("(%d, %d) %s %s",  x, y, direction , status);
    }
}
