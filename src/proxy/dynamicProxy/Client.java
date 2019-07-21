package proxy.dynamicProxy;


import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args){
        IGamePlayer iGamePlayer = new GamePlayer("张三");
        GamePlayerIH gamePlayerIH = new GamePlayerIH(iGamePlayer);
        ClassLoader classLoader = iGamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},gamePlayerIH);
        proxy.login("ZhangSan","123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}
