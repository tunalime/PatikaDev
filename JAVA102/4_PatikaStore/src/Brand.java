import java.util.*;

public class Brand {

    private int ID;
    private String name;

    private HashSet<Brand> brands = new HashSet<>();

    private void addBrands(){
        this.brands.add(new Brand(1,"Samsung"));
        this.brands.add(new Brand(2,"Lenovo"));
        this.brands.add(new Brand(3,"Apple"));
        this.brands.add(new Brand(4,"Huawei"));
        this.brands.add(new Brand(5,"Casper"));
        this.brands.add(new Brand(6,"Asus"));
        this.brands.add(new Brand(7,"HP"));
        this.brands.add(new Brand(8,"Xiaomi"));
        this.brands.add(new Brand(9,"Monster"));
        this.brands.add(new Brand(10,"Acer"));
    }

    public Brand() {
        addBrands();
    }

    public Brand(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public HashSet<Brand> getBrands() {
        return brands;
    }

    public PriorityQueue<Brand> getBrandsOrderById(){
        PriorityQueue<Brand> brandsById = new PriorityQueue<>(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getID() - o2.getID();
            }
        });
        brandsById.addAll(this.brands);
        return brandsById;
    }

    public PriorityQueue<Brand> getBrandsOrderByName(){
        PriorityQueue<Brand> brandsByName = new PriorityQueue<>(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        brandsByName.addAll(this.brands);
        return brandsByName;
    }

    public Brand getBrandByName(String brandName){
        Brand b;
        Iterator<Brand> itr = this.brands.iterator();

        while(itr.hasNext()){
            b = itr.next();
            if(b.getName().equals(brandName)){
                return b;
            }
        }
        return null;
    }

}
