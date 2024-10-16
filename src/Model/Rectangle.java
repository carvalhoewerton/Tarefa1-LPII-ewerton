package Model;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){}

    public Rectangle(float lenght, float width) {
        this.length = lenght;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float lenght) {
        this.length = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        return this.width * this.length;
    }

    public float getPerimeter(){
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + length +
                ", width=" + width +
                '}';
    }
}
