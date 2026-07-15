
public class Numbers {

    int num1 , num2 , num3;
    int min , max;


    
    public int getMin() {
        min = Math.min(Math.min(num1,num2), num3);
        return min;
    }
    public int getMax() {
        max = Math.max(Math.max(num1,num2) , num3);
        return max;
    }

    public void printFinalResult(){
        System.out.println(getMin() + " " + getMax());
    }

}