package presenter;

import model.HotDrink;

import java.util.List;

public interface Model {
    HotDrink getProduct(String name);
    void addDrink(String name, int val, int temp);
    List<HotDrink> getList();

}
