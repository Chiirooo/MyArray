public class MyArray{
    private int[] arr;
    private int size, index, count;

    public MyArray(int size){
        this.size = size;
        arr = new int[size];
        index= - 1;
        count = 0;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void add(int value){
        if(isFull()) return;
        arr[++index] = value;
        count++;
        return;
    }

    public void remove(int idx){
        if(idx < 1 || idx > count) return;
        for(int i = idx; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0; 
        index--;
        count--;        
    }

    public void search(int value){
        if(isEmpty()) return;

        for(int i = 0; i < count; i++){
            if(arr[i] == value){
                System.out.println("Value is found at index " + i);
                return;
            }
        }

        System.out.println("Value not found");
    }

    public void sort(char option){
        for(int i = 0; i < count - 1; i++){
            for(int j = i + 1; j < count; j++){
                if(isAscending(option)){
                    if(arr[j] < arr[i]) swap(arr, i , j);
                }
                else{
                    if(arr[j] > arr[i]) swap(arr, i , j);
                }   
            }
        }
    }


    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private boolean isAscending(char option){
        if(option == 'a') return true;
        else return false;
    }

    public void edit(int idx, int value){
        if(idx < 1 || idx > count) return;
        arr[idx] = value;
    }
    
    public void viewArray(){
        System.out.println();
        if(isEmpty()) return;
        for(int i = 0; i < count; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if(count == 0){
            System.out.println("Array is empty :<<");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(count == size){
            System.out.println("Array is already full");
            return true;
        }
        return false;
    }

}