public class Main {

    public static void main(String[] args){
        int numbersPlus = ThreeNumbersPlus(5, 5, 8);
        System.out.println(numbersPlus);

    }
    public static int ThreeNumbersPlus(int number1, int number2, int number3){
        return (number1 + number2) * number3;
    }
}
