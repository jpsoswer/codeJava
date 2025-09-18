package dongtaiDaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ParUtil {

    public static Star cateProey(bigStar pro)
    {
        //创建代理对象
        Star star = (Star) Proxy.newProxyInstance(
                ParUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("sing".equals(method.getName()))
                        {
                            System.out.println("准备舞台，准备话筒");
                        }
                        else if ("dance".equals(method.getName())){
                            System.out.println("准备场地，准备音乐");
                        }

                        return method.invoke(pro,args);
                    }
                }
        );
        return star;
    }
}
