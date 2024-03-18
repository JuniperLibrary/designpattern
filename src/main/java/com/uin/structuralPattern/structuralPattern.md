# 为什么要用结构型模式？

1. 结构性模式关注点"怎样组合对象/类？"所以我们关注下累的组合关系
    1. 类结构模式关心类的组合，由多个类可以组合成一个更大的（继承）
    2. 对象结构型模关心类与对象的组合，通过关联关系在一个类中定义另一类的实例对象（组合）
2. 根据合成复用原则，在系统中尽量使用关联关系来替代继承关系，因此大部分结构性模式大都是对象结构型模式

# 适配器模式的应用场景

1. Tomcat如何将Request流转换成为标准的Request
   tomcat.Request接口
   servlet.Request接口
   tomcat === CoyoteAdapter ===ServletRequest
2. Spring Aop中的AdvisorAdapter是什么 ：增加的适配器
   前置、后置、返回、结束 Advisor（通知方法
   底层真的目标方法
3. springMvc中经典的HandlerAdapter是什么
   helloController.hello()
   HandlerAdapter
   Servlet.doGet()
4. SpringBoot中WebConfigurerAdapter为什么存在又取消
