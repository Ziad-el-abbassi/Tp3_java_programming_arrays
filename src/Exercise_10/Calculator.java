package Exercise_10;

public class Calculator {
    private Exercise_10.Floor floor;
    private Exercise_10.Carpet carpet;

    public Calculator(Exercise_10.Floor floor, Exercise_10.Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
