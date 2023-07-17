package rover.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class RoverService {
	
	@Autowired
	Rover rover;
	
	Direction direction;
	
	public void  executeCommands(String commandString) {
        for (char command : commandString.toCharArray()) {
            Coordinates c = Coordinates.fromString(String.valueOf(command));
            if (c != null) 
                c.execute(rover);
        	}
        
		}
	
	}
