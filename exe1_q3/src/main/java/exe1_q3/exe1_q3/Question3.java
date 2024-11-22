package exe1_q3.exe1_q3;

public class Question3 {
    public static String compare(double a, double b, String mod) {
        switch (mod) {
            case "regular":
                return a < b ? "B" : "A";

            case "negative":
                return -a < -b ? "B" : "A";
                
            case "reciprocals":
                if (a == 0 || b == 0) {
                    return "ERROR"; 
                }
                return ((1 / a) >= (1 / b)) ? "A" : "B";
            default:
                return "ERROR"; 
        }
    }
}
    

