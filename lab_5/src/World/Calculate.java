package World;

public abstract class Calculate {

public static double areaoff(double area, int population){
    if(area<0 || population<0){
        throw new IllegalArgumentException("area and population must be >0");
    }
return area*population;
}
}
