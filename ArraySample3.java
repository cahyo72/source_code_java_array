import java.io.*;
public class ArraySample3{
	public static void main(String[] args) throws IOException{
		int[] ages = new int[4];
		String inData;
		int pjgAry;
		
		
		BufferedReader datain = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print(" Masukkan Panjang Array : ");
		pjgAry = Integer.parseInt(datain.readLine());
		ages = new int[pjgAry];
		
		for(int x=0; x<ages.length; x++){
			ages[x]=x+2;
		}
		
		for(int i=0; i<ages.length; i++){
			
		
		System.out.println(ages[i]);
		}
			}
				}