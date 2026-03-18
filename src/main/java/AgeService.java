public class AgeService {
    public boolean canIGetIn(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}