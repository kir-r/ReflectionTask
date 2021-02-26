import com.epam.electricalAppliance.ElectricalAppliance;
import com.epam.electricalAppliance.Iron;
import com.epam.electricalAppliance.Shaver;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ElectricityMeter {
    private int totalSpentEnergy;
    private ArrayList<ElectricalAppliance> list;

    public ElectricityMeter(ArrayList<ElectricalAppliance> list) {
        this.list = list;
    }

    public int getTotalSpentEnergy() {
        try {
            for (ElectricalAppliance electricalAppliance : list) {
                if (electricalAppliance.isPluggedIn()) {
                    Class clazz = electricalAppliance.getClass();
                    Field powerConsumption = clazz.getDeclaredField("powerConsumption");
                    powerConsumption.setAccessible(true);
                    System.out.println("Available field due reflection: " + powerConsumption);
                    System.out.println("Value of field : " + (int) powerConsumption.get(electricalAppliance));
                    totalSpentEnergy += (int) powerConsumption.get(electricalAppliance);
                }
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return totalSpentEnergy;
    }
}