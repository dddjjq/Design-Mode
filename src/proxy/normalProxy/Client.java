package proxy.normalProxy;

public class Client {
    public static void main(String[] args) throws Exception{
        IGamePlayer iGamePlayer = new GamePlayerProxy("ZhangSan");
        iGamePlayer.login("ZhangSan","123456");
        iGamePlayer.killBoss();
        iGamePlayer.upgrade();
    }
}
