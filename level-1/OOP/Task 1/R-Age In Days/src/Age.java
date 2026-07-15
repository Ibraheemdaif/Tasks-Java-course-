
public class Age {
    int ageInDays;
    int months;
    int years;
    int remaningDays;

    public Age(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public int CalculateAgeInYears() {
        years = ageInDays / 365;
        return years;
    }
    
    public int CalculateAgeInMonth() {
        months = (ageInDays % 365) / 30;
        return months; 
    }
    
    public int CalculateRemaningDays() {
        remaningDays = ageInDays - (years * 365 + months * 30);
        return remaningDays;
    }

    public void printFinalResult() {
        System.out.println(CalculateAgeInYears() + " years");
        System.out.println(CalculateAgeInMonth() + " months");
        System.out.println(CalculateRemaningDays() + " days");
    }
}