import com.epam.electricalAppliance.ElectricalAppliance;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class HackerToolkit {
    ElectricityMeter hackedElectricityMeter;
    int hackedTotalSpentEnergy;
    ArrayList<ElectricalAppliance> list;

    public HackerToolkit(ArrayList<ElectricalAppliance> list) {
        this.list = list;
    }

    public int setTotalSpentEnergy() {
        try {
            Class clazz = Class.forName("ElectricityMeter");
            Class[] electricityMeterClassParams = {ArrayList.class};
            hackedElectricityMeter = (ElectricityMeter) clazz.getConstructor(electricityMeterClassParams).newInstance(list);
            Field totalSpentEnergy = clazz.getDeclaredField("totalSpentEnergy");
            totalSpentEnergy.setAccessible(true);
            totalSpentEnergy.set(hackedElectricityMeter, -1000000);
            hackedTotalSpentEnergy = (int) totalSpentEnergy.get(hackedElectricityMeter);

        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException | NoSuchMethodException
                | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return hackedTotalSpentEnergy;
    }
}
