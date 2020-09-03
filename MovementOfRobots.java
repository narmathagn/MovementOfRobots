import java.util.*;
public class MovementOfRobots{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=3;
		int b=3;
		String c="2-2-E";
		String d="R M L M L M";
		String res=moveRobot(a,b,c,d);
		System.out.println(res);
	}
	public static String moveRobot(int a1,int b1,String c1,String d1){
		String str[]=c1.split("-");
		String st[]=d1.split(" ");
		int i,flag=0;
		String ans="";
		for(i=0;i<st.length;i++)
		{
			if(st[i].equals("R"))
			{
				if(str[2].equals("N"))
				{
					str[2]="E";
				}
				else if(str[2].equals("E"))
				{
					str[2]="S";
				}
				else if(str[2].equals("S"))
				{
					str[2]="W";
				}
				else if(str[2].equals("W"))
				{
					str[2]="N";
				}
			}
			else if(st[i].equals("L"))
			{
				if(str[2].equals("N"))
				{
					str[2]="W";
				}
				else if(str[2].equals("E"))
				{
					str[2]="N";
				}
				else if(str[2].equals("S"))
				{
					str[2]="E";
				}
				else if(str[2].equals("W"))
				{
					str[2]="S";
				}
			}
			else if(st[i].equals("M"))
			{
				if(str[2].equals("N"))
				{
					int k=Integer.parseInt(str[1]);
					if(k<b1)
					{
						k++;
						str[1]=Integer.toString(k);
					}
					else
					{
						flag=1;
						break;
					}
				}
				else if(str[2].equals("E"))
				{
					int k=Integer.parseInt(str[0]);
					if(k<a1)
					{
						k++;
						str[0]=Integer.toString(k);
					}
					else
					{
						flag=1;
						break;
					}
				}
				else if(str[2].equals("S"))
				{
					int k=Integer.parseInt(str[1]);
					if(k>0)
					{
						k--;
						str[1]=Integer.toString(k);
					}
					else
					{
						flag=1;
						break;
					}
				}
				else if(str[2].equals("W"))
				{
					int k=Integer.parseInt(str[0]);
					if(k>0)
					{
						k--;
						str[0]=Integer.toString(k);
					}
					else
					{
						flag=1;
						break;
					}
				}
			}
		}
		ans=ans+str[0];
		for(i=1;i<3;i++)
		{
			ans=ans+"-"+str[i];
		}
		if(flag==1)
		{
			ans=ans+"-ER";
		}
		return ans;
	}
}