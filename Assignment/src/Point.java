public class Point {
    private int x;
    private int y;

    public double distance(){
        return distance(0,0);
    }

    public double distance(int x,int y){
        return Math.sqrt(Math.pow((x-this.x),2) + Math.pow((y-this.y),2));
    }

    public double distance(Point B){
        return distance(B.x, B.y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
