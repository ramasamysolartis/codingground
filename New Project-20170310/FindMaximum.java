public class FindMaximum {
   public static void main(String []args) {
     
     int[] a = {20,40,55,25,30,80};
     
     int pos = 0;
     int len = a.length;
     for(int i=1; i < len; i++) {
         if(a[i] > a[pos]) {
             pos = i;
         }
     }
                                                                                                
     System.out.println("Biggest number is : "+ a[pos]);

   }
} 