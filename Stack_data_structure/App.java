package Stack_data_structure;

import java.util.Arrays;

import Stack_data_structure.src.Stack;

public class App {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>(10);


        //Push elements
            st.push(10);
            st.push(5);
            st.push(20);
            st.push(30);
            st.push(35);


        //Show the array
        System.out.println(Arrays.toString(st.getArrayStack()));
        
        //remove and print the elements of stack
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(Arrays.toString(st.getArrayStack()));

        //Show the stack null and the top of stack -1
        System.out.println(st.pop());
        System.out.println(st.getTopOfStack());

    }
}
