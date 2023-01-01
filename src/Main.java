import java.util.Scanner;

public class Main {
	@SuppressWarnings("null")
	public static void main(String[] args){
		Players p1=new Players();
		Players p2=new Players();
		String[] dish1 = {"","",""};
		String[] dish2 = {"","",""};
		Scanner sc= new Scanner(System.in);
		//Setup for Player 1
		System.out.println("Enter P1 Name");
		String n=sc.nextLine();
		p1.setName(n);
		System.out.println("Enter P1 Starting POS from 1-3");
		int s=sc.nextInt();
		if(s==1)
		{
			dish1[0]= "#__";
			dish1[1]= "_#_";
			dish1[2]= "_#_";
		}
		else if(s==2)
		{
			dish1[0]= "_#_";
			dish1[1]= "_#_";
			dish1[2]= "_#_";
		}
		else if(s==3)
		{
			dish1[0]= "__#";
			dish1[1]= "_#_";
			dish1[2]= "_#_";
		}
		else
		{
			System.out.println("Invalid Position");
		}
		System.out.println("Enter P1 Num of Iterations");
		int gens=sc.nextInt();
		
		//Setup for Player 2
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter P2 Name");
		n=sc2.nextLine();
		p2.setName(n);

		System.out.println("Enter P2 Starting POS from 1-3");
		 s=sc2.nextInt();
		if(s==1)
		{
			dish2[0]= "#__";
			dish2[1]= "_#_";
			dish2[2]= "_#_";
		}
		else if(s==2)
		{
			dish2[0]= "_#_";
			dish2[1]= "_#_";
			dish2[2]= "_#_";
		}
		else if(s==3)
		{
			dish2[0]= "__#";
			dish2[1]= "_#_";
			dish2[2]= "_#_";
		}
		else
		{
			System.out.println("Invalid Position");
		}
		System.out.println("Enter P2 Num of Iterations");
	   int gens2=sc2.nextInt();
		
		//Game for Player 1
		System.out.println("P1 Iterations");
		for(int i= 0;i < gens;i++){
			System.out.println("Generation " + i + ":");
			p1.getObj().print(dish1);
			dish1= p1.getObj().life(dish1);
					
	}
		//Game for Player 2
		System.out.println("P2 Iterations");
		for(int i= 0;i < gens2;i++){
			System.out.println("Generation " + i + ":");
			p1.getObj().print(dish2);
			dish2= p1.getObj().life(dish2);
	}
		sc.close();
}
}