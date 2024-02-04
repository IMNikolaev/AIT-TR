package lesson_08;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = {"ВЫКЛЮЧЕН", "ТУСКЛЫЙ", "СРЕДНИЙ", "ЯРКИЙ"};
        int livingRoomIntensity = 0;
        int kitchenIntensity= 0;
        int bedRoomIntensity= 0;
        do {
            System.out.println("Выберите номер кнопки (1-6):");
            int button = scanner.nextInt();

            if (button == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (button){
                case (1):
                    livingRoomIntensity=3;
                    kitchenIntensity = 3;
                    bedRoomIntensity = 1;
                    break;
                case (2):
                    livingRoomIntensity=1;
                    kitchenIntensity = 3;
                    bedRoomIntensity = 3;
                    break;
                case (3):
                    livingRoomIntensity=2;
                    kitchenIntensity = 2;
                    bedRoomIntensity = 2;
                    break;
                case (4):
                    kitchenIntensity = 0;
                    break;
                case (5):
                    livingRoomIntensity += 1;
                    livingRoomIntensity = Math.min(livingRoomIntensity, 3);
                    kitchenIntensity += 1;
                    kitchenIntensity = Math.min(kitchenIntensity, 3);
                    break;
                case (6):
                    bedRoomIntensity -= 2;
                    bedRoomIntensity = Math.max(bedRoomIntensity, 0);
                    if (bedRoomIntensity <0) { bedRoomIntensity =0; }
                    break;
                default:
                    System.out.println("Неверный номер комнаты");
                    break;
            }
            System.out.println("Гостинная :"+ array[livingRoomIntensity]);
            System.out.println("Кухня :" +  array[kitchenIntensity]);
            System.out.println("Спальня :" +  array[bedRoomIntensity]);
        } while (true);
    }
}
