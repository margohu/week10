package week;

public class Ex5 {
    public static void main(String[] args) {
        Integer days = 365;
        Integer hours = 24;
        Integer minutes = 60;
        Integer seconds = 60;
        Integer secondsInYear = days * hours * minutes * seconds;
        Integer secondsInTenYear = secondsInYear * 10;
        System.out.println("Aastas on " + (secondsInYear) + " " + "sekundit ja kümnes aastas on " + secondsInTenYear + " " + "sekundit");
    }
}