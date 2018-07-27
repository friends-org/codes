import java.util.*;
class Pattern4{
  public static void main(String[] args) {
    System.out.println("enter height of first half and starting element");
    Scanner sc=new Scanner(System.in);
    int val=0;
    int h=sc.nextInt();
    int s=sc.nextInt();
    for(int i=0;i<2*h;i++){
      if(i<h){
        for(int j=0;j<=i;j++){
          System.out.print(s);
        }
        System.out.println();
        s++;
        val=s-1;
      }
      else
      {
        for(int k=i;k<2*h;k++){
          System.out.print(val);
        }
        System.out.println();
        val--;
      }
    }
  }
}
