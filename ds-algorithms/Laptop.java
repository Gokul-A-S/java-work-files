public class Laptop  {
    String name;
    int price;
    int ram;
    public Laptop(String name,int price , int ram){
        this.name=name;
        this.price=price;
        this.ram=ram;
    }
//    @Override
//    public int compareTo(Laptop b){
//        if(this.price>b.price){
//            return 1;
//        }
//        else if(this.price<b.price){
//            return -1;
//        }
//        return 0;
//    }

}
