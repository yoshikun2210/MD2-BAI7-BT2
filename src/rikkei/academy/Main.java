package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        for (int i = 0; i < 10; i++) {
            shapes[i] = getRanDomShape();

        }
//        shapes.printShape(shapes);
        for (Shape x:
                shapes) {
            if (x instanceof IColorable){
                ((IColorable) x).howToColor();

            }

            System.out.println(x.getClass().getSimpleName()+":"+x.getArea());
        }





    }
    static Shape getRanDomShape(){
        int random = (int) ((Math.random()*3));
//        System.out.println(random);
        switch (random){
            case 0:
                return new Square(10);
            case 1:
                return new Rectangle(10,20);
            default:
                return new Circle(10);

        }

    }

}