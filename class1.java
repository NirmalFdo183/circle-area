class circle{
    double ra,area;
    String name,color;
    circle(double ra,String name,String color){
        this.ra=ra;
        this.name=name;
        this.color=color;
    }

    void Printdetails(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Radius: "+ra);
    }

    void calArea(){
        area=(22/7)*ra*ra;
        System.out.println("Area: "+area);
        System.out.println("---------------------------");
    }
    
    
}
public class class1{
    public static void main(String args[]){
        circle c1=new circle(3d,"Blue circle","Blue");
        c1.Printdetails();
        c1.calArea();

        circle c2=new circle(1.2d,"Yellow circle","Yellow");
        c2.Printdetails();
        c2.calArea();

    }
}