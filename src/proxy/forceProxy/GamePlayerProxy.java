package proxy.forceProxy;

public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer iGamePlayer;

    public GamePlayerProxy(IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;
    }

    @Override
    public void login(String name, String password) {
        iGamePlayer.login(name,password);
    }

    @Override
    public void killBoss() {
        iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        iGamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
