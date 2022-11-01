import java.util.*;

public class FixtureGenerator {

    private Scanner scanner = new Scanner(System.in);
    private HashSet<String> teams = new HashSet<>();
    private PriorityQueue<String> allMatches = new PriorityQueue<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    });
    private String[] fixture;


    private void createFixture(){

        int weeks = (this.teams.size() - 1) * 2;
        this.fixture = new String[weeks];
        String temp[] = new String[2];

        while(!allMatches.isEmpty()){
            temp = allMatches.peek().split("-");
            for(int i = 0; i < this.fixture.length; i++){
                if(this.fixture[i] == null){
                    this.fixture[i] = allMatches.poll();
                    break;
                }
                if(!fixture[i].contains(temp[0]) && !fixture[i].contains(temp[1])){
                    this.fixture[i] += " " + allMatches.poll();
                    break;
                }
            }
        }
    }

    private void printFixture(){
        int matchesPerWeek = this.teams.size() / 2;
        String[] temp = new String[matchesPerWeek];

        for(int i = 0; i < this.fixture.length; i++){
            temp = this.fixture[i].split(" ");
            System.out.println("\tWEEK " + (i+1));
            for(int j = 0; j < temp.length; j++){
                System.out.println(temp[j]);
            }
        }
    }

    private void calculateAllMatches(){

        String[] arrTemp = new String[teams.size()];

        Iterator<String> itr = teams.iterator();
        for(int i = 0; i < arrTemp.length; i++){
            arrTemp[i] = itr.next();
        }

        for (int i = 0; i < arrTemp.length; i++){
            for (int j = 0; j < arrTemp.length; j++){
                if(arrTemp[i].equals(arrTemp[j])){
                    continue;
                }else {
                    this.allMatches.add(arrTemp[i] + "-" + arrTemp[j]);
                }
            }
        }
    }

    private void printTeams(){
        System.out.print("Takimlar:\t/ ");
        Iterator<String> itr = this.teams.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " / ");
        }
        System.out.println();
    }

    private void addTeam(){
        System.out.println("Eklenecek takimlari giriniz.\t\tBitirmek icin 'q' giriniz.");
        while(true){
            System.out.print("Takim adi: ");
            String team = scanner.nextLine();
            if(team.equals("q")){
                if(this.teams.size() % 2 == 0){
                    System.out.println("Takimlar olusturuldu...");
                    break;
                }else{
                 this.teams.add("bye");
                    System.out.println("Takimlar olusturuldu...");
                    break;
                }
            }else{
                if(teams.add(team)){
                    System.out.println("Takim eklendi.");
                } else{
                    System.out.println("Takim tekrar eklenemez..!");
                }
            }
        }
    }

    public void run(){
        addTeam();
        printTeams();
        calculateAllMatches();
        createFixture();
        printFixture();
    }
}
