package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
          boolean trueOrFalse;
        if(numberToBeDetermined>0){
            trueOrFalse= true;
            System.out.println(trueOrFalse);
        }
        else {
            trueOrFalse=false;
            System.out.println(trueOrFalse);
        }
    }
}
