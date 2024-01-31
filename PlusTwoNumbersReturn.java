public class PlusTwoNumbersReturn {

    public static void main(String[] args){
        int numbersPlus = TwoNumbersPlus(5, 4, 8);
        System.out.println(numbersPlus);

    }
    public static int TwoNumbersPlus(int number1, int number2, int number3){
        return (number1 + number2) * number3;
    }
}
