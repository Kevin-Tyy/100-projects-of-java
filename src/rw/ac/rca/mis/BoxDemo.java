package rw.ac.rca.mis;

class Box {
    private int width;
    private int height;
    private int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int volume(){
        return this.height*this.width*this.length;
    }
}

public  class  BoxDemo {
    public static void main(String[] args) {
        Box bl = new Box(10, 10, 10);
        System.out.println("The volume is " + bl.volume());
    }
}