package arrayelementpract;

public class Arrayelementpract {

  
    public static void main(String[] args) {
     int [] mylist = {12,34,2,1,5,8};

     for (int element:mylist){
         System.out.println(element);
     }
     
     int total=0;
     for(int i=0;i<mylist.length;i++){
        total+=mylist[i];
     }
     
     System.out.println("Total is "+total);
     
     int max = mylist[0];
     for(int i=1;i<mylist.length;i++){
         if(mylist[i]>max){
             max=mylist[i];
         }
     }
     System.out.println("Max is "+max);
    }
    
}
