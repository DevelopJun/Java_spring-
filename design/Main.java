package design;

import design.adapter.*;
import design.aop.aopBrowser;
import design.proxy.Browser;
import design.proxy.BrowserProxy;
import design.proxy.IBrowser;
import design.singleton.Aclazz;
import design.singleton.Bclazz;
import design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new aopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
                );
        aopBrowser.show();
        System.out.println("loading time :" + end.get());

        // 두번째는 캐시를 사용했기 때문에, 0초가 걸리게 된다,
        aopBrowser.show();
        System.out.println("loading time :" + end.get());



//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();



//        Browser browser = new Browser("www.naver.com");
//        browser.show();

        /*
        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
      */
      /*
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110v adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110v airAdapter = new SocketAdapter(airConditioner);
        connect((airAdapter));
    */

    }

    // 콘센트
    public static void connect(Electronic110v electronic110v){
        electronic110v.powerOn();
    }

}
