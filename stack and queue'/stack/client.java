public class client {
    public static void main(String[] args) throws Exception {
        // int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        dynamicStack st = new dynamicStack(5);
        for (int i = 1; i <= 5; i++)
            st.push(i * 10);
    // stack st=new stack();

    // for(int i=1;i<9;i++){
    //     st.push(i*10);
    // }
    st.push(200);
    st.push(300);
    st.push(900);
        System.out.println(st);
    }
}