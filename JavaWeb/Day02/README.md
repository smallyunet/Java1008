### Servlet生命周期

servlet是单例的；

web.xml中的servlet配置项load-on-startup，声明servlet在启动时创建实例，值为servlet优先级；

创建 -> init -> service -> doGet/doPost -> destory
