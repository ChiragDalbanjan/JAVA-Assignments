class Quadrilateral{
    float x1, x2, x3, x4, y1, y2, y3, y4;
    Quadrilateral(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4){
        this.x1 = x1;
        this.x2 = x1;
        this.x3 = x2;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

}
class Trapezoid extends Quadrilateral{
    private int height;
    Trapezoid(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4, int height){
        super(x1,x2,x3,x4,y1,y2,y3,y4);
        this.height = height;
    }

    float getArea(){
        int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2= (int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		return (d1+d2)*height/2;
    }
    

}

class Parallelogram extends Quadrilateral{
    private int height;
    Parallelogram(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4, int height){
        super(x1,x2,x3,x4,y1,y2,y3,y4);
        this.height = height;
    }

    float getArea(){
        int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return (int)d1*height;
    }

} 

class Rectangle extends Quadrilateral{
    Rectangle(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4){
        super(x1,x2,x3,x4,y1,y2,y3,y4);
    }

    int getArea(){
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("d1"+d1);
		int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        System.out.println("d2"+d2);
		return d1*d2;
       
    }

}

class Square extends Quadrilateral{
    Square(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4){
        super(x1,x2,x3,x4,y1,y2,y3,y4);
    }

    float getArea(){
        float hyp= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return hyp * hyp ;
    }


}




public class Problem3{

    public static void main(String... args) {
        Square sq = new Square(0,0,5,5,0,5,5,0);
        System.out.println("Area of square is "+sq.getArea());

        Rectangle rec=new Rectangle(14,12,15,4,56,5,6,4);
		System.out.println("Area of the rectangle is "+rec.getArea());
		
		Trapezoid trap=new Trapezoid(2,45,7,5,6,12,10,14,2);
		System.out.println("Area of the trapezoid is "+trap.getArea());
		
		Parallelogram parll=new Parallelogram(1,2,54,85,92,6,1,8,2);
		System.out.println("Area of the parallelogram is "+parll.getArea());
        
    }
    
}


