package example.kingja.rxbus;

import java.util.Random;

/**
 * Description:TODO
 * Create Time:2017/5/26 9:49
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class EventMain {
    private String from;
    private int id;

    public EventMain(Object from) {
        this.from = from.getClass().getSimpleName();
        this.id = new Random().nextInt(100);
    }


    public String getMsg() {
        return getClass().getSimpleName()+" from "+from +",EventId "+ id ;
    }
}
