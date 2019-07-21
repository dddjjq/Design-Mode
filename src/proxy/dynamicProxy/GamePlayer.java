package proxy.dynamicProxy;


public class GamePlayer implements IGamePlayer{

    private String mName;

    public GamePlayer(String name){
        mName = name;
    }

    @Override
    public void login(String name, String password) {
        System.out.println("name : " + name + "," + "password : " + password);
    }

    @Override
    public void killBoss() {
        System.out.println(mName + " is killing Boss");
    }

    @Override
    public void upgrade() {
        System.out.println(mName + " is upgrade");
    }
}
