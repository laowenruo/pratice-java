import java.util.ArrayList;
import java.util.Random;

public class WeixinPacket {
    public static void main(String[] args) {
        double sum=0;
        ArrayList<Double> res=WXRedPackage(10,3);
        for (Double re : res) {
            sum=sum+re;
            System.out.println(re);
        }
        System.out.println("------");
        System.out.println(sum);
    }
    private static ArrayList<Double> WXRedPackage(double restMoney,int restNum){
        ArrayList<Double> res=new ArrayList<>(restNum);
        Random random=new Random();
        while (restNum>1){
            double max=(restMoney/restNum)*2;
            double v = random.nextDouble();
            double money=max*v;
            if (v<0.01){
                money=0.01;
            }else {
                money=Math.floor(money*100)/100;
            }
            res.add(money);
            restMoney=restMoney-money;
            restNum--;
        }
        res.add(Math.floor(restMoney*100)/100);
        return res;
    }
}
