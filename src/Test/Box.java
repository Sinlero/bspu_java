package Test;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(Box object) {
        width = object.width;
        height = object.height;
        depth = object.depth;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len) {
        this.width = this.height = this.depth = len;
    }

    double volume() {
        return this.width * this.depth * this.height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}

class BoxWeight extends Box {
    double weight;

    public BoxWeight(BoxWeight object) {
        super(object);
        weight = object.weight;
    }

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width,height,depth);
        this.weight = weight;
    }

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    public void showInfo() {
        System.out.printf("%f %f %f %f",getWidth(),getHeight(),getDepth(),this.weight);
    }
}