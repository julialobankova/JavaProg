
//Вывести все простые числа от 1 до 1000

public class DZ2 {
    public static void main(String[] args) {
        int j = 0;
    for(int i=2;i<=1000;i++){
	    for(j=2;j<i;j++){
		    if(i%j==0)
			    break;
      }
		if(j == i){ 
		    System.out.println(i);
		}
	}
 }	
}

