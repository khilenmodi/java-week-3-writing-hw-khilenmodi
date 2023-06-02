package homework_week_7;

/**
 * Wall Area
 * write a class with the name wall the class two fields (instance variable) wiht name <P> width and height of type double
 * the class need to have two constructor. the first constructor does not have any parameters (no-arg constructor)
 * the second constructor has parameters width and height of types double and it need to initialize the fields.
 * in case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0
 * it needs to set the height field value to 0
 * write the following method (instance methods).
 * Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method name setWidth with one parameter of type double, it needs to set the value of the width field.
 * if the parameter is less than 0 it needs to set the width field value to 0.
 * Method name setHeight with one parameter of type double, it needs to set the value of the height field.
 * if the parameter is less than 0 it needs to set the height field value to 0.
 * Method name getArea without any parameter, it needs to return the area of the wall.
 * Test Example
 * Test code : ( write bellow code into main method and run and compare result with Output)
 * Wall wall = new Wall (5, 4);
 * System.out.println(&quot; area= &quot; + wall.getArea());
 * Wall.setHeight(-1, 5);
 * System.out.println(&quot;width= &quot; + wall.getWidth());
 * System.out.println(&quot;height= &quot; + wall.getHeight());
 * System.out.println(&quot;area= &quot; + wall.getArea());
 * OUTPUT
 * area = 20.0
 * width = 5.0
 * height = 0.0
 * area = 0.0
 * Note : All the methods should be defined as public Not public static.
 * <P></P>
 * Note: In total, you have to write 5 methods and 2 constructors.
 */
public class Programme_15_Wall {

    // instance variables,
    double width;
    double height;

    // default constructor
    public Programme_15_Wall()
    {
    }
    // parameter constructor
    public Programme_15_Wall(double width, double height)
    {
        if (width< 0){
            this.width = 0;
        }else {
            this.width = width;
        }
        if (height < 0 ){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

        // get width method
        public double getWidth(){
            return width;
        }
        // get height method
        public double getHeight(){
            return height;
        }
        // set width Method
        public void setWidth(double width){
        if (width < 0 ){
            this.width = 0;
        }else {
            this.width = width;
        }
        }
        // set height method
        public void setHeight(double height){
        if (height < 0 ){
            this.height = 0;
        }else{
            this.height = height;
        }
        }
        // get  area method
        public double getArea(){
            return (getHeight()* getWidth());
        }

    public static void main(String[] args) {
        Programme_15_Wall wall = new Programme_15_Wall(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " +wall.getWidth());
        System.out.println("height =" +wall.getHeight());
        System.out.println("area =" +wall.getArea());


    }
}
