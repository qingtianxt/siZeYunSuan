package Demo;

import java.util.Scanner;

public class size {
	public static void main(String[]args)
	{
		String ch="y";//�Ƿ��˳�ѭ��
		int choose=0;//�ж��Ƿ���������
		int []cc1=new int [2];//��¼��ȷ�ʹ��������
		int []cc2=new int [2];//����������ȷ�ʹ��������
		int yn=0;//����һ��whileѭ��ʱ��ֻ�õ�һ��ѯ���Ƿ���������
		Scanner scan=new Scanner(System.in);
		while(ch=="y")
		{
			if(yn==0)
			{
				yn++;
				System.out.println("��ѧ���������1.ѧ����2ûѧ��");
				choose=scan.nextInt();
			}
			else{
				if(choose==1)
				{
					System.out.println("��������������");
					int num=scan.nextInt();
					fuza(num);
					System.out.println("�ð����Ǽ���Ŭ����������Ϣһ��,��ѡ��1.������2��Ϣһ��");
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
					
					System.out.println("��������������");
					int num=scan.nextInt();
					cc2=simpleys(num);
					cc1[0]+=cc2[0];
					cc1[1]+=cc2[1];
					System.out.println("�ð����Ǽ���Ŭ����������Ϣһ��,��ѡ��1.������2��Ϣһ��");
					{
						int rl=scan.nextInt();
						if(rl==2)
						{
							ch="z";
							System.out.println("��һ������"+(cc1[0]+cc1[1])+"����,"+"���й������"+cc1[0]+"����,"+"�����"+cc1[1]+"����.");
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
		int m=0;//�ж��Ƿ��ӡ����
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
					
					System.out.println("��"+(i+1)+"����"+":"+f+l+g+"=");
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
		int i=0;//���ƴ�ӡ����
		int m=0;//�ж��Ƿ��ӡ����
		int rs;//������
		int t1=0;//��¼��ȷ������
		int f1=0;//��¼���������
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
				
				System.out.println("�������"+(i+1)+"����"+":"+a+d+b+"=");
				i++;
				System.out.println("��������Ĵ𰸣�");
				rs=sc.nextInt();
				if(rs==yunsuan1(c,a,b))
				{
					System.out.println("��ϲ�㣬�ش���ȷ���������");
					t1++;
				}
				else
				{
					f1++;
					System.out.println("ŶŶ���ش����Ŷ,��ȷ����ǣ�"+yunsuan1(c,a,b));
				}
			}
		}
		System.out.println("��ո�����"+(i)+"����,"+"���й�������"+t1+"����,"+"������"+f1+"����");
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
	static int maxyue(int y,int x)//���Լ��
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
