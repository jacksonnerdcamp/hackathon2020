import java.util.ArrayList;

public class hyperboLib {
    //private fields
    private double x_1;
    private double y_1;
    private double f;
    private double g;
    private int a = 0;

    //getters and setters
    public void setX_1(double x_1){ this.x_1 = x_1;}
    public double getX_1(){return this.x_1;}

    public void setY_1(double y_1){this.y_1 = y_1;}
    public double getY_1(){return this.y_1;}

    public void setF(double f){this.f = f;}
    public double getF(){return this.f;}

    public void setG(double g){this.g = g;}
    public double getG(){return this.f;}


    public double hyperbola(double y){
        return a * Math.sqrt(1 + Math.pow(y / a,2));
    }

    public double[] inverseHyperbola(double a, double x){
        double[] array = new double[2];
        array[0] = x;
        array[1] = a/x;
        return(array);
    }

    //Lorentz transformation
    public double gamma(double slope){
        return 1/Math.sqrt(1-(slope * slope));
    }

    public double tPrime(double x, double t){
        return this.gamma(x/t) * (t - (x*x)/t);
    }

    public double xPrime(double x, double t){
        return this.gamma(x-x*t)
    }


    // hyperbolic functions
    public double acosh(double newT){
        return acosh(newT)* Math.sqrt(newT - 1)/Math.sqrt(newT + 1);
    }

    public double asinh(double newX){
        return Math.log(newX + Math.sqrt(1 + Math.pow(newX,2)));
    }

    public void pHyperbola(double s, double a){
        this.setX_1(a * Math.cosh(s));
        this.setY_1(a * Math.sinh(s));
    }

    public void motor1Projection(double s){
        this.setF(a * Math.cosh(s) + a * Math.sinh(s));
    }

    public void motor2Projection(double s){
        this.setG(a * Math.cosh(s) + a * Math.sinh(s));
    }



}
