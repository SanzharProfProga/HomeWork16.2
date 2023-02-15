public class Python extends Backend{
    public String django(){
        return "Django is a framework for Python";
    }

    @Override
    public String toString() {
        return django();
    }
}
