package part2;

public class Shape {
    private String color;
    public Shape (String color){
        this.color = color;
    }
    @Override
    public  String toString(){
        return "Shape[color=" + color + "]";
    }
}
