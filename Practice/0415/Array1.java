import java.util.*;
public class Array1{
	public static void main(String[] args){
		double[] number={1.2,3.7,4.1};
		double sum=sumNum(number);
		double ave=aveNum(sum,number);
		System.out.printf("合計値:%.1f%n平均値:%.1f%n",sum,ave);
	}
	public static double sumNum(double[] sum){
		double sum2=0;
		for(int i=0;i<sum.length;i++){
			 sum2+=sum[i];
		}
		return sum2;
	}
	public static double aveNum(double sum,double[] array){
		double ave=sum / array.length;
		return ave;
	}
}
