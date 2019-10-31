import java.util.*;
import java.util.concurrent.TimeUnit;

class perfect_1000_method {
    void perfect_1000(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter C to check numbers or E to exit: ");
        String choice = scanner.nextLine().toUpperCase();

        if(choice.equals("C") || choice.equals("CHECK")){
            System.out.println();
            int calculations = 0;
            ArrayList <String> List = new ArrayList<>();
            System.out.println("Enter your nine numbers one by one:");
            for(int i = 1;i <= 9;i++){
                System.out.print(">>> ");
                String num = scanner.nextLine();
                if (!num.equals("9") && !num.equals("8") && !num.equals("7") && !num.equals("6") && !num.equals("5") && !num.equals("4") && !num.equals("3") && !num.equals("2") && !num.equals("1") && !num.equals("0")){
                    System.out.println();
                    System.out.println("You must enter either 0, 1, 2, 3, 4, 5, 6, 7, 8 or 9.");
                    System.out.println();
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i--;
                }
                else{
                List.add(num);
                }
            }
            int number1 = 0;
            int number2 = 0;
            int number3 = 0;

            Random randomizer = new Random();
            while((number1 + number2 + number3) != 1000){
                int randomizer_var = randomizer.nextInt(7);
                switch(randomizer_var){
                    case 0:
                        Collections.swap(List, 0, 1);
                    case 1:
                        Collections.swap(List, 1, 2);
                    case 2:
                        Collections.swap(List, 2, 3);
                    case 3:
                        Collections.swap(List, 3, 4);
                    case 4:
                        Collections.swap(List, 4, 5);
                    case 5:
                        Collections.swap(List, 5, 6);
                    case 6:
                        Collections.swap(List, 6, 7);
                    case 7:
                        Collections.swap(List, 7, 8);
                }

                String str = String.join("", List.get(0), List.get(1), List.get(2));
                number1 = Integer.parseInt(str);

                String str2 = String.join("", List.get(3), List.get(4), List.get(5));
                number2 = Integer.parseInt(str2);

                String str3 = String.join("", List.get(6), List.get(7), List.get(8));
                number3 = Integer.parseInt(str3);

                if(number1 + number2 + number3 == 1000){
                    System.out.println();
                    System.out.println();
                    System.out.println("Number One: " + number1);
                    System.out.println("Number Two: " + number2);
                    System.out.println("Number Three: " + number3);
                    System.out.println("Total: 1000");
                    System.out.println();
                    perfect_1000();
                }
                else{
                    calculations++;
                    if(calculations>=3000){
                        System.out.println();
                        System.out.print("Not determined.");
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println();
                        perfect_1000();
                    }
                }
            }
        }
        else if(choice.equals("E")){
            System.out.println();
            System.out.println("Thank you for using our Perfect 1000 checker.");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
        else{
            System.out.println();
            System.out.println("Not an option!");
            System.out.println();
            perfect_1000();
        }
    }
}
