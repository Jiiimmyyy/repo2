import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List dogs = new ArrayList();
        dogs.add(new Dog("小狗一号"));
        dogs.add(new Dog("小狗二号"));
        dogs.add(new Dog("小狗三号"));
        dogs.add(2,new Dog("小狗四号"));// 添加到指定位置
// .size() ： ArrayList大小

        System.out.println("共计有" + dogs.size() + "条狗狗。");
        System.out.println("分别是：");

// .get(i) ： 逐个获取个元素
        for (int i = 0; i < dogs.size(); i++) {
            Dog dog = (Dog) dogs.get(i);
            System.out.println(dog.getName());
    }
}

}

class Dog{
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}