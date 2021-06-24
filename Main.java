public class Main {
    public static void main(String[] args){
        Point point1 = new Point(3,4);
        Point point2 = new Point(4,5);
        System.out.println(point1.Distance());
        System.out.println(point1.Distance(point2));
    }
}
