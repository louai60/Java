package Week_1.Day_1;

import java.util.Date;

public class AlfredBot {

    public String basicGreeting() {
        return "Hello, how can I help you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. How can I assist?", dayPeriod, name);
    }

    public String dateAnnouncement() {
        return String.format("The current date and time: %s", new Date());
    }

    public String answeringBeforeAlexis(String phrase) {
        if(phrase.indexOf("Alexis") > -1) {
            return "Alexis can't help. What do you need?";
        }
        if (phrase.indexOf("Alfred") > -1) {
            return "I'm here to help you. What can I do?";
        }
        return "I'm not sure what you mean. How can I assist?";
    }

   
}
