import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println(action(56 ,32));
        System.out.println(action(25,20));
        System.out.println(action(14,-20));
        System.out.println(action(35,-34));
        System.out.println(action(10,39));
        System.out.println(action(generateRandomAge(),30));
    }
    public static String action(int age, int temperature){
        if (20<=age&&age<=45&&-20<=temperature&&temperature<=30){
            return "Можно идти гулять";
        }
        else if (20>=age&&0<=temperature&&temperature<=28){
            return "Можно идти гулять";


        } else if (45<=age&&-10<=temperature&&temperature<=25) {
            return "Можно идти гулять";

        }else {
            return "оставайся дома";
        }
    }//ДЗ на сообразительность:
    public static int generateRandomAge(){
        Random rand = new Random();
        int randomAge =rand.nextInt(100);
        return randomAge;
    }
}
