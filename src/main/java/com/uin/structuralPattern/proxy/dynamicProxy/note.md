## cglib动态代理

## SpringAOP五种通知模型

```text
连接点：值得是真实角色
```

- 前置通知：在连接点前面执行，前置通知不会影响链接点的执行，除非此处抛出异常。
- 后置通知：在连接点正常执行完成后执行，如果连接点抛出异常，则不会执行。
- 异常通知：在连接点抛出异常后执行。
- 最终通知：在连接点执行完成之后执行，不管是否正常执行，还是抛出异常，都会执行返回通知中的内容。
- 环绕通知：围绕在连接点前后。

```java
//AOP结构示意图
@Override
public Object intercept(Object o,Method method,Object[]objects,MethodProxy methodProxy)throws Throwable{
        try{
            // 前置通知
            //。。。。

            // 真实角色所完成的事情
            method.invoke(sub,objects);

            // 后置通知
            // 。。。。
        }catch(Exception e){
            // 异常通知
        }finally{
            // 最终通知
        }
}
```