public class CommandLine {
    public static void main(String[] args) {
        // for(String str: args) {
        //     System.out.print(str+" ");
        // }
         
        for(int i=0; i<args.length; i++) {
            System.out.print(args[i]+" ");
        }
	System.out.println();
    }
}
