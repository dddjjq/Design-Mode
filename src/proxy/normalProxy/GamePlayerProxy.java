package proxy.normalProxy;

public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer iGamePlayer = null;

    public GamePlayerProxy(String name) throws Exception{
        iGamePlayer = new GamePlayer(this,name);
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
