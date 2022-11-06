import java.util.*;

public class Notebook {

    private HashSet<Notebook> notebookHashSet = new HashSet<>();
    private int ID;
    private double price;
    private double discount;
    private int stock;
    private String productName;
    private Brand brand;
    private int RAM;
    private int memory;
    private double screenSize;

    public Notebook() {
    }

    public Notebook(double price, double discount, int stock, String productName, Brand brand, int RAM, int memory, double screenSize) {
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.productName = productName;
        this.brand = brand;
        this.RAM = RAM;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public boolean addNotebook(Notebook n){
        int newID;
        if(getNotebooksOrderByIDReversed().isEmpty()){
            newID = 1;
        }else{
            newID = getNotebooksOrderByIDReversed().peek().getID() + 1;
        }
        n.setID(newID);
        return this.notebookHashSet.add(n);
    }

    public void printAllNotebooksOrderByID(){
        PriorityQueue<Notebook> notebooks = getNotebooksOrderByID();
        Notebook n;
        System.out.println("-----------------------------------------------------------------------------------------------------------------" +
                "\n|\tID\t|\tBrand\t|\tProductName\t\t|\tMemory\t|\tScreenSize\t|\tRAM\t|\tPrice\t|\tDiscount\t|\tStock\t|");
        while(!notebooks.isEmpty()){
            n = notebooks.poll();
            System.out.format("|\t%d\t|\t%s\t|\t%s\t\t|\t%d\t|\t%.1f\t\t|\t%d\t|\t%.1f\t|\t%.2f\t\t|\t%d\t\t|\n",
                    n.getID(),n.getBrand().getName(),n.getProductName(),n.getMemory(),n.getScreenSize(),
                    n.getRAM(),(float)n.getPrice(),(float)n.getDiscount(),n.getStock());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }

    public boolean removeNotebookByID(int ID){
        Iterator<Notebook> itr = this.notebookHashSet.iterator();
        while(itr.hasNext()){
            Notebook notebook = itr.next();
            if (notebook.getID() == ID){
                this.notebookHashSet.remove(notebook);
                return true;
            }
        }
        return false;
    }

    public PriorityQueue<Notebook> getNotebooksOrderByID(){
        PriorityQueue<Notebook> notebooksByID = new PriorityQueue<>(new Comparator<Notebook>() {
            @Override
            public int compare(Notebook n1, Notebook n2) {
                return n1.getID() - n2.getID();
            }
        });
        notebooksByID.addAll(this.notebookHashSet);
        return notebooksByID;
    }

    public PriorityQueue<Notebook> getNotebooksOrderByIDReversed(){
        PriorityQueue<Notebook> notebooksByIDReversed = new PriorityQueue<>(new Comparator<Notebook>() {
            @Override
            public int compare(Notebook n1, Notebook n2) {
                return n2.getID() - n1.getID();
            }
        });
        notebooksByIDReversed.addAll(this.notebookHashSet);
        return notebooksByIDReversed;
    }

    public PriorityQueue<Notebook> getNotebooksOrderByName(){
        PriorityQueue<Notebook> notebooksByName = new PriorityQueue<>(new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getProductName().compareTo(o2.getProductName());
            }
        });
        notebooksByName.addAll(this.notebookHashSet);
        return notebooksByName;
    }

    public ArrayList<Notebook> getNotebooksByBrand(String strBrand){
        ArrayList<Notebook> notebooksByBrand = new ArrayList<>();
        Iterator<Notebook> itr = this.notebookHashSet.iterator();
        while(itr.hasNext()){
            Notebook n = itr.next();
            if(n.getBrand().getName().equals(strBrand)){
                notebooksByBrand.add(n);
            }
        }
        return notebooksByBrand;
    }

    public HashSet<Notebook> getNotebookHashSet() {
        return notebookHashSet;
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

    public int getRAM() {
        return RAM;
    }

    public int getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
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

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
