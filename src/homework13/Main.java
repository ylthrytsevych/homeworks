package homework13;

public class Main {

    public static void main(String[] args) {

        Circle cir = new Circle(5);
        double cirArea = cir.calculateArea();
        System.out.println("Для кола радіусом "+cir.getRadius()+" площа = "+cirArea);

        Square sq = new Square(5);
        double sqArea = sq.calculateArea();
        System.out.println("Для квадрата з сторонами "+sq.getSide()+" площа = "+sqArea);

        Triangle tri = new Triangle(5, 10);
        double triArea = tri.calculateArea();
        System.out.println("Для трикутника з основою "+tri.getBase()+" та висотою " +tri.getHeight()+" площа = "+triArea);

        Shape[] array = new Shape[3];
        array[0] = cir;
        array[1] = sq;
        array[2] = tri;

        System.out.println("Сума площі всіх фігур: "+sumOfAreas(array));


    }

    public static double sumOfAreas (Shape[] shapesArray){
        double sum = 0;
        for (int i = 0; i < shapesArray.length; i++) {
            sum+=shapesArray[i].calculateArea();
        }
        return sum;
    }
}
