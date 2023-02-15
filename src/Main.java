public class Main {
    public static void main(String[] args)
    {
        Backend [] backends = {new Java(),
                                new CSharp(),
                                new Python()};
        for (Backend backend:backends) {
            System.out.println(backend.toString());
        }
    }
}