package datatypes.classes;

class Rectangle implements Shape{
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}