import java.util.Scanner;
                                /*UVA: 11220 - Decoding the message.*/
public class UVA11220DecodingTheMessage {

    public void answer(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        input.nextLine();
        int i=1;
        while (n--!=0){
            if(i==1)
                System.out.println("Case #"+i+":");
            else{
                System.out.println();
                System.out.println("Case #"+i+":");
            }
            while(true){
                String st=input.nextLine();
                //System.out.println(st);
                if(st.equals("")) {
                    break;
                }else{

                    int size=st.length();
                    StringBuilder s=new StringBuilder();
                    boolean isTaked=false;
                    for(int j=0,count=1,index=1;j<size;j++){
                        //	System.out.println(st.charAt(j)+" "+j+" "+size);
                        if(st.charAt(j)==' '){
                            index=1;
                            if(isTaked){
                                count++;
                                isTaked=false;
                            }

                        }else{
                            if(index==count){
                                s.append(st.charAt(j));
                                isTaked=true;
                            }
                            index++;
                        }
                    }
                    System.out.println(s);
                }

            }
            i++;
        }
    }

}
