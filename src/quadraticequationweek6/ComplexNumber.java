package quadraticequationweek6;


public class ComplexNumber {

    private float real; 
    private float unreal; 

    public ComplexNumber(float real, float unreal){
        this.real = real;
        this.unreal = unreal;
    }
    public ComplexNumber Add(ComplexNumber c){
        return new ComplexNumber(real + c.getReal(), unreal + c.getUnreal());
    }
    public ComplexNumber DivideByReal(float divisor){
        return new ComplexNumber(real / divisor, unreal / divisor);
    }
    public static String ToString(ComplexNumber compNum){
        return compNum.getReal() + ((compNum.getUnreal() >= 0) ? " + " : " ") + compNum.getUnreal() + "i";
    }

    public float getReal(){
        return real;
    }

    public float getUnreal(){
        return unreal;
    }

}
