/*Для задания 3. Домашние элеткроприборы из модуля Internal Java Lab OOP in Java добавить класс
Прибор учета электроэнергии, который подсчитывает и выдает на экран показания суммарно потраченной
энергии всех включенных приборов, создать класс HackerToolkit, который может менять показания
Прибора учета электроэнергии, изменять потребялемый ток приборов.
(Очевидно, не должно быть setter'ов для поля "потребляемая мощность" у приборов и setter'а для поля
с общей подсчитанным показателем у объекта Прибор учета электроэнергии)*/


import com.epam.electricalAppliance.ElectricalAppliance;
import com.epam.electricalAppliance.Fridge;
import com.epam.electricalAppliance.Iron;
import com.epam.electricalAppliance.Shaver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shaver shaver = new Shaver(true, "Sharp LTD");
        Iron iron = new Iron(false, "Ariston LTD");
        Fridge fridge = new Fridge(true, "Daewoo Inc");

        ArrayList<ElectricalAppliance> list = new ArrayList<ElectricalAppliance>();
        list.add(shaver);
        list.add(iron);
        list.add(fridge);

//        int totalPowerConsumption = 0;
//        for (ElectricalAppliance ea : list) {
//            if (ea.isPluggedIn()) { //если включен в розетку;
//                totalPowerConsumption += ea.getPowerConsumption();
//            }
//        }
//        System.out.println("Total power consumption is " + totalPowerConsumption + " watt.");
//
//        list.sort(Comparator.comparing(ElectricalAppliance :: getPowerConsumption));
//        System.out.println("\nElectrical appliances sorted by power consumption, from lowest to highest");
//        for (ElectricalAppliance ea : list) {
//            System.out.println(ea);
//        }
        try {
//            System.out.println("\nSearching by power consumption.");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Enter lowest value of power consumption:");
//            int lowest = Integer.parseInt(reader.readLine());
//            System.out.println("Enter highest value of power consumption:");
//            int highest = Integer.parseInt(reader.readLine());
//
//            int count = 0;
//            for (ElectricalAppliance ea : list) {
//                if (ea.getPowerConsumption() >= lowest && ea.getPowerConsumption() <= highest) {
//                    System.out.println("Here's your electrical appliance in this power consumption range: " + ea.getName());
//                    count++;
//                }
//            }
//            if (count == 0) {
//                System.out.println("Sorry, we don't such a device.");
//            }

            System.out.println("Value of a total spent energy: " + new ElectricityMeter(list).getTotalSpentEnergy());
            System.out.println("Value of a hacked total spent energy: " + new HackerToolkit(list).setTotalSpentEnergy());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
