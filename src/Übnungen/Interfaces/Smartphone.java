package Übnungen.Interfaces;

import java.time.LocalTime;

public class Smartphone extends Telefon implements Uhr {
    private double displaygroesse;
    private SMS[] messages = new SMS[1000];

    public Smartphone(int id, String rufnummer, double displaygroesse) {
        super(id, rufnummer);
        this.displaygroesse = displaygroesse;
    }

    public double getDisplaygroesse() {
        return displaygroesse;
    }

    public int getAnzahlSMS() {
        int anzahlSms = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                anzahlSms++;
            }
        }
        return anzahlSms;
    }

    public int addSMS(int empfaengerId, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                SMS sms = new SMS(empfaengerId, text);
                messages[i] = sms;
                return i;
            }
        }
        return -1;
    }

    public void ausgabenSMS() {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                SMS sms = messages[i];
                System.out.println(sms);
            }
        }
    }

    @Override
    public LocalTime getUhrzeit() {
        return LocalTime.now();
    }

    @Override
    public String toString() {
        String erg = "";
        erg += super.toString() + ", Displaygröße: " + displaygroesse;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                SMS sms = messages[i];
                erg += "\n" + sms.toString();
            }
        }
        return erg;
    }
}