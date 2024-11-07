package farmerproject;


import java.util.ArrayList;
import java.util.List;

public class Stable {

    List<Horse> listOfHorses = new ArrayList<>();

    public Stable(List<Horse> listOfHorses) {
        this.listOfHorses = listOfHorses;
    }

    public List<Horse> getListOfHorses() {
        return listOfHorses;
    }

    public void setListOfHorses(List<Horse> listOfHorses) {
        this.listOfHorses = listOfHorses;
    }

    public void addHorse(Horse horse){
        listOfHorses.add(horse);
    }
}
