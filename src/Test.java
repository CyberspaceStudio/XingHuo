
import com.unit.Core;

public class Test {
    public static void main(String[] args){

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Core.timeJudge();
        System.out.println(Core.timeJudge());
    }
}
