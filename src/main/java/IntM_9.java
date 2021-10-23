public class IntM_9 {
    public String answer (int num) {
        if (num == 15){
            return "Good Number";
        } else if (num % 3 == 0 && num % 5 != 0){
            return "Bad Number";
        } else if (num % 5 == 0 && num % 3 != 0){
            return "Poor Number";
        }
        return "-1";
    }
}
