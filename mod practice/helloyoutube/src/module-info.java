module helloyoutube {
    requires hello;
    exports com.practice.youtube;
    provides com.practice.hello.Hello with com.practice.youtube.HelloYoutube;
}

