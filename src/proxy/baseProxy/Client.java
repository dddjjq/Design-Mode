package proxy.baseProxy;

public class Client {
    public static void main(String[] args){
        IGamePlayer iGamePlayer = new GamePlayer("张三");
        IGamePlayer iGamePlayerProxy = new GamePlayerProxy(iGamePlayer);
        iGamePlayerProxy.login("ZhangSan","123456");
        iGamePlayerProxy.killBoss();
        iGamePlayerProxy.upgrade();
    }
}
