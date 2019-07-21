package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

    private Object object;

    public GamePlayerIH(Object object){
        this.object= object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        if (method.getName().equals("login")){
            System.out.println("Someone login");
        }
        return result;
    }
}
