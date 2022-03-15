public class SinhVien {
    public int age;
    public String name;
    public boolean daCoVo;
    public int[] arr;

    public SinhVien(int age, String name){
        this.age = age;
        this.name = name;
        arr = new int[100000];
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }
}
