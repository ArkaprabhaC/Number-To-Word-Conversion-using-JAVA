import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="";
	    int c=1;
	    
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    Main obj = new Main();
	    
	    str = obj.convert(num);
	    
	    System.out.println("The string is: "+str);
	}
	
	String convert(int n){
	    
	    String unit_tens[]={"","One","Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Eleven", "Twelve", "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	    String tens_multiples[]={"","","Twenty","Thirty", "Forty", "Fifty","Sixty","Seventy","Eighty","Ninety"};
	    String ten_power[]={"","Hundred","Thousand"};
	    
	    if(n<20){
	        return unit_tens[n];
	    }
	    if(n<100){
	        return tens_multiples[n/10]+" "+unit_tens[n%10];
	    }
	    if(n<1000){
	        return unit_tens[n/100]+" Hundred "+convert(n%100);
	    }
	    
	    if(n<100000){
	        return unit_tens[n/1000]+" Thousand "+convert(n%1000);
	    }
	    if(n<1000000){
	        return unit_tens[n/100000]+" Hundred "+convert(n%100000);
	    }
	    if(n<10000000){
	        return unit_tens[n/1000000]+" Million "+convert(n%1000000);
	    }
	    
	   return unit_tens[n/10000000]+" Trillion "+convert(n%10000000);
	    
	    
	}
}
