public class Main {

    public static void main(String[] args) {
        FacebookPoster fb = /* TODO: add new instance */

        fb.postMessage("Hello World!");
        fb.postMessage("Hello world! Still here!");
        System.out.println(fb.getMessage(1));

        fb.postMessage("Another day, another post!");
        System.out.println(fb.getMessage(2));
    }
}
