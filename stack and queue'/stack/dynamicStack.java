public class dynamicStack extends stack{

    public dynamicStack(){
        super();
    }

    public dynamicStack(int size){
        super(size);
    }

    public dynamicStack(int[] arr){
        super.initialiseVariables(arr.length * 2);

        for(int ele:arr)    super.push_(ele);
    }

    @Override
    public void push(int data) throws Exception{
        if(super.capacity ==  super.elementCount){
            int[] temp=super.arr; //copying old data
            super.initialiseVariables(2*super.capacity); //new space for upcoming data
            for(int ele:temp){
                super.push_(ele);   //copying old data in new space
            }
        }
        super.push(data); //adding upcoming data to stack
    }
}