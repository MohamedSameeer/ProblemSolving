import java.util.Scanner;

                                        /*UVA: 11965 - ExtraSpaces  */
public class UVA11965ExtraSpaces {

    public void answer(){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int n,i=1;
        while(t--!=0){
            n=input.nextInt();
            input.nextLine();
            int count=1;
            System.out.println("Case "+i+":");
            while (n--!=0){
                String s=input.nextLine();
                StringBuilder st=new StringBuilder(s);
                int size=s.length();
                char pre=st.charAt(0);
                for(int j=1;j<size;j++){
                    //	System.out.println(j+" "+st.charAt(j)+" "+pre);
                    if(st.charAt(j)==' '&&st.charAt(j)==pre){
                        st.deleteCharAt(j-1);
                        size--;
                        j--;
                    }
                    pre=st.charAt(j);
                }
                System.out.println(st);
                count++;
            }
            i++;
            if(t!=0)
                System.out.println();
        }
    }
}
