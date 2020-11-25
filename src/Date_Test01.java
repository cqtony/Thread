import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Date_Test01 {
    public static void main(String[] args) {

//        Date1.Date_01();
//        Date2.Date_02();
//        Date3.Date_03();
        Date4.Date_04();
    }
}

/**
 * 输出时间（带格式：使用SimpleDateFormat）
 */
class Date1 {
    public static void Date_01() {
        SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(i.format(new Date()));
    }
}

/**
 * String--->Date
 * 需要格式和字符串一致才行
 */
class Date2 {
    public static void Date_02() {
        String date = "2020-11-18 21:48:56";
        SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(i.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 获取从1970/1/1 00:00:00   000 到当前系统时间的总毫秒数
 */
class Date3 {
    public static void Date_03() {
        System.out.println(System.currentTimeMillis());

        //需求：获取当前程序执行所需要的时间

        //提前获取一次的毫秒数
        long begin = System.currentTimeMillis();
        //运行程序
        prin();
        //获取第二次的毫秒数
        System.out.println("耗费时长：" + (System.currentTimeMillis() - begin) + "毫秒数");
    }

    public static void prin() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class Date4 {
    public static void Date_04() {


        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS")
                .format(new Date(1/*参数为毫秒数*/)));
        //获取昨天的毫秒数
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS")
                .format(new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24)));
    }
}

