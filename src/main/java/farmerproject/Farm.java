package farmerproject;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Stable> stables = new ArrayList<>();
    private List<Chicken> chickens = new ArrayList<>();
    private FarmHouse farmHouse;
    private Field field;

    public Farm (FarmHouse farmHouse){
        this.farmHouse = farmHouse;
    }
    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public void addChicken(Chicken chicken) {
        chickens.add(chicken);
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}
