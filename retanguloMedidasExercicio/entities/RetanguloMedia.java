package retanguloMedidasExercicio.entities;

public class RetanguloMedia {
    public double width;
    public double height;

    public double area(){
        return width*height;
    }
    public  double perimeter(){
        return (width+=width) + (height+=height);
    }
    public double diagonal(){
        return (width *width)+(height*height);
    }

    @Override
    public String toString() {
        return "RetanguloMedia" +
                " width" + width +
                ", height " + height +
                ", Area "+area()+
                ", perimeter "+perimeter()+
                ", diagonal "+diagonal();
    }
}
