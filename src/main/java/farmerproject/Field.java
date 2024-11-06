package farmerproject;

import java.util.ArrayList;
import java.util.List;


public class Field {
    private List<Crop> cropRows;

    public Field(List<Crop> cropRows) {
        this.cropRows = cropRows;
    }

    public void setCropRows(List<Crop> cropRows) {
        this.cropRows = cropRows;
    }

    public Field (){
        cropRows= new ArrayList<>();
    }
    public void addCropRow (Crop crop){
        cropRows.add(crop);
    }
    public List<Crop> getCropRows(){
        return cropRows;
    }
}

