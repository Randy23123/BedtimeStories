package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Scanner choose = new Scanner(System.in);

        int choice = 420;
        while (choice != 4) {
            System.out.println("Pick a story:");
            System.out.println("1. Goldilocks");
            System.out.println("2. Hansel and Gretel");
            System.out.println("3. Mary had a little lamb");
            System.out.println("If you want to exit enter 4");

            try {
                FileInputStream goldi = new FileInputStream("src/main/resources/goldilocks.txt");
                FileInputStream siblings = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
                FileInputStream lamb = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner scanner1 = new Scanner(goldi);
                Scanner scanner2 = new Scanner(siblings);
                Scanner scanner3 = new Scanner(lamb);

                choice = choose.nextInt();
                switch (choice){
                    case 1:
                        while (scanner1.hasNextLine()) {
                            System.out.println(scanner1.nextLine());
                        }break;
                    case 2:
                        while (scanner2.hasNextLine()){
                            System.out.println(scanner2.nextLine());
                        }break;
                    case 3:
                        while (scanner3.hasNextLine()){
                            System.out.println(scanner3.nextLine());
                        }break;
                    case 4:
                        System.out.println("you have exited :)");
                        break;
                    default:
                        System.out.println("Wrong pick an option");
                }
            }
            catch (IOException e){
                System.out.println("Wrong");
            }
        }
    }
}
