class Singleton {
    private Singleton(){}

    public static Singleton getInstace() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}