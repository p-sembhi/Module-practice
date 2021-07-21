module helloworld {
    requires hello;
    exports com.practice.world;
    provides com.practice.hello.Hello with com.practice.world.HelloWorld;
}