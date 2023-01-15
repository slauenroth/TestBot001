package main;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Hauptklasse {
    public static void main(String[] args) {
        String token = "MTAzNzg0MTU3OTI5MDkzOTUyMw.GThzJZ.MIl7w7QOrVobWBDtKD5XgCcMtc--uZ2KScrAD8";
        String status = "Test!";

        JDABuilder bauplan = JDABuilder.createDefault(token);

        bauplan.setStatus(OnlineStatus.ONLINE);
        bauplan.setActivity(Activity.playing(status));

        bauplan.addEventListeners(new NachrichtenReaktion());

        bauplan.build();

        System.out.println("Bot ist online");
    }
}