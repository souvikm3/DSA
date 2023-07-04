package OOPS;

public class DynamicArray {
    private int data[];
    private int nxtIndex;
    public DynamicArray(){
        data =new int[5];
        nxtIndex=0;
    }
    public int size(){
        return nxtIndex;
    }
    public void add(int element){
        if(nxtIndex==data.length){
            data[nxtIndex]=element;
            nxtIndex++;
        }
    }
     public void set(int index,int element){

     }
     public int get(int index){
        return index;
     }
    private  void reStructure(){
        int temp[]=data;
        data=new int[data.length*2];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i]; 
        }
    }
}
