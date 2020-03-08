package pl.sda.mapy;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    public Reader() {
    }

    public void read(List list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}
