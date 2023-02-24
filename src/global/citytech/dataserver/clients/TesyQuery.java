package global.citytech.dataserver.clients;

import java.util.Scanner;

public class TesyQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter letter : ");
        String userValue = sc.nextLine();

//        String userValue = "my name is";

        String [] cmd = userValue.split("\s");
//
        for (String ae: cmd
             ) {
            System.out.println(ae);
        }

    }

}
