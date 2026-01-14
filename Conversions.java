package Projects;
import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        System.out.println("Conversions\n");
        
        do {
            System.out.println("\n1. Temperature\n2. Length\n3. Weight\n4. Digital Data\n5. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            System.out.println();
            
            int sub;
            double input, result; 
            
            switch(choice) {
                case 1:
                    System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3. Celsius to Kelvin\n4. Kelvin to Celsius");
                    System.out.print("Enter your choice : ");
                    sub = sc.nextInt();
                    switch(sub) {
                        case 1:
                            System.out.print("Enter temperature in Celsius: ");
                            input = sc.nextDouble();
                            result = (input * 9 / 5) + 32;
                            System.out.println(input + "°C = " + result + "°F");
                            break;
                        case 2:
                            System.out.print("Enter temperature in Fahrenheit: ");
                            input = sc.nextDouble();
                            result = (input - 32) * 5 / 9;
                            System.out.println(input + "°F = " + result + "°C");
                            break;
                        case 3:
                            System.out.print("Enter temperature in Celsius: ");
                            input = sc.nextDouble();
                            result = input + 273.15;
                            System.out.println(input + "°C = " + result + "°K");
                            break;
                        case 4:
                            System.out.print("Enter temperature in Kelvin: ");
                            input = sc.nextDouble();
                            result = input - 273.15;
                            System.out.println(input + "°K = " + result + "°C");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break; 

                case 2:
                    System.out.println("1. KM to Miles\n2. Miles to KM\n3. Meters to Foot\n4. Foot to Meters\n5. CM to Feet and Inches\n6. Feet and Inches to CM");
                    System.out.print("Enter your choice : ");
                    sub = sc.nextInt();
                    switch(sub) {
                        case 1:
                            System.out.print("Enter length in KM: ");
                            input = sc.nextDouble();
                            result  = input * 0.621371;
                            System.out.println(input + " KM = " + result + " miles");
                            break;
                        case 2:
                            System.out.print("Enter length in miles: ");
                            input = sc.nextDouble();
                            result  = input * 1.60934;
                            System.out.println(input + " miles = " + result + " KM");
                            break;
                        case 3:
                            System.out.print("Enter length in meters: ");
                            input = sc.nextDouble();
                            result  = input * 3.28084;
                            System.out.println(input + " meters = " + result + " feet");
                            break;
                        case 4:
                            System.out.print("Enter length in feet: ");
                            input = sc.nextDouble();
                            result  = input * 0.3048;
                            System.out.println(input + " feet = " + result + " meters");
                            break;
                        case 5:
                            System.out.print("Enter length in cm: ");
                            input = sc.nextDouble();
                            double totalInches = input * 0.393701;
                            int feetPart = (int) (totalInches / 12);
                            double inchesPart = totalInches % 12;                            
                            System.out.println(input + " cm = " + feetPart + " feet " + inchesPart + " inches");
                            break;
                        case 6:
                            System.out.print("Enter feet : ");
                            double feet = sc.nextDouble();
                            System.out.print("Enter inches : ");
                            double inches = sc.nextDouble();
                            result = ((feet * 12) + inches) * 2.54;                            
                            System.out.println(feet + " feet " + inches + " inches = " + result + " cm");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;

                case 3:
                    System.out.println("1. Kg to Pounds\n2. Pounds to Kg");
                    System.out.print("Enter your choice : ");
                    sub = sc.nextInt();
                    switch(sub) {
                        case 1:
                            System.out.print("Enter weight in Kg: ");
                            input = sc.nextDouble();
                            result = input * 2.20462;
                            System.out.println(input + " Kg = " + result + " pounds");
                            break;
                        case 2:
                            System.out.print("Enter weight in pounds: ");
                            input = sc.nextDouble();
                            result = input * 0.453592;
                            System.out.println(input + " pounds = " + result + " Kg");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break; 

                case 4:
                    System.out.println("1. MB to GB\n2. GB to MB\n3. GB to TB\n4. TB to GB");
                    System.out.print("Enter your choice : ");
                    sub = sc.nextInt();
                    switch(sub) {
                        case 1:
                            System.out.print("Enter data in MB: ");
                            input = sc.nextDouble();
                            result = input / 1024.0;
                            System.out.println(input + " MB = " + result + " GB");
                            break;
                        case 2:
                            System.out.print("Enter data in GB: ");
                            input = sc.nextDouble();
                            result = input * 1024.0;
                            System.out.println(input + " GB = " + result + " MB");
                            break;
                        case 3:
                            System.out.print("Enter data in GB: ");
                            input = sc.nextDouble();
                            result = input / 1024.0;
                            System.out.println(input + " GB = " + result + " TB");
                            break;
                        case 4:
                            System.out.print("Enter data in TB: ");
                            input = sc.nextDouble();
                            result = input * 1024.0;
                            System.out.println(input + " TB = " + result + " GB");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;

                case 5:
                    System.out.println("Byeee!!");
                    break;

                default:
                    if(choice != 5) System.out.println("Invalid Choice");
            }
        } while (choice != 5);
        
        sc.close();
    }
}