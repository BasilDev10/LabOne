import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        QuestionOne();
        QuestionTwo();
        QuestionThree();
        QuestionFour();
        QuestionFive();
        QuestionSix();
        QuestionSeven();
        QuestionEight();
        QuestionNine();
        QuestionTen();
        QuestionEleven();
        QuestionTwelve();
        QuestionThirteen();
        QuestionFourteen();
        QuestionFiveteen();
        QuestionSixteen();
        QuestionSeventeen();
        QuestionEighteen();


    }

    public static void QuestionOne(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number please");
        int number1 = input.nextInt();
        System.out.println("Enter second number please");
        int number2 = input.nextInt();

        System.out.println("---- Result ----");
        System.out.println(number1+"+"+number2+"="+(number1 + number2) +"\n"+
                number1+"-"+number2+"="+(number1-number2)+"\n"+
                number1+"*"+number2+"="+(number1*number2)+"\n"+
                number1+"/"+number2+"="+(number1/number2)+"\n"+
                number1+"%"+number2+"="+(number1%number2));



    }
    public static void QuestionTwo(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number please to make multiplication");

        int number = input.nextInt();

        for (int i = 0 ; i < 10 ; i++){
            System.out.println(number+"*"+(i+1)+"="+(number*(i+1)));
        }
    }
    public static void QuestionThree(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius value please  :");
        double radius = input.nextDouble();
        double approximately = 3.14159265358979323846;
        double perimeter = 2*approximately*radius;
        double area = approximately*(radius*radius);

        System.out.println("Perimeter is ="+perimeter +"\nArea is ="+area);

    }
    public static void QuestionFour(){

        Scanner input = new Scanner(System.in);
        double number =0;
        double sumNumber = 0;
        double countNumber = 0;
        double resultNumber = 0;

        do {
            System.out.println("Enter number please and type 0 to exit :");
            number = input.nextDouble();
            if(number <= 0){
                continue;
            }
            sumNumber += number;
            countNumber += 1;
        }while (number != 0);

        resultNumber = sumNumber / countNumber;
        System.out.println("Average number is "+resultNumber);

    }
    public static void QuestionFive(){

        Scanner input = new Scanner(System.in);
        int sumFirstAndSecond = 0;

        System.out.println("Enter first number please :");
        int number1 = input.nextInt();
        System.out.println("Enter second number please :");
        int number2 = input.nextInt();
        System.out.println("Enter third number please :");
        int number3 = input.nextInt();

        sumFirstAndSecond = number1 + number2;

        System.out.println("Input the first number:"+number1+"\n"+
                "Input the second number:"+number2+"\n"+
                "Input the third number:"+number3+"\n"+
                "The result is:"+ (sumFirstAndSecond == number3));


    }
    public static void QuestionSix(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text:");
        String text = input.nextLine();
        String reversedText = "";

        for (int i = 0 ; i < text.length() ; i++){
            reversedText += text.charAt((text.length()-1) - (i));
        }

        System.out.println("Input a word : "+text+"\nReverse word: "+reversedText);
    }
    public static void QuestionSeven(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to check is even or odd:");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even");
        }else System.out.println("The number is odd");
    }
    public static void QuestionEight(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Centigrade to convert it to Fahrenheit");
        double centigrade = input.nextDouble();
        double fahrenheit =0;

        fahrenheit = (centigrade*1.8)+32;
        System.out.println("Entered temperature in Centigrade : "+centigrade +"\n"+
        "Temperature in Fahrenheit is : "+fahrenheit);
    }
    public static void QuestionNine(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string :");
        String string = input.nextLine();
        System.out.println("Please enter number :");
        int number = input.nextInt();
        while (number < 0 || number > string.length()-1){
            System.out.println("Your number is out of range, please enter number again :");
            number = input.nextInt();
        }
        System.out.println("Output is : "+string.charAt(number));
    }
    public static void QuestionTen(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter width: ");
        double width = input.nextDouble();
        System.out.println("Please enter height : ");
        double height = input.nextDouble();

        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.println("Area is : "+width+"*"+height+"= "+area);
        System.out.println("Perimeter is :"+"2"+"*("+width+"+"+height+") = "+perimeter);
    }

    public static void QuestionEleven(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give you all comparisons true");
        System.out.println("Please enter first number please:");
        int number1 = input.nextInt();
        System.out.println("Please enter second number please:");
        int number2 = input.nextInt();

        if(number1 > number2){
            System.out.println(number1+" > "+number2);
        }
        if(number1 < number2){
            System.out.println(number1+" < "+number2);
        }
        if(number1 >= number2){
            System.out.println(number1+" >= "+number2);
        }
        if(number1 <= number2){
            System.out.println(number1+" <= "+number2);
        }
        if(number1 != number2){
            System.out.println(number1+" != "+number2);
        }
        if(number1 == number2){
            System.out.println(number1+" == "+number2);
        }


    }
    public static void QuestionTwelve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter seconds please :");
        int enterdSeconds = input.nextInt();
        int hours = enterdSeconds/3600;
        int minutes = (enterdSeconds-hours*3600)/60;
        int seconds = enterdSeconds-hours*3600-minutes*60;
        System.out.println(hours+":"+minutes+":"+seconds);

    }
    public static void QuestionThirteen(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number please :");
        int number1 = input.nextInt();
        System.out.println("Please enter second number please :");
        int number2 = input.nextInt();
        System.out.println("Please enter third number please :");
        int number3 = input.nextInt();
        System.out.println("Please enter fourth number please :");
        int number4 = input.nextInt();

        System.out.println( "Input first number:"+number1+"\n"+
                "Input second number:"+number2+"\n"+
                "Input third number:"+number3+"\n"+
                "Input fourth number:"+number4+"\n"+
                "Numbers are "+ (number1 == number2 && number2 == number3 && number3 == number4?"equal":"not equal"));
    }

    public static void QuestionFourteen(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number :");
        int number = input.nextInt();

        System.out.println("Number is"+(number >=0 ? " Positive":" Negative"));
    }

    public static void QuestionFiveteen(){
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int number = 0;

        do{
            System.out.println("Please enter number or type -1 to exit:");
            number = input.nextInt();
            if(number == -1){
                break;
            }else if(number == 0){
                zero++;
            }else if(number >= 1){
                positive++;
            }else if(number <= -1){
                negative++;
            }
        }while(number != -1);

        System.out.println("Positive ="+positive +"\nNegative ="+negative+"\nZero ="+zero);
    }
    public static void QuestionSixteen(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number:");
        int number = input.nextInt();
        String convertNumberToText = String.valueOf(number);
        String reversedNumber = "";

        for (int i = 0 ; i < convertNumberToText.length() ; i++){
            reversedNumber += convertNumberToText.charAt((convertNumberToText.length()-1) - (i));
        }

        System.out.println("Input a number : "+convertNumberToText+"\nReverse number: "+reversedNumber);
    }

    public static void QuestionSeventeen(){
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;
        int number = 0;
        String userEnteredNumber = "";

        do{
            System.out.println("Please enter number or type out to exit:");
            userEnteredNumber = input.nextLine();
            if(userEnteredNumber.equals("out")){
                break;
            }
            number =Integer.parseInt(userEnteredNumber) ;
            if(number  > largest){

                largest = number;
            }

            if(number < smallest){
                smallest = number;
            }



        }while(true);

        System.out.println("The largest number is "+largest+"\nThe smallest number is "+smallest);

    }
    public static void QuestionEighteen(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Text:");
        String text = input.nextLine();
        int latterA_count = 0;

        for(int i = 0 ; i < text.length() ; i++){
            if(text.toLowerCase().charAt(i) == 'a'){
                latterA_count++;
            }
        }
        System.out.println("The number of a's count is "+latterA_count);
    }
}