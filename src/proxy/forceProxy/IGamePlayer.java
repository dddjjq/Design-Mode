package proxy.forceProxy;

public interface IGamePlayer {
    void login(String name, String password);
    void killBoss();
    void upgrade();
    IGamePlayer getProxy();//获取代理
}