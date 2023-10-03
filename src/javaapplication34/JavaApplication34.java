/*USANDO IF*/

package javaapplication34;

import java.util.Scanner;

public class JavaApplication34 {

    public static void main(String[] args) {
        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("O xiru é maior de idade!");

        }

        if (idade < 18) {
            System.out.println("O xiru é criança!");

        }

        if (idade == 40) {
            System.out.println("Xiruzão da fanta!");
        }

        if (idade == 40) {

            if (idade > 40) {
                System.out.println("Xiruzão!");
            }
            
            if(idade<40){
                System.out.println("Mais xiruzão ainda!");
            }
        }

    }

}
