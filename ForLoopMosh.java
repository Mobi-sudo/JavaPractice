public class ForLoopMosh {
    public static void main(String[] args) {
        /* Statement 1: int i = 0 this is executed (one time ) before the execution of the code block
         * Statement 2: i < 10 this defines the condition for executing the code block
         * Statement 3: i++ this is executed(every time) after the code block has been executed
          */
        for(int i =0; i < 10; i++)
            System.out.println("Hello there!");
        // Expected OutPut
        /* Hello there!
         * Hello there!
         * Hello there!
         * Hello there!
         * Hello there!
         * Hello there!
         * Hello there!
         * Hello there!
         * Hello there!
         * Hello there!
         */
    }
}
