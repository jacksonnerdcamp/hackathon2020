public class runner {
    public static void main(String[] args){
        double[] xVals = new double[50000];
        hyperboLib h1 = new hyperboLib();
        h1.finalMotorLocation(3,2);
        System.out.println(h1.getF());
    }
}
