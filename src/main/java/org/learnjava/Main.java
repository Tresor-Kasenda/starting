package org.learnjava;

import Model.UserModel;

import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User user = new User(
                "Scott Tresor",
                "scotttresor@gmail.com",
                "12345678",
                true
        );

        String name = reader.readLine();

        UserModel userModel = user
                .setName("Scott Tresor")
                .setEmail("tresor@gmail.com")
                .setPassword("12345678")
                .setStatus(true);

        printUser(userModel);
        System.out.println(list.get(0));
        System.out.println(name);
    }

    public static void printUser(UserModel user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Status: " + user.isStatus());
    }

}