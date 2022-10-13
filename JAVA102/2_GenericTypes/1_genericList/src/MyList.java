public class MyList <T>{

    private int capacity = 10;

    private T [] list;

    private int index = 0;

    public MyList() {
        this.list = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[this.capacity];
    }

    public int size(){
        // returns data count
        return index;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data){
        this.list[index] = data;
        this.index++;
        if (this.index == this.list.length){
            addCapacity();
        }
    }

    private void addCapacity(){
        this.capacity *= 2;
        T [] newList = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.index; i++){
            newList[i] = this.list[i];
        }
        this.list = newList;
    }

    public T get(int index){
        if (index >= 0 && index < this.index){
            return this.list[index];
        }else {
            return null;
        }
    }

    public T remove(int index){
        if (index >= 0 && index < this.index){
            T removed = this.list[index];
            for (int i = index; i < this.index; i++){
                this.list[i] = this.list[i+1];
            }
            this.index--;
            return removed;
        }else {
            return null;
        }
    }

    public T set(int index, T data){
        if (index >= 0 && index < this.index){
            this.list[index] = data;
            return data;
        }else {
            return null;
        }
    }

    public String toString(){
        String stringList = "[";
        for (int i = 0; i < this.index - 1; i++){
            if (this.list[i] == null){
                continue;
            }
            stringList += this.list[i].toString() + ",";
        }
        if (this.list[this.index - 1] == null){
            stringList += "]";
        }else {
            stringList += this.list[this.index - 1] + "]";
        }
        return stringList;
    }

    public int indexOf(T data){
        for (int i = 0; i < this.index; i++){
            if (this.list[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int lastIndex = -1;
        for (int i = 0; i < this.index; i++){
            if (this.list[i] == data){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        if (this.index == 0){
            return true;
        } else {
            return false;
        }
    }

    public T[] toArray(){
        return this.list;
    }

    public void clear(){
        this.capacity = 10;
        this.list = (T[]) new Object[this.capacity];
    }

    public MyList<T> subList(int start, int finish){
        MyList<T> sublist = new MyList<>(finish - start);
        for (int i = start; i <= finish; i++){
            sublist.add(list[i]);
        }
        return sublist;
    }

    public boolean contains(T data){
        for(T arr : this.list){
            if (arr == data){
                return true;
            }
        }
        return false;
    }
}
