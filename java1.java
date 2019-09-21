import java.util.*;
public class First_shiyan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0,arg=0,max,min;
		double a=0,b=0,c=0,d=0,e=0,f=0;
		boolean flag=true;
		 //输入成绩时候，输入的结束条件是:键盘输入非double类型，点回车即可
		System.out.println("请输入成绩：");
		ArrayList<Double> al=new ArrayList<Double>();
		Scanner reader=new Scanner(System.in);
		while(reader.hasNextDouble()) {
			double x=reader.nextDouble();
			if(x<0||x>100) {
				System.out.println("输入成绩有误，重新开始");
				flag=false;
				break;
			}
			else
				al.add(x);
		}
		if(flag) {
			//求平均值
			for(int i=0;i<al.size();i++) {
				sum=sum+al.get(i);
				arg=sum/al.size();
			}		
			System.out.printf("平均分%.1f", arg);
			System.out.println("");
			//求最低最高分
			max=min=al.get(0);
			for(int i=1;i<al.size();i++) {		
				if(max<al.get(i))
					max=al.get(i);
				if(min>al.get(i))
					min=al.get(i);
			}
			System.out.println("最高分:"+max+"   最低分:"+min);
			//分档次 求百分比
			for(int i=0;i<al.size();i++) {
				if(al.get(i)<60) a++;
				else if(al.get(i)<70) b++;
				else if(al.get(i)<80) c++;
				else if(al.get(i)<90) d++;
				else if(al.get(i)<100) e++;
				else if(al.get(i)==100) f++;
			}
			System.out.print("不及格档:"+(int)a+"人");
			System.out.printf(" 百分比%.1f", a/al.size());
			System.out.println("");
			System.out.print("60到69分档:"+(int)b+"人");
			System.out.printf(" 百分比%.1f", b/al.size());
			System.out.println("");
			System.out.print("70到79分档:"+(int)c+"人");
			System.out.printf(" 百分比%.1f", c/al.size());
			System.out.println("");
			System.out.print("80到89分档:"+(int)d+"人");
			System.out.printf(" 百分比%.1f", d/al.size());
			System.out.println("");
			System.out.print("90到99分档:"+(int)e+"人");
			System.out.printf(" 百分比%.1f", e/al.size());
			System.out.println("");
			System.out.print("100分档:"+(int)f+"人");
			System.out.printf(" 百分比%.1f", f/al.size());
		}    
	}
}

