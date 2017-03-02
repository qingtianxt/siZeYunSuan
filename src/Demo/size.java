package Demo;

import java.util.Scanner;

public class size {
	public static void main(String[]args)
	{
		String ch="y";//是否退出循环
		int choose=0;//判断是否添加真分数
		int []cc1=new int [2];//记录正确和错误的题数
		int []cc2=new int [2];//用来接收正确和错误的题数
		int yn=0;//运行一次while循环时，只让第一次询问是否添加真分数
		Scanner scan=new Scanner(System.in);
		while(ch=="y")
		{
			if(yn==0)
			{
				yn++;
				System.out.println("你学过真分数吗：1.学过。2没学过");
				choose=scan.nextInt();
			}
			else{
				if(choose==1)
				{
					System.out.println("你想做几个题呢");
					int num=scan.nextInt();
					fuza(num);
					System.out.println("好棒，是继续努力还是先休息一会,请选择：1.继续。2休息一会");
					{
						int rl=scan.nextInt();
						if(rl==2)
						{
							ch="z";
						}
					}
				}
				else 
				{
					
					System.out.println("你想做几个题呢");
					int num=scan.nextInt();
					cc2=simpleys(num);
					cc1[0]+=cc2[0];
					cc1[1]+=cc2[1];
					System.out.println("好棒，是继续努力还是先休息一会,请选择：1.继续。2休息一会");
					{
						int rl=scan.nextInt();
						if(rl==2)
						{
							ch="z";
							System.out.println("你一共作答"+(cc1[0]+cc1[1])+"道题,"+"其中共答对了"+cc1[0]+"道题,"+"答错了"+cc1[1]+"道题.");
						}
					}
				}
			}
			
		}
	}
	static void yunsuan2(int a,int b,int c,int d,int e)
	{
		
	}
	private static void fuza(int num) {
		// TODO Auto-generated method stub
		String []a1=new String[num+1];
		String []a2=new String[num+1];
		int i=0;
		int m=0;//判断是否打印出来
		String l="";
		while(i<num)
		{
			m=0;
			l="";
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int c=(int)(Math.random()*100);
			int d=(int)(Math.random()*100);
			int e=(int)(Math.random()*4);
			String f="";
			String g="";
			if(a>=b||c>=d||c==0||d==0||b==0||a==0)
			{
				m=1;
			}
			else
			{
				int h=maxyue(a,b);
				int k=maxyue(c,d);
			    if(h==1)
				{
					f="("+a+"/"+b+")";
				}
				else 
				{
					a=a/h;
					b=b/h;
					f="("+a+"/"+b+")";
				}
				
				 if(k==1)
				{
					g="("+c+"/"+b+")";
					
				}
				else
				{
					c=c/k;
					d=d/k;
					g="("+c+"/"+d+")";
				}
				a1[i]=f;
				a2[i]=g;
				for(int j=0;j<i;j++)
				{
					if(a1[j].equals(f)&&a2[j].equals(g))
					{
						m=1;
						a1[i]="";
						a2[i]="";
						break;
					}
				}
				if(m==0)
				{
					if(e==0)
					{
						l="+";
					}
					else if(e==1)
					{
						l="-";
					}
					else if(e==2)
					{
						l="*";
					}
					else 
					{
						l="/";
					}
					
					System.out.println("第"+(i+1)+"个题"+":"+f+l+g+"=");
					i++;
				}
				
			}
		}
	}
	static int[] simpleys(int num)
	{
		Scanner sc=new Scanner(System.in);
		int []cc1=new int [num+1];
		int []cc2=new int[num+1];
		int []cc3=new int[2];
		int i=0;//控制打印个数
		int m=0;//判断是否打印出来
		int rs;//输入结果
		int t1=0;//记录正确的题数
		int f1=0;//记录错误的题数
		while(i<num)
		{
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int c=(int)(Math.random()*4);
			String d="";
			int t=0;
			if(a<b)
			{
				t=a;
				a=b;
				b=t;
			}
				cc1[i]=a;
				cc2[i]=b;
				for(int j=0;j<i;j++)
				{
					if(cc1[j]==a&&cc2[j]==b)
					{
						m=1;
						break;
					}
				}
				if(c==0)
				{
					d="+";
				}
				else if(c==1)
				{
					d="-";
				}
				else if(c==2)
				{
					d="*";
				}
				else 
				{
					m=0;
					if(b==0||a % b!=0||a<b)
					{
						m=1;
					}
					d="/";
				}
				
			
			if(m==0)
			{
				
				System.out.println("请作答第"+(i+1)+"个题"+":"+a+d+b+"=");
				i++;
				System.out.println("请输入你的答案：");
				rs=sc.nextInt();
				if(rs==yunsuan1(c,a,b))
				{
					System.out.println("恭喜你，回答正确，你真棒！");
					t1++;
				}
				else
				{
					f1++;
					System.out.println("哦哦，回答错了哦,正确结果是："+yunsuan1(c,a,b));
				}
			}
		}
		System.out.println("你刚刚做了"+(i)+"个题,"+"其中共做对了"+t1+"道题,"+"做错了"+f1+"个题");
		cc3[0]=t1;
		cc3[1]=f1;
		return cc3;
	}
	static int yunsuan1(int c,int a,int b)
	{
		int x;
		if(c==0)
		{
			x=a+b;
		}
		else if(c==1)
		{
			x=a-b;
		}
		else if(c==2)
		{
			x=a*b;
		}
		else
		{
			x=a/b;
		}
		return x;
	}
	static int maxyue(int y,int x)//最大公约数
	{
		int r=y;
		while(r!=0)
		{
			r=x%y;
			x=y;
			y=r;
		}
		return x;
	}
}
