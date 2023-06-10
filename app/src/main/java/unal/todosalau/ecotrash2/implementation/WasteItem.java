package unal.todosalau.ecotrash2.implementation;

import unal.todosalau.ecotrash2.interfacez.Item;

public class WasteItem implements Item {
    private String name;
    private String category;

    public WasteItem(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }
}
