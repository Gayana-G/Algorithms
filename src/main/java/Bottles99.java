import java.util.Locale;

public class Bottles99 {
    public String buildNewString(String n, int index, char letter){
        String result = "";

        for (int i = 0; i < n.length(); i++) {
            if (i != index && n.charAt(i) != letter){
                result += n.charAt(i);
            }
        }
        return result;
    }

    public void printBottles99Song() {
        String bottles = " bottles of beer";
        String wall = " on the wall";
        String noMore = "No more";
        String comma = ", ";
        String period = ".";

        String takeOneDown = "Take one down and pass it around, ";
        String goToTheStore = "Go to the store and buy some more, ";


        for (int i = 99; i >= 0 ; i--) {
            String firstLine99To2 = i + bottles+  wall + comma + i + bottles + period;
            if (i == 2){
                System.out.println(firstLine99To2);
                System.out.println(takeOneDown + (i-1) + buildNewString(bottles, 7, 's') + wall + period + "\n");
            }
            else if (i == 1){
                System.out.println(i + buildNewString(bottles, 7, 's') +  wall + comma + i + buildNewString(bottles, 7, 's') + period);
                System.out.println(takeOneDown + noMore.toLowerCase() + bottles + wall + period + "\n");
            }
            else if (i == 0){
                System.out.println(noMore + bottles +  wall + comma +
                        noMore.toLowerCase() + bottles + period);
                System.out.println(goToTheStore + 99 + bottles + wall + period + "\n");
            }
            else {
                    System.out.println(firstLine99To2);
                    System.out.println(takeOneDown + (i-1) + bottles  + wall + period + "\n");
            }


        }
    }


}
