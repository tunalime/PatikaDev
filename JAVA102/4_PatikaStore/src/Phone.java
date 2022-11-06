import java.lang.reflect.Array;
import java.util.*;

public class Phone {

    private int ID;
    private double price;
    private double discount;
    private int stock;
    private String productName;
    private Brand brand;
    private int memory;
    private double screenSize;
    private int battery;
    private int RAM;
    private String color;
    private HashSet<Phone> phoneHashSet = new HashSet<>();

    public Phone() {
    }

    public Phone(double price, double discount, int stock, String productName, Brand brand, int memory, double screenSize, int battery, int RAM, String color) {
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.productName = productName;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.RAM = RAM;
        this.color = color;
    }

    public boolean addPhone(Phone phone){
        int newID;
        if(getPhonesOrderByIDReversed().isEmpty()){
            newID = 1;
        }else{
            newID = getPhonesOrderByIDReversed().peek().getID() + 1;
        }
        phone.setID(newID);
        return this.phoneHashSet.add(phone);
    }

    public boolean removePhoneByID(int ID){
        Iterator<Phone> itr = this.phoneHashSet.iterator();
        while(itr.hasNext()){
            Phone p = itr.next();
            if(p.getID() == ID){
                phoneHashSet.remove(p);
                return true;
            }
        }
        return false;
    }

    public void printAllPhonesOrderByID(){
        PriorityQueue<Phone> phones = getPhonesOrderByID();
        Phone p;
        System.out.println("-----------------------------------------------------------------------------------------------------------------" +
                "\n|\tID\t|\tBrand\t|\tProductName\t|\tMemory\t|\tScreenSize\t|\tBattery\t|\tRAM\t|\tColor\t|\tPrice\t|\tDiscount\t|\tStock\t|");
        while(!phones.isEmpty()){
            p = phones.poll();
            System.out.format("|\t%d\t|\t%s\t|\t%s\t|\t%d\t\t|\t\t%.1f\t\t|\t%d\t|\t%d\t|\t%s\t|\t%.1f\t|\t%.2f\t\t|\t%d\t\t|\n",
                    p.getID(),p.getBrand().getName(),p.getProductName(),p.getMemory(),(float)p.getScreenSize(),
                    p.getBattery(),p.getRAM(),p.getColor(),(float)p.getPrice(),(float)p.getDiscount(),p.getStock());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }

    public PriorityQueue<Phone> getPhonesOrderByID(){
        PriorityQueue<Phone> phonesByID = new PriorityQueue<>(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getID() - o2.getID();
            }
        });
        phonesByID.addAll(this.phoneHashSet);
        return phonesByID;
    }

    public PriorityQueue<Phone> getPhonesOrderByIDReversed(){
        PriorityQueue<Phone> phonesByIDReversed = new PriorityQueue<>(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o2.getID() - o1.getID();
            }
        });
        phonesByIDReversed.addAll(this.phoneHashSet);
        return phonesByIDReversed;
    }

    public PriorityQueue<Phone> getPhonesOrderByName(){
        PriorityQueue<Phone> phonesByName = new PriorityQueue<>(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getProductName().compareTo(o2.getProductName());
            }
        });
        phonesByName.addAll(this.phoneHashSet);
        return phonesByName;
    }

    public ArrayList<Phone> getPhonesByBrand(String strBrand){
        ArrayList<Phone> phonesByBrand = new ArrayList<>();
        Iterator<Phone> itr = this.phoneHashSet.iterator();
        while(itr.hasNext()){
            Phone p = itr.next();
            if(p.getBrand().getName().equals(strBrand)){
                phonesByBrand.add(p);
            }
        }
        return phonesByBrand;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public String getProductName() {
        return productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public int getRAM() {
        return RAM;
    }

    public String getColor() {
        return color;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean setBrand(String brandName) {
        Brand b = new Brand();
        HashSet<Brand> brands =  b.getBrands();
        Iterator<Brand> itr = brands.iterator();
        while(itr.hasNext()){
            b = itr.next();
            if(b.getName().equals(brandName)){
                this.brand = b;
                return true;
            }
        }
        return false;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
