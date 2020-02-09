public class runner {
    public static void main(String[] args){
        double[] xVals = new double[50000];
        hyperboLib h1 = new hyperboLib();
        h1.pHyperbola(-1,1);
        System.out.println(h1.getX_1() + ", " + h1.getY_1());
        System.out.println(Math.log(Math.E));
    }
}
