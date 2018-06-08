public class MarsRover {
    private  Point coordinate;
    private  Compass compass;
    private final Point plateau;

    public MarsRover(Point coordinate, Compass compass, Point plateau) {
        this.coordinate = coordinate;
        this.compass = compass;
        this.plateau = plateau;
    }

    public String getPosition() {
        return  coordinate.toString()+" "+compass;
    }

    public void doInstruction(String message) {
        for (Character character:message.toCharArray()) {
            switch(character){
                case 'L' : compass=Direction.rotateLeft(compass); break;
                case 'R' : compass=Direction.rotateRight(compass); break;
                case 'M' : increaseCoordinate(); break;
            }
        }
    }

    private void increaseCoordinate() {
        switch (compass){
            case N: coordinate = coordinate.increaseY(); break;
            case E: coordinate = coordinate.increaseX(); break;
            case W: coordinate = coordinate.decreaseX(); break;
            case S: coordinate = coordinate.decreaseY(); break;
        }
    }


}
