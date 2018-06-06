class HelloWorld {
    /*
    public - any other class can access it
    static - can run this method without instance of HelloWorld
    */

    /* invoke main from another class
    class HelloWorld2 {
        public static void main(String[] args) {
            HelloWorld.main(args);
        }
    }
    */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
