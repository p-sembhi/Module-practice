module goodbyeyoutube {
    requires goodbye;
    exports com.practice.goodbyeyoutube;
    provides com.practice.goodbye.Goodbye with com.practice.goodbyeyoutube.GoodbyeYoutube;
}