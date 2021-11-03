package io.turntabl;

import io.turntabl.enums.Levels;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Register {

    List<Client> clientRegister = Arrays.asList(
            new Corporate(1, "Jimmy Wo Ltd", Levels.GOLD, "Black Sam"),
            new Corporate(2, "Tower Ltd", Levels.PREMIUM, "Black Sam"),
            new Corporate(3, "Kingston Ltd", Levels.PLATINUM, "William Kid"),
            new Corporate(4, "Ghana Oil ltd", Levels.PREMIUM, "Read Head Shank"),
            new Corporate(5, "Price WaterHouse", Levels.PREMIUM, "Mick Lui"),
            new Private(6, "Mike Wills", Levels.PLATINUM),
            new Private(7, "Sandy Mini", Levels.GOLD),
            new Private(8, "Sandra Kumar", Levels.PLATINUM),
            new Private(9, "Ben Blur", Levels.PREMIUM)
            );


    public List<Client> getGoldClients(){
        return clientRegister.stream()
                .filter(client -> client.getServiceLevel().equals(Levels.GOLD))
                .collect(Collectors.toList());
    }

    public String getNameById(int id) {
        return clientRegister.stream().filter(a -> a.getID() == id).findFirst().toString();
    }

    public void countOfClientsAtServiceLevel() {
        for (Levels level: Levels.values()) {
            int count = (int) clientRegister.stream().filter(client -> client.getServiceLevel().equals(level)).count();
            System.out.println("---->>> "+level   +" has "+count+" clients.");
        }
    }

//    public static void main(String[] args) {
//        Register res  = new Register();
//
//        res.countOfClientsAtServiceLevel();
//    }
}
