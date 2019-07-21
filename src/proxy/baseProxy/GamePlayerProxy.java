package proxy.baseProxy;

public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer iGamePlayer = null;

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
}
