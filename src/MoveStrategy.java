import java.util.List;


public interface MoveStrategy{
    public Cell chooseNextLocation(List<Cell> possibleLocations);
    
}

