import java.util.Scanner;

public class JavaFit {
    static String name;

    static void askName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("--------------------------------\n");

        if (name.isEmpty()) {
            for (int i = 1; i <= 100; i++) {
                System.out.print("Do you still want to continue? (Yes or No): ");
                String continueResponse = input.nextLine();
                System.out.print("\n--------------------------------\n");

                if (continueResponse.equalsIgnoreCase("yes")) {
                    askName();
                    break;
                } else if (continueResponse.equalsIgnoreCase("no")) {
                    System.out.print("Thank you for checking out our program.");
                    break;
                }
            }
        } else if (name.matches("[a-zA-Z]+")) {
            askAge();
        } else {
            System.out.print("Invalid input! Please enter a name with only alphabetic characters.\n");
            System.out.print("--------------------------------\n");
            askName();
        }
    }//name
    
    static void askAge() {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String age = Input.nextLine();
        System.out.print("--------------------------------\n");

        if (age.isEmpty()) {
            System.out.println("Age cannot be empty. Please try again. ");
            System.out.print("--------------------------------\n");
            
            askAge();
        } else {
            try {
                int number = Integer.parseInt(age);
                if (number >= 18 && (number <= 44)) {
                    bmiIndicator();
                } else {
                    System.out.println("Sorry. You must be 18-44 years old to use this program.");
                }
            } catch (NumberFormatException a) {
                System.out.print("Your age couldn't be a letter silly. Please ");
                askAge();
            }
        }
    }//age

    static double askWeight() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight (kg): ");
        String weight = input.nextLine();
        System.out.print("--------------------------------\n");

        if (weight.isEmpty()) {
            System.out.println("Please enter a valid Weight.\n--------------------------------\n");
            return askWeight();
        } else {
            try {
                double dWeight = Double.parseDouble(weight);
                if (dWeight >= 80) {
                    System.out.print("Please enter only average human weight.\n--------------------------------\n");
                    askWeight();
                }
                return dWeight;

            } catch (NumberFormatException a) {
                System.out.println("Invalid input. Weight must be numeric.\n--------------------------------");
                return askWeight();
            }
        }
    }//weight

    static void bmiIndicator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height (ft): ");
        String height = input.nextLine();
        System.out.print("--------------------------------\n");

        if (height.isEmpty()) {
            System.out.println("Please enter a valid Height.\n--------------------------------");
            bmiIndicator();
        } else {
            try {
                double dHeight = Double.parseDouble(height);
                if (dHeight >= 66.6) {
                    System.out.print("Please enter only average human height.\n--------------------------------\n");
                    bmiIndicator();
                } else {
                double doubleWeight = askWeight();
                double centimeters = dHeight * 30.48;
                double meters = centimeters / 100.0;
                double BMI = doubleWeight / (meters * meters);
                System.out.print("Weight: " + doubleWeight + " / " + "Height: " + meters + " * " + meters);
                System.out.print("\n--------------------------------\n");

                for (int i = 1; i <= 100; i++) {
                    System.out.print("Are you Male or Female: ");
                    String genderResponse = input.nextLine();
                    System.out.print("--------------------------------\n");

                    if (genderResponse.isEmpty()) {
                        System.out.print("You're supposed to pick among the two, ");
                    } else if (genderResponse.equalsIgnoreCase("male")) {

                        if (BMI <= 18.4) {
                            System.out.print("Underweight\n--------------------------------\n");
                            askWorkoutMethodM();
                        } else if (BMI <= 24.9) {
                            System.out.print("Normal\n--------------------------------\n");
                            askWorkoutMethodM();
                        } else if (BMI <= 29.9) {
                            System.out.print("Overweight\n--------------------------------\n");
                            askWorkoutMethodM();
                        } else if (BMI <= 39.9) {
                            System.out.print("Obese\n--------------------------------\n");
                            askWorkoutMethodM();
                        }//bmi result m

                    } else if (genderResponse.equalsIgnoreCase("female")) {

                        if (BMI <= 18) {
                            System.out.print("Underweight\n--------------------------------\n");
                            askWorkoutMethodF();
                        } else if (BMI <= 24.5) {
                            System.out.print("Normal\n--------------------------------\n");
                            askWorkoutMethodF();
                        } else if (BMI <= 29) {
                            System.out.print("Overweight\n--------------------------------\n");
                            askWorkoutMethodF();
                        } else if (BMI <= 39) {
                            System.out.print("Obese\n--------------------------------\n");
                            askWorkoutMethodF();
                        }//bmi result f
                    } else {
                        System.out.print("You're supposed to pick among the two, ");
                    }//gender
                }//for loop
            }//else

            } catch (NumberFormatException a) {
                System.out.println("Invalid input. Height must be numeric.\n--------------------------------lee");
                bmiIndicator();
            }
        }
    }//height, bmi, gender
    
    static void askWorkoutMethodM() {
        Scanner input = new Scanner(System.in);
        System.out.print("A. Bulking\nB. Cutting\n(Bicep Curls, Squats etc...)\n");
        System.out.print("--------------------------------\n");
        String WorkoutMethodM = input.nextLine();
        if (WorkoutMethodM.isEmpty()) {
            System.out.print("Kindly answer the question please.\n");
            askWorkoutMethodM();
        } else if (WorkoutMethodM.equalsIgnoreCase("A") || (WorkoutMethodM.equalsIgnoreCase("bulking"))) {
            System.out.print("--------------------------------\n");
           askUnderweightM();
        } else if (WorkoutMethodM.equalsIgnoreCase("B") ||(WorkoutMethodM.equalsIgnoreCase("cutting"))) {
            System.out.print("--------------------------------\n");
           askOverweightM();
        } else { 
            System.out.print("\n--------------------------------\nKindly answer the question please\n--------------------------------\n");
           askWorkoutMethodM();
            }
        }//WorkoutMethodM

        static void askUnderweightM() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter specific body part\nA. Arms\nB. Core\nC. Legs\nD. Back\n");
        System.out.print("--------------------------------\n");
        String ans = input.nextLine();
        System.out.print("--------------------------------\n");

        if (ans.isEmpty()) {
            for (int i = 1; i <= 100; i++) {
                System.out.print("\nDo you still want to continue? (Yes or No): ");
                String continueResponse = input.nextLine();

                if (continueResponse.equalsIgnoreCase("yes")) {
                    askUnderweightM();
                    break;
                } else if (continueResponse.equalsIgnoreCase("no")) {
                    break;
                }
            }
        } else if (ans.equalsIgnoreCase("a") || (ans.equalsIgnoreCase("arms"))) {
                System.out.println("Bicep Curls: 3-4 sets of 10-15 reps\nHammer Curls: 3 sets of 12-15 reps\nTricep Dips: 4 sets of 11-15 reps");
        } else if (ans.equalsIgnoreCase("b") || (ans.equalsIgnoreCase("core"))) {
                System.out.println("Plank: 3-4 sets of 13-15 reps\nRussian Twists: 3 of 11-15 reps\nLeg Raises: 3 of 10-15 reps");
        } else if (ans.equalsIgnoreCase("c") ||
        (ans.equalsIgnoreCase("legs"))) {
                System.out.println("Squats: 4 sets of 12-15 reps\nLunges: 3 sets of 10-15 reps\nCalf Raises: 3 sets of 11-15 reps");
        } else if (ans.equalsIgnoreCase("d") || (ans.equalsIgnoreCase("d"))) {
                System.out.println("Bent Over: 3 sets of 12-15 reps\nPull-Ups: 3-4 sets of 11-15 reps\nSuperman Exercise: 3 sets of 12-15 reps");
        } else {
                System.out.println("Error! pick among the four(4) choices\n--------------------------------");
                askUnderweightM();
        }
        System.out.print("\nCreate a personalized meal and workout plan based on daily activity and eating habits.\n--------------------------------\n");
        finalUwM();
    }//underweightM

        static void askOverweightM() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter specific body part\nA. Arms\nB. Core\nC. Legs\nD. Back\n");
        System.out.print("--------------------------------\n");
        String ans = input.nextLine();
        System.out.print("--------------------------------\n");

        if (ans.isEmpty()) {
            for (int i = 1; i <= 100; i++) {
                System.out.print("\nDo you still want to continue? (Yes or No): ");
                String continueResponse = input.nextLine();

                if (continueResponse.equalsIgnoreCase("yes")) {
                    askOverweightM();
                    break;
                } else if (continueResponse.equalsIgnoreCase("no")) {
                    break;
                }
            }
        } else if (ans.equalsIgnoreCase("a") || (ans.equalsIgnoreCase("arms"))) {
                System.out.println("Push ups: 4-5 sets of 10-14 reps\nBiceps Curls: 3-4 sets of 11-15 reps\nPlank: 4 sets of 10-12");
        } else if (ans.equalsIgnoreCase("b") || (ans.equalsIgnoreCase("core"))) {
                System.out.println("Diamond pushup: 3 sets of 9-13 reps\nKnee Crunches: 3 sets of 10-15 reps\nPikes: 3 sets of 9-11 reps");
        } else if (ans.equalsIgnoreCase("c") || (ans.equalsIgnoreCase("legs"))) {
                System.out.println("Side lunge: 3-4 sets of 10-12 reps\nSingle leg bridge: 3 sets of 11-14 reps \nSquat: 4 sets of 10-15 reps");
        } else if (ans.equalsIgnoreCase("d") || (ans.equalsIgnoreCase("back"))) {
                System.out.println("Swimmers: 4-5 sets of 9-12 reps\nFront raise: 4 sets of 12-15 reps\nBack fly:3-4 sets of 10-11 reps");
        } else {
                System.out.println("Error! pick among the four(4) choices\n--------------------------------");
                askOverweightM();
        }
        System.out.print("\nA cutting diet involves calculating your calorie, protein, fat, and carb needs to reduce body fat and maintain muscle mass.\n--------------------------------\n");
        finalOwM();
    }//overweightM

    static void askWorkoutMethodF() {
        Scanner input = new Scanner(System.in);
        System.out.print("A. Bulking\nB. Cutting\n(Bicep Curls, Squats etc...)\n");
        System.out.print("--------------------------------\n");
        String WorkoutMethodF = input.nextLine();
        if (WorkoutMethodF.isEmpty()) {
            System.out.print("Kindly answer the question please.\n");
            askWorkoutMethodF();
        } else if (WorkoutMethodF.equalsIgnoreCase("A") || (WorkoutMethodF.equalsIgnoreCase("bulking"))) {
            System.out.print("--------------------------------\n");
           askUnderweightF();
        } else if (WorkoutMethodF.equalsIgnoreCase("B") || (WorkoutMethodF.equalsIgnoreCase("cutting"))) {
            System.out.print("--------------------------------\n");
           askOverweightF();
        } else {
            System.out.print("\n--------------------------------\nKindly answer the question please\n--------------------------------\n");
           askWorkoutMethodF();
            }
        }//WorkoutMethodF

        static void askUnderweightF() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter specific body part\nA. Arms\nB. Core\nC. Legs\nD. Back\n");
        System.out.print("--------------------------------\n");
        String ans = input.nextLine();
        System.out.print("--------------------------------\n");

        if (ans.isEmpty()) {
            for (int i = 1; i <= 100; i++) {
                System.out.print("\nDo you still want to continue? (Yes or No): ");
                String continueResponse = input.nextLine();

                if (continueResponse.equalsIgnoreCase("yes")) {
                    askUnderweightF();
                    break;
                } else if (continueResponse.equalsIgnoreCase("no")) {
                    break;
                }
            }
        } else if (ans.equalsIgnoreCase("a") || (ans.equalsIgnoreCase("arms"))) {
                System.out.println("Bicep Curls: 3 sets of 10 reps\nHammer Curls: 3 sets of 10 reps\nTricep Dips: 3 sets of 11 reps");
        } else if (ans.equalsIgnoreCase("b") || (ans.equalsIgnoreCase("core"))) {
                System.out.println("Plank: 3 sets of 10 reps\nRussian Twists: 3 of 10 reps\nLeg Raises: 2 of 10 reps");
        } else if (ans.equalsIgnoreCase("c") || (ans.equalsIgnoreCase("legs"))) {
                System.out.println("Squats: 3 sets of 12 reps\nLunges: 2 sets of 10 reps\nCalf Raises: 2 sets of 8-10 reps");
        } else if (ans.equalsIgnoreCase("d") || (ans.equalsIgnoreCase("back"))) {
                System.out.println("Bent Over: 2 sets of 10 reps\nPull-Ups: 2 sets of 10 reps\nSuperman Exercise: 2 sets of 8-10 reps");
        } else {
                System.out.println("Error! pick among the four(4) choices\n--------------------------------");
                askUnderweightF();
        }
        System.out.print("\nCreate a personalized meal and workout plan based on daily activity and eating habits.\n--------------------------------\n");
        finalUwF();
    }//underweightf
    
        static void askOverweightF() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter specific body part\nA. Arms\nB. Core\nC. Legs\nD. Back\n");
        System.out.print("--------------------------------\n");
        String ans = input.nextLine();
        System.out.print("--------------------------------\n");

        if (ans.isEmpty()) {
            for (int i = 1; i <= 100; i++) {
                System.out.print("\nDo you still want to continue? (Yes or No): ");
                String continueResponse = input.nextLine();

                if (continueResponse.equalsIgnoreCase("yes")) {
                    askOverweightF();
                    break;
                } else if (continueResponse.equalsIgnoreCase("no")) {
                    break;
                }
            }
        } else if (ans.equalsIgnoreCase("a") || (ans.equalsIgnoreCase("arms"))) {
                System.out.println("Push ups: 3 sets of 10 reps\nBiceps Curls: 2 sets of 11 reps\nPlank: 3 sets of 10 reps");
        } else if (ans.equalsIgnoreCase("b") || (ans.equalsIgnoreCase("core"))) {
                System.out.println("Diamond pushup: 2 sets of 8-9 reps\nKnee Crunches: 3 sets of 10 reps\nPikes: 2 sets of 8-9 reps");
        } else if (ans.equalsIgnoreCase("c") || (ans.equalsIgnoreCase("legs"))) {
                System.out.println("Side lunge: 3 sets of 10 reps\nSingle leg bridge: 2 sets of 11 reps \nSquat: 4 sets of 10 reps");
        } else if (ans.equalsIgnoreCase("d") || (ans.equalsIgnoreCase("back"))) {
                System.out.println("Swimmers: 3 sets of 8-9 reps\nFront raise: 3 sets of 10-12 reps\nBack fly:3 sets of 10-11 reps");
        } else {
                System.out.println("Error! pick among the four(4) choices\n--------------------------------");
                askOverweightF();
        }
        System.out.print("\nA cutting diet involves calculating your calorie, protein, fat, and carb needs to reduce body fat and maintain muscle mass.\n--------------------------------\n");
        finalOwF();
    }//overweightF

    static void finalUwM() {     
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to continue? (Yes or No): ");
        String continueResponse = input.nextLine();
        if (continueResponse.isEmpty()) {
            finalUwM();
        } else if (continueResponse.equalsIgnoreCase("yes")) {
            System.out.print("--------------------------------\n");
            askUnderweightM(); 
        } else if (continueResponse.equalsIgnoreCase("no")) {
            System.out.println("\n--------------------------------\nThank you, " + name); 
            input.close();  
        } else { 
            System.out.println("Invalid response. Please enter Yes or No.");
            }
            System.out.print("\n--------------------------------\n");
        }//finalUWM
    static void finalUwF() {     
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to continue? (Yes or No): ");
        String continueResponse = input.nextLine();
        if (continueResponse.isEmpty()) {
            finalUwF();
        } else if (continueResponse.equalsIgnoreCase("yes")) {
            System.out.print("--------------------------------\n");
            askUnderweightF(); 
        } else if (continueResponse.equalsIgnoreCase("no")) {
            System.out.println("\n--------------------------------\nThank you, " + name); 
            input.close();  
        } else { 
            System.out.println("Invalid response. Please enter Yes or No.");
            }
            System.out.print("\n--------------------------------\n");

        }//finalUWF
    static void finalOwM() {     
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to continue? (Yes or No): ");
        String continueResponse = input.nextLine();
        if (continueResponse.isEmpty()) {
            finalOwM();
        } else if (continueResponse.equalsIgnoreCase("yes")) {
            System.out.print("--------------------------------\n");
            askOverweightM(); 
        } else if (continueResponse.equalsIgnoreCase("no")) {
            System.out.println("\n--------------------------------\nThank you, " + name); 
            input.close();  
        } else { 
            System.out.println("Invalid response. Please enter Yes or No.");
            }
            System.out.print("\n--------------------------------\n");
        }//finalOWM
    static void finalOwF() {     
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to continue? (Yes or No): ");
        String continueResponse = input.nextLine();
        if (continueResponse.isEmpty()) {
            finalOwF();
        } else if (continueResponse.equalsIgnoreCase("yes")) {
            System.out.print("--------------------------------\n");
            askOverweightF(); 
        } else if (continueResponse.equalsIgnoreCase("no")) {
            System.out.println("\n--------------------------------\nThank you, " + name); 
            input.close();  
        } else { 
            System.out.println("Invalid response. Please enter Yes or No.");
            }
            System.out.print("\n--------------------------------\n");
        }//finalOWF

    public static void main(String[] args) {
        System.out.print("[JavaFit]\n");
        askName();
    }
}