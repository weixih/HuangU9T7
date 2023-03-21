public class Point {
    private String label;
    private int x;
    private int y;

    public Point(String label,int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Point)){
            return false;
        }
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
}
