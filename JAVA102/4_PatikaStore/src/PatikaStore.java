import java.util.Scanner;

public class PatikaStore {

    private Brand brand;
    private Phone phone;
    private Notebook notebook;
    Scanner scanner = new Scanner(System.in);

    public PatikaStore() {
        this.brand = new Brand();
        this.phone = new Phone();
        this.notebook = new Notebook();
    }

    public void mainMenu(){
        while (true){
            System.out.println("1. Magaza\t2. Urun ekle\t3. Urun cikar\t4. Cikis\t\t\t\t\t9. Hizli urun ekle");
            System.out.print("Islem seciniz: ");
            int var;
            try{
                var = Integer.parseInt(scanner.nextLine());
                if(var == 1){
                    store();
                }else if(var == 2){
                    addProduct();
                }else if(var == 3){
                    removeProduct();
                }else if(var == 4){
                    System.out.println("Cikis yapiliyor...");
                    break;
                }else if(var == 9){
                    System.out.println("HIZLI EKLEME");
                    fastAddProduct();
                }else{
                    System.out.println("Hatali tuslama yaptiniz.");
                }
            } catch (Exception e){
                System.out.println("Hatali tuslama yaptiniz.");
            }
        }
    }

    public void store(){
        System.out.println("Magaza arayuzune giris yapildi...");
        while(true){
            System.out.println("1. Telefon\t2. Notebook\t3. Hepsi\t4. Ana Menu");
            System.out.print("Islem seciniz: ");
            int var;
            try{
                var = Integer.parseInt(scanner.nextLine());
                if(var == 1){
                    System.out.println("Telefon urunleri listeleniyor...");
                    phone.printAllPhonesOrderByID();
                }else if(var == 2){
                    System.out.println("Notebook urunleri listeleniyor...");
                    notebook.printAllNotebooksOrderByID();
                }else if (var == 3){
                    System.out.println("Tum urunler listeleniyor...");
                    phone.printAllPhonesOrderByID();
                    notebook.printAllNotebooksOrderByID();
                }else if (var == 4){
                    System.out.println("Ana menuye donuluyor...");
                    break;
                }else{
                    System.out.println("Hatali tuslama yaptiniz.");
                }
            }catch (Exception e){
                System.out.println("Hatali tuslama yaptiniz.");
            }
        }
    }

    public void addProduct(){
        System.out.println("Urun Ekleme arayuzune giris yapildi...");
        while(true){
            System.out.println("1. Telefon ekle\t2. Notebook ekle\t3. Ana Menu");
            System.out.print("Islem seciniz: ");
            int var;
            try{
                var = Integer.parseInt(scanner.nextLine());
                if(var == 1){
                    System.out.println("\tTELEFON EKLEME");
                    try {
                        Phone p = new Phone();
                        System.out.print("Brand Name: ");
                        if(!p.setBrand(scanner.nextLine())){
                            System.out.println("Marka Bulunamadı!");
                            continue;
                        }

                        System.out.print("Product Name: ");
                        p.setProductName(scanner.nextLine());

                        System.out.print("Memory (GB): ");
                        p.setMemory(Integer.parseInt(scanner.nextLine()));

                        System.out.print("Screen Size (Inch): ");
                        p.setScreenSize(Double.parseDouble(scanner.nextLine()));

                        System.out.print("Battery (mAh): ");
                        p.setBattery(Integer.parseInt(scanner.nextLine()));

                        System.out.print("RAM (GB): ");
                        p.setRAM(Integer.parseInt(scanner.nextLine()));

                        System.out.print("Color: ");
                        p.setColor(scanner.nextLine());

                        System.out.print("Price (TL): ");
                        p.setPrice(Double.parseDouble(scanner.nextLine()));

                        System.out.print("Discount Rate: ");
                        p.setDiscount(Double.parseDouble(scanner.nextLine()));

                        System.out.print("Stock: ");
                        p.setStock(Integer.parseInt(scanner.nextLine()));

                        this.phone.addPhone(p);

                    } catch (Exception e){
                        System.out.println("Hatalı giris yaptiniz.");
                        System.out.println(e.getMessage());
                    }
                }else if(var == 2){
                    System.out.println("\tNOTEBOOK EKLEME");
                    try {
                        Notebook n = new Notebook();
                        System.out.print("Brand Name: ");
                        if(!n.setBrand(scanner.nextLine())){
                            System.out.println("Marka Bulunamadı!");
                            continue;
                        }

                        System.out.print("Product Name: ");
                        n.setProductName(scanner.nextLine());

                        System.out.print("Memory (GB): ");
                        n.setMemory(Integer.parseInt(scanner.nextLine()));

                        System.out.print("Screen Size (Cm): ");
                        n.setScreenSize(Double.parseDouble(scanner.nextLine()));

                        System.out.print("RAM (GB): ");
                        n.setRAM(Integer.parseInt(scanner.nextLine()));

                        System.out.print("Price (TL): ");
                        n.setPrice(Double.parseDouble(scanner.nextLine()));

                        System.out.print("Discount Rate: ");
                        n.setDiscount(Double.parseDouble(scanner.nextLine()));

                        System.out.print("Stock: ");
                        n.setStock(Integer.parseInt(scanner.nextLine()));

                        this.notebook.addNotebook(n);

                    } catch (Exception e){
                        System.out.println("Hatalı giris yaptiniz.");
                        System.out.println(e.getMessage());
                    }
                }else if (var == 3){
                    System.out.println("Ana menuye donuluyor...");
                    break;
                }else{
                    System.out.println("Hatali tuslama yaptiniz.");
                }
            }catch (Exception e){
                System.out.println("Hatali tuslama yaptiniz.");
            }
        }

    }

    public void removeProduct(){
        System.out.println("Urun silme arayuzune giris yapildi...");
        while(true){
            System.out.println("1. Telefon sil\t2. Notebook sil\t3. Ana Menu");
            System.out.print("Islem seciniz: ");
            int var;
            int ID;
            try{
                var = Integer.parseInt(scanner.nextLine());
                if(var == 1){
                    System.out.print("Telefon ID: ");
                    ID = Integer.parseInt(scanner.nextLine());
                    if(phone.removePhoneByID(ID)){
                        System.out.println("Urun silindi.");
                    }else{
                        System.out.println("Urun bulunamadı!");
                    }
                }else if(var == 2){
                    System.out.print("Notebook ID: ");
                    ID = Integer.parseInt(scanner.nextLine());
                    if(notebook.removeNotebookByID(ID)){
                        System.out.println("Urun silindi.");
                    }else{
                        System.out.println("Urun bulunamadı!");
                    }
                }else if (var == 3){
                    System.out.println("Ana menuye donuluyor...");
                    break;
                }else{
                    System.out.println("Hatali tuslama yaptiniz.");
                }
            }catch (Exception e){
                System.out.println("Hatali tuslama yaptiniz.");
            }
        }
    }

    private void fastAddProduct(){
        phone.addPhone(new Phone(5000,0.15,5,"Redmi 10",brand.getBrandByName("Xiaomi"),64,6.5,3000,6,"Siyah"));
        phone.addPhone(new Phone(6000,0.15,15,"Galaxy A51",brand.getBrandByName("Samsung"),128,6.1,4000,6,"Mavi"));
        phone.addPhone(new Phone(4000,0.15,23,"IPhone 11",brand.getBrandByName("Apple"),64,6.3,3500,4,"Beyaz"));
        phone.addPhone(new Phone(9000,0.15,7,"Mi 13 Pro",brand.getBrandByName("Xiaomi"),256,6.2,4500,8,"Siyah"));
        phone.addPhone(new Phone(15000,0.15,2,"Iphone 14",brand.getBrandByName("Apple"),256,6.3,3300,6,"Beyaz"));
        notebook.addNotebook(new Notebook(10000,0.15,13,"Matebook 14",brand.getBrandByName("Huawei"),16,1024,15.6));
        notebook.addNotebook(new Notebook(12000,0.15,12,"V14 IGL PRO",brand.getBrandByName("Lenovo"),8,2048,15.6));
        notebook.addNotebook(new Notebook(18000,0.15,19,"Tuf Gaming",brand.getBrandByName("Asus"),12,1024,15.6));
        notebook.addNotebook(new Notebook(8000,0.15,25,"Abra A17.2",brand.getBrandByName("Monster"),16,2048,15.6));
        notebook.addNotebook(new Notebook(11500,0.15,8,"Nitro V5",brand.getBrandByName("Acer"),16,1024,15.6));
    }
}
