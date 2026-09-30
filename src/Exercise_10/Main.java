package Exercise_10;

public class Main {
    public static void main(String[] args){
        Exercise_10.Carpet carpet = new Exercise_10.Carpet(3.5);
        Exercise_10.Floor floor = new Exercise_10.Floor(2.75, 4.0);
        Exercise_10.Calculator calculator = new Exercise_10.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Exercise_10.Carpet(1.5);
        floor = new Exercise_10.Floor(5.4, 4.5);
        calculator = new Exercise_10.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
