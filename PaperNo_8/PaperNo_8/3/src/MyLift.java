
import java.util.List;
import java.util.stream.Stream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MTLS
 */
public class MyLift implements ILift{
 @Override
 public int f1(List<Lift> t) {
    return t.stream()
            .filter(lift -> isPrime(lift.getLabel().length()))
            .mapToInt(Lift::getLoad)
            .max()
            .orElse(0);
  }

    @Override
    public void f2(List<Lift> t) {
        if(t.size() >= 5){
            for(int i = 0;i < 5/2;i++){
                Lift temp = t.get(i);
                t.set(i, t.get(5-i-1));
                t.set(5-i-1, temp);
            }
        }
    }

    @Override
    public void f3(List<Lift> t) {
        t.removeIf(lift -> lift.getLoad()<20);
    }
    private boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n);i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
