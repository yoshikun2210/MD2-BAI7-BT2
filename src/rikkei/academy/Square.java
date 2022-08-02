package rikkei.academy;


public class Square extends  Rectangle implements IColorable{
    public Square(){

    }

    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth();

    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);

    }
    @Override
    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString(){
        return "A square with side="
                + getSide()
                + ",which is a subclass of "
                + super.toString()
                + ", Area= "
                +getArea();

    }


    @Override
    public void howToColor() {
        System.out.println("Square: full side  ");
    }
}