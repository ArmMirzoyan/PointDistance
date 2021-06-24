public class Point {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double Distance (){
        float xD = this.x;
        float yD = this.y;
        return Math.sqrt(xD * xD + yD * yD);
    }

    public double Distance (Point secondPoint){
        float xD = secondPoint.x - this.x;
        float yD = secondPoint.y - this.y;
        return Math.sqrt(xD * xD + yD * yD);
    }
}
