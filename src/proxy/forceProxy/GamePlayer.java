package proxy.forceProxy;

public class GamePlayer implements IGamePlayer {

    private String mName;
    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.mName = name;
    }

    @Override
    public void login(String name, String password) {
        if (isProxy()){
            System.out.println("name : " + name + "," + "password : " + password);
        }else {
            System.out.println("please use Proxy");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()){
            System.out.println(mName + " is killing Boss");
        }else {
            System.out.println("please use Proxy");
        }
    }

    @Override
    public void upgrade() {
        if (isProxy()){
            System.out.println(mName + " is upgraded");
        }else {
            System.out.println("please use Proxy");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        proxy = new GamePlayerProxy(this);
        return proxy;
    }

    private boolean isProxy() {
        if (proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
