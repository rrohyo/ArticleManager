package koreaIT;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" == 프로그램 시작 == ");

        Scanner sc = new Scanner(System.in);
        System.out.println("명령어");
        String cmd = sc.nextLine();

        System.out.println(cmd);

        if(cmd.equals("exit")) {
            System.out.println(" == 프로그램 종료 == ");
        }



        }
    }
