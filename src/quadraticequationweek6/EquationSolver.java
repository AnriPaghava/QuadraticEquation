package quadraticequationweek6;

public class EquationSolver {

    private float a, b, c; 
    private float determinant; 

    public EquationSolver(float[] numbers){
        a = numbers[0];
        b = numbers[1];
        c = numbers[2];

        determinant = (b * b) - (4 * a * c); 
    }

    public String Solve(){
        if(determinant >= 0){
            return RealAnswer(); 
        }else{
            return ComplexAnswer(); 
        }
    }

    private String RealAnswer(){
        float topLinePlus = (-b) + (float)Math.sqrt(determinant);
        float topLineMinus = (-b) - (float)Math.sqrt(determinant);
        float divisor = 2 * a;

        return "X = " + Float.toString(topLinePlus / divisor) + " ან " + Float.toString(topLineMinus / divisor);
    }

    private String ComplexAnswer(){
        ComplexNumber topLinePlus  = new ComplexNumber(-b,  +(float)Math.sqrt(-determinant));
        ComplexNumber topLineMinus = new ComplexNumber(-b,  -(float)Math.sqrt(-determinant));
        float divisor = 2 * a;

        return "X = " + ComplexNumber.ToString(topLinePlus.DivideByReal(divisor)) + " ან " + ComplexNumber.ToString(topLineMinus.DivideByReal(divisor));
    }
}
