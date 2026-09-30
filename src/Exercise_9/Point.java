package Exercise_9;
import java.lang.Math;

public class Point {
    private int x;
    private int y;
    public Point(){};
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    };
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x1){
        this.x=x1;
    }
    public void setY(int y1){
        this.y=y1;
    }
    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
    public double distance(Point z){
        return Math.sqrt(Math.pow(x-z.getX(),2)+Math.pow(y-z.getY(),2));
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
}
