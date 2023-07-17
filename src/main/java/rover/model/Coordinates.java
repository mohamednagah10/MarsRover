package rover.model;

public enum Coordinates {

	 F {
	        @Override
	        public void execute(Rover rover) {
	        	
	            rover.getDirection().move(rover);
	        }
	    },
	 
	    B {
	        @Override
	        public void execute(Rover rover) {
	            rover.getDirection().move(rover);
	        }
	    },
	    L {
	        @Override
	        public void execute(Rover rover) {
	            rover.setDirection(rover.getDirection().turnLeft());
	        }
	    },
	    R {
	        @Override
	        public void execute(Rover rover) {
	            rover.setDirection(rover.getDirection().turnRight());
	        }
	    };

	    public abstract void execute(Rover rover);

	    public static Coordinates fromString(String str) {
	        for (Coordinates Coordinates : values()) {
	            if (Coordinates.name().equals(str)) {
	                return Coordinates;
	            }
	        }
	        return null;
	    }
}
