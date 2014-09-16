import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;


    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        // 查詢特定元素的位置，找不到的話，return -1        
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            if(locationCells.isEmpty()) {
                result = "kill";
            }
            else {
                result = "hit";
            }
        }
        return result;
    }

}