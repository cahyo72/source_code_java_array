import java.io.*;
public class ArraySample2{
	public static void main(String[] args) throws IOException{
		String inData;
		int pjgAry;
		int[] ages;
		
		BufferedReader datain = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print(" Masukkan Panjang Array : ");
		pjgAry = Integer.parseInt(datain.readLine());
		ages = new int[pjgAry];
		ages[1]=5;
		
		System.out.println(" Panjang Array Adalah " + ages.length);
		}
			}