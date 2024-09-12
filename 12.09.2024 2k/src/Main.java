import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Wprowadz swoja wage: ");
    int weight = sc.nextInt();
    System.out.println("Wprowadz swoj wzrost(w centymetrach): ");
    double height  = sc.nextDouble();
    double bmi = weight / ((height/100) * (height/100));
    if (bmi < 18.5) {
        System.out.println("niedowaga");
    } else if(bmi > 18.5 && bmi < 24.9) {
        System.out.println("waga normalna");
    }else if(bmi > 25 && bmi < 29.9) {
        System.out.println("nadwaga");
    }else if(bmi > 30) {
        System.out.println("otyłość");
            }
        }
    }