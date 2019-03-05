package learn.Creational.AbstractFactory;
//https://blog.csdn.net/LoveLion/article/details/9319571 练习题
public interface OSFactory {
    public InterfaceController createIC();
    public OperationController createOC();
}
