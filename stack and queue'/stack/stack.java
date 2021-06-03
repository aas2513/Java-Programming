public class stack{
    protected int[] arr=null;
    protected int capacity=0;
    protected int elementCount=0;
    protected int tos=-1;

    // constructors

    protected void initialiseVariables(int capacity){
        this.capacity = capacity;
        this.arr=new int[capacity];
        this.elementCount=0;
        this.tos= -1;
    }

    public stack(){
        initialiseVariables(10);     //by-default capacity set to 10
    }

    public stack(int capacity){
        initialiseVariables(capacity);
    }

    //basic functions

    public int size(){
        return this.elementCount;
    } 

    public boolean isEmpty(){
        return this.elementCount==0;
    }

    // override for display function

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<this.elementCount;i++){
            sb.append(this.arr[i]);
            if(i != elementCount-1){
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
 
    // exception functions

    private void OverFlow() throws Exception{
        if(this.capacity ==  this.elementCount){
            throw new Exception("Stack is Full");
        }
    }
    private void UnderFlow() throws Exception{
        if( this.elementCount ==0){
            throw new Exception("Stack is Empty");
        }
    }

    // STACK FUNCTIONS

    protected void push_(int data){
        this.arr[++this.tos]=data;
        this.elementCount++;
    }

    public void push(int data) throws Exception{
        OverFlow();
        push_(data);
    }

    public int top() throws Exception{
        UnderFlow();
        return this.arr[this.tos];
    }

    protected int pop_(){
        int rv=this.arr[this.tos];
        this.arr[this.tos--]=0;
        this.elementCount--;
        return rv;
    }

    public int pop() throws Exception{
        UnderFlow();
        return pop_();
    }
}