package farmerproject;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    List<Farmer> farmerList = new ArrayList;

    public void addFarmer(Farmer farmer){
        farmerList.add(farmer);
    }
}
