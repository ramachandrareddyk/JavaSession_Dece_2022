package abstraction;

public class ShapeTest {

	public static void main(String[] args) {
	Shape sh= new Rectangle();
	
	sh.draw();//
	
	Shape sh1= new Circle();
	
	sh1.draw();//
	
	Shape sh2= new Square();
	
	sh2.draw();//
	
	sh.changeGear();
	
	Shape.test();

	}

}
