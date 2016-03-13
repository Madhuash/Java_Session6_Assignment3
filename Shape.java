
public interface Shape {
	double getArea();
	int draw();
}

abstract class Circle implements Shape 
{ 
private double radius; 

public Circle(double radius) 
{ 
this.radius = radius; 
}
public double getArea() 
{ 
return Math.PI * radius * radius; 
} 
}
class Rectangle implements Shape 
{ 
private double width, length; 

public Rectangle(double width, double length) 
{ 
this.width = width; 
this.length = length; 
} 

public double getArea() 
{ 
return length * width; 
} 

public int draw()
{
	return (int) length;
}
} 

class Square implements Shape 
{ 
private double length; 

public Square(double length) 
{ 
this.length = length; 
} 

public double getArea() 
{ 
return length * length; 
} 

public int draw()
{
	return (int) length;
}

}
} 