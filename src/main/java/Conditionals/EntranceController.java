package Conditionals;

public class EntranceController {

    public static String toManyHumans(int persons){

        if (persons > 30){
        return "Zu viele Personen!";
        } else {
           return "Maximale Personenzahl nicht ├╝berschritten";
        }

        }

}
