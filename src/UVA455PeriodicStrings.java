import java.lang.*;
import java.util.Scanner;
/*UVA: 455 - Periodic Strings  */
public class UVA455PeriodicStrings {

    public void answer(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        while(n--!=0){
            boolean isEqual=true;
            input.nextLine();
            String st=input.nextLine();

            int size=st.length();
            if(size==1){
                System.out.println(1);
                if(n!=0)
                    System.out.println();
                continue;

            }
            for(int i=1;i<=size/2;i++){
                char []sup=new char[i];
                for(int j=0;j<i;j++){
                    sup[j]=st.charAt(j);
                }
                isEqual=true;
                for(int j=i;j<size;j+=i){
                    if(j+i-1>=size){
                        isEqual=false;
                        break;
                    }
                    for(int k=0,l=j;k<i&&l<size;k++,l++){
                        //System.out.println(sup[k]+" "+st.charAt(l)+" "+k+" "+l);
                        if(sup[k]!=st.charAt(l)){

                            isEqual=false;
                            break;
                        }
                    }
                    if(!isEqual)
                        break;
                }
                if(isEqual){
                    System.out.println(i);
                    if(n!=0)
                        System.out.println();
                    break;
                }
            }
            if(!isEqual){
                System.out.println(size);
                if(n!=0)
                    System.out.println();
            }
        }

    }
}
