
Requirements

    You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
    The rover receives a character array of commands.
    Implement commands that move the rover forward/backward (f,b).
    Implement commands that turn the rover left/right (l,r).
    Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point, aborts the sequence and reports the obstacle.

The implementation consists of three classes:

Rover: represents a rover on the surface of Mars
Direction: represents the rectangular grid that the rover moves on
RoverController: controls the movement of the rover based on a set of commands

The Rover class has a position (x, y), a direction (N, S, E, W), and a move() method that updates its position and direction based on a movement command.

The Direction class has a width and a height, and can check if a given position is within its bounds or contains an obstacle.

The RoverController class receives a set of commands as a string, initializes a Rover and a Direction, and uses the move() method of the Rover class to move the rover on the grid based on the commands. If the rover encounters an obstacle, it reports its final position and direction as "STOPPED".
