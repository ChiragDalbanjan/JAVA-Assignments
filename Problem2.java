import java.util.Scanner;

public class Problem2{
    static int size = 10;
    static int[] arr = new int[size];
    
    public static void main(String... args) {

        int choice, data;
        Scanner sc = new Scanner(System.in);
        Stack st1, st2;
        System.out.println("\nEneter the size of stack :  ");

        int size = sc.nextInt();
         st1 = new Stack(size);
        st2 = new Stack(size);

        

        
        System.out.println("\n\n\tEnter \n\t1 for Push in stack1 \n\t2 for Push in stack2 , \n\t3 for Pop in stack1, \n\t4 for Pop in stack2 ,");
        System.out.print("\nChoose action from given above: ");

        

        while(true){
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter integer data to be pushed");
                    data = sc.nextInt();
                    st1.push(data);
                    
                    break;

                case 2:
                    System.out.println("Enter integer data to be pushed");
                    data = sc.nextInt();
                    st2.push(data);
                    
                    break;
                case 3:
                    st1.pop();
                    break;
                case 4:
                    st2.pop();
                    break;
                default:
                    System.out.println("Please choose correct option...");
                    break;
                
            }
            if(st1.getTop() == st2.getTop()){
                System.out.println("size of stack became same, size is: " + (st1.getTop()+1));
            }
        
            System.out.print("Choose option: ");


        }



        // Stack stack = new Stack(10);
        // stack.push(5);
        // System.out.println(stack.getData()[0]);
        // stack.push(10);
        
        // System.out.println(stack.getData()[1]);
        
        // System.out.println(stack.getTop());
        // stack.pop();
        // System.out.println(stack.getTop());
        // stack.pop();
        // stack.pop();
        // System.out.println(stack.checkEmpty());
        
        
    }
}

class Stack{

    private int[] data;

    int top, max;

    Stack(int size){
        data = new int[size];
        this.max = size;
        this.top = -1;

    }

    int[] getData(){
        return this.data;
    }

    int getTop(){
        return this.top;
    }

    void push(int i){
        if (this.top+1 == max){
            System.out.println("stack is overflowed!");
        }
        else{
            ++this.top;
            data[this.top] = i;
        }
    }

    void pop(){
        if (top == -1){
            System.out.println("stack is underflowed!");
        }
        else{            
            System.out.println("poped data: "+this.data[top--]);
        }
    }

    boolean checkEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }
}