package com.yash;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // it will call customstack()
    }
    public DynamicStack(int size){
        super(size);//It will call custom Stack(int(size)

    }
    @Override
    public boolean push(int item){
        //this takes care of it being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy alll previous items in new data
            for(int i = 0;i<data.length;i++){
                temp[i]=data[i];

            }
            data = temp;
        }
        //at this point we know that array is not full
        //insert item
        return super.push(item);
    }
}
