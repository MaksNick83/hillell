package com.nikitchyn.homework11;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        AccountClient accountClient1 = new AccountClient("Maks", 1, 1, 1990, "min@ukr.net", "101", "Ivanov", 60, "120/80", 250);
        AccountClient accountClient2 = new AccountClient("Alex", 2, 3, 1995, "axn@ukr.net", "102", "Petrov", 70, "120/80", 250);
        AccountClient accountClient3 = new AccountClient("Oleg", 3, 3, 2000, "ick83@ukr.net", "103", "Sidorov", 80, "120/70", 250);
        AccountClient accountClient4 = new AccountClient("Nikita", 4, 3, 2001, "n83@ukr.net", "104", "Petrov", 50, "120/80", 250);
        AccountClient accountClient5 = new AccountClient("Slava", 5, 3, 2001, "k83@ukr.net", "105", "NIvanov", 90, "120/75", 250);

        AccountClient[] accountClients = new AccountClient[0];
        accountClients = addClient(accountClients, accountClient1);
        accountClients = addClient(accountClients, accountClient2);
        accountClients = addClient(accountClients, accountClient3);
        accountClients = addClient(accountClients, accountClient4);
        accountClients = addClient(accountClients, accountClient5);

        printInfoAccounts(accountClients, false);
        System.out.println("--------------------only Rename-----------------");
        //змінимо щось нашим клієнтам
        accountClient3.setSurname("Test1");
        accountClient5.setWeight(55);
        //виводимо тільки зміни
        printInfoAccounts(accountClients, true);
    }

    /**
     * Виводить дані про користувачів
     *
     * @param accountClients масив клієнтів
     * @param outChange      якщо true виводить тыльки змінені, false виводить всі
     */
    private static void printInfoAccounts(AccountClient[] accountClients, boolean outChange) {

        for (AccountClient accountClient : accountClients) {
            if (outChange) {
                if (accountClient.isChanged()) {
                    System.out.println(accountClient.printAccountInfo());
                }
            } else {
                System.out.println(accountClient.printAccountInfo());
            }
        }

    }

    private static AccountClient[] addClient(AccountClient[] accountClients, AccountClient accountClient) {
        AccountClient[] copyOf = Arrays.copyOf(accountClients, accountClients.length + 1);
        copyOf[copyOf.length - 1] = accountClient;
        return copyOf;
    }


}
