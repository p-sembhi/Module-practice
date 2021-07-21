module goodbyeworld {
    requires goodbye;
    exports com.practice.goodbyeworld;
    provides com.practice.goodbye.Goodbye with com.practice.goodbyeworld.GoodbyeWorld
}