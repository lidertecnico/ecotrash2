package unal.todosalau.ecotrash2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import unal.todosalau.ecotrash2.implementation.RecyclableItem;
import unal.todosalau.ecotrash2.implementation.WasteItem;
import unal.todosalau.ecotrash2.interfacez.Item;

public class MainActivity extends AppCompatActivity {
    private TextView titleTextView;
    private TextView wasteItemTextView;
    private TextView recyclableItemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = findViewById(R.id.textView);
        titleTextView.setText("EcoTrach with Polymorphism");

        wasteItemTextView = findViewById(R.id.textView2);
        recyclableItemTextView = findViewById(R.id.textView3);

        // Ejemplo de uso de polimorfismo múltiple
        Item wasteItem = new WasteItem("Bolsa de plástico", "Residuos generales");
        Item recyclableItem = new RecyclableItem("Botella de agua", "Envases", "PET");

        String wasteItemInfo = "Nombre: " + wasteItem.getName() + "\nCategoría: " + wasteItem.getCategory();
        String recyclableItemInfo = "Nombre: " + recyclableItem.getName() + "\nCategoría: " +
                recyclableItem.getCategory() + "\nCódigo de reciclaje: " + ((RecyclableItem) recyclableItem).getRecyclingCode();

        wasteItemTextView.setText(wasteItemInfo);
        recyclableItemTextView.setText(recyclableItemInfo);
    }
}
