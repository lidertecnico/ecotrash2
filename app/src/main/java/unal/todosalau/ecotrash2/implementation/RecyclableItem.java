package unal.todosalau.ecotrash2.implementation;

import unal.todosalau.ecotrash2.interfacez.Item;
import unal.todosalau.ecotrash2.interfacez.Recyclable;

public class RecyclableItem implements Item, Recyclable {
    private String name;
    private String category;
    private String recyclingCode;

    public RecyclableItem(String name, String category, String recyclingCode) {
        this.name = name;
        this.category = category;
        this.recyclingCode = recyclingCode;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getRecyclingCode() {
        return recyclingCode;
    }
}
