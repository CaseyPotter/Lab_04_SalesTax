public class Main
{
    public static void main(String[] args)
    {
        double doubleValue;
        double doubleTax;
        double doubleResult;

        doubleValue = 45.78;
        doubleTax = 0.12;

        doubleResult = (doubleValue * doubleTax) + doubleValue;

        System.out.println("Your final cost with tax is " + doubleResult);



    }
}