package Interface;

public interface FlyAble {
    void fly();
    public abstract void haCach();
}
class Chim implements  FlyAble

{

    @Override
    public void fly() {

    }

    @Override
    public void haCach() {

    }
}
class MayBay implements FlyAble {

    @Override
    public void fly() {

    }

    @Override
    public void haCach() {

    }
}
    /*
    Interface: thì không phải là lớp cha, có nhiệm vụ khai báo tập các tính năng
    Interface: Thì chỉ chứa các hằng số và các phương thức trừu tượng(k có phần thân)
    Mặc định các phương thức ở trong interface thì là public abstract
    Mặc định

    Sử dụng từ khóa implements để triển khai interface
    Khi lớp cha
     */
