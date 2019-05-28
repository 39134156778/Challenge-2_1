import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;
public class Program {
	public static void main(String []args){
		int min = 1;
		int max = 10;
		int diff = max - min;
		Random random = new Random();
		int i = random.nextInt(diff + 1);
		i += min;
        int[]array= new int[i]; 
        for (int t = 0; t < array.length; t++) {
            array[t] = random.nextInt(40);       
            System.out.print(array[t]);
            System.out.print(" ");
        }
        System.out.println();        
        int j = random.nextInt(diff + 1);
		j += min;
        int[]array2= new int[j];
        for (int z = 0; z < array2.length; z++) {
            array2[z] = random.nextInt(40);
            System.out.print(array2[z]);
            System.out.print(" ");
        }
        System.out.println();
        int[] array3 = new int[array.length+array2.length];
        int t = 0;
        for (int index =0 ; index < array.length; index++){
            array3[t] = array[index];
            t++;           
        }
        for (int index = 0; index < array2.length; index++){
            array3[t] = array2[index];
            t++;
        }
        for (int e=0;e<array3.length;e++) {
            	System.out.print(array3[e]+ " ");
        }
        System.out.println();
        Bouble(array3);
        }
	public static void Bouble(int[] m)
	{
		int povtoriv =0;
		boolean vidbzam= true;
		while(vidbzam) {
			vidbzam=false;
		for(int c=0;c<m.length-1-povtoriv;c++) {
			if(m[c]>m[c+1]) {
				int tmp = m[c];
				m[c]=m[c+1];
				m[c+1]= tmp;
				vidbzam=true;
			}
			
		}
		povtoriv++;
	}
		for (int e=0;e<m.length;e++) {
	    	if((m[e]%5)!=0)
	        	System.out.print(m[e]+ " ");
	    }
		for(int c: m);
			
        }
}
