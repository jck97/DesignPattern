/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  13:20
 *@Description:
 */
package learn.FactoryMethod;

import java.lang.reflect.Constructor;

public class FactoryMethod {
    public interface IOperate {
        public double getResult(double x,double y);
    }
    public class Add implements IOperate {

        @Override
        public double getResult(double x,double y) {
            System.out.println("加法操作");
            return x+y;
        }
    }
    public class Sub implements IOperate {
        @Override
        public double getResult(double x, double y) {
            System.out.println("减法操作");
            return x-y;
        }
    }
    public class Mul implements IOperate {
        @Override
        public double getResult(double x, double y) {
            System.out.println("乘法操作");
            return x*y;
        }
    }


    /*
    * 简单工厂--创建对象的过程在工厂中
    public enum operateType {ADD,SUB,MUL};
    public IOperate getOperate(operateType type) throws Exception {
        switch (type){
            case ADD:return new Add();
            case SUB:return new Sub();
            case MUL:return new Mul();
            default:
                throw new Exception("no such IOperate!");
        }
    }
    * */


    //工厂方法 提供建立对象的方法，但是具体创建的对象由子类决定。
    public interface IFactory{
        public IOperate createOperate();
    }
    public class AddFactory implements IFactory{

        @Override
        public IOperate createOperate() {
            return new Add();
        }
    }
    public class SubFactory implements IFactory{

        @Override
        public IOperate createOperate() {
            return new Sub();
        }
    }
    public class MulFactory implements IFactory{
        @Override
        public IOperate createOperate() {
            return new Mul();
        }
    }

    public static void main(String[] args)throws Exception{
        //通常使用反射来创建对象。更一般的，创建的对象的全名称应该写在配置文件当中。
        Constructor constructor = Class.forName("learn.FactoryMethod$SubFactory").getDeclaredConstructors()[0];
        constructor.setAccessible(true);//设置构造函数为可见
        IFactory iFactory = (IFactory) constructor.newInstance(new FactoryMethod());//反射构造该对象
        IOperate iOperate = iFactory.createOperate();
        System.out.println("操作的结果:"+iOperate.getResult(1,1));
    }
}
