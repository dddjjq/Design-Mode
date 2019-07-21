package proxy.normalProxy;

public class GamePlayer implements IGamePlayer{

    private String mName = null;

    public GamePlayer(IGamePlayer iGamePlayer,String name) throws Exception{
        if (iGamePlayer == null){
            throw new Exception("Cannot create a true role");
        }else {
            mName = name;
        }
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
