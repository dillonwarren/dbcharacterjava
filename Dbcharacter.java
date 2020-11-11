import java.util.Random;
import java.util.Scanner;
class Dbcharacter {
    private String name;
    private int strength;
	private int ki;
	
	
	
	



    public Dbcharacter(String name, int strength, int ki){
        this.name = name;
        this.strength = strength;
        this.ki = ki;
    }
    
    
    public void getStats(){
        System.out.println(this.name + " has a strength of  " + this.strength + " and has a ki level of " + this.ki);
    }
    
   
   
   
    






    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getKi() {
		return ki;
	}
	public void setKi(int ki) {
		this.ki = ki;
	}

	public static void main(String[] args)  {
		
		
    	
		Random rand = new Random();

	    Dbcharacter buu = new Dbcharacter("Majin buu", rand.nextInt(10),rand.nextInt(10));
	    Dbcharacter vegeta = new Dbcharacter("Vegeta", rand.nextInt(10),rand.nextInt(10));
	    Dbcharacter piccolo = new Dbcharacter("Piccolo", rand.nextInt(10),rand.nextInt(10));
      
        System.out.println("who is your first pick?)");
        System.out.println("buu, piccolo,or vegeta?");
        
        
        
    	Scanner sc = new Scanner(System.in); 
		String firstFighter = sc.next();
		System.out.println("who is your Second pick?");
		System.out.println("buu, piccolo,or vegeta?");
        
		
		String secondFighter = sc.next();
		System.out.println("your first fighter is " + firstFighter);
		System.out.println(secondFighter);
		System.out.println("your second fighter is " + secondFighter);
		sc.close();
		int str1 = 0;
		int str2 = 0;
		System.out.println(firstFighter);
		
		if (firstFighter.equals("buu") ) {
			str1 = buu.getStrength();
		}else if (firstFighter.equals("piccolo")) {
			str1 = piccolo.getStrength();
		}else if (firstFighter.equals("vegeta")) {
			str1 = vegeta.getStrength();
		}
		if (secondFighter.equals("buu") ) {
			str2 = buu.getStrength();
		}else if (secondFighter.equals("piccolo")) {
			str2 = piccolo.getStrength();
		}else if (secondFighter.equals("vegeta")) {
			str2 = vegeta.getStrength();
		}
		
		System.out.println(firstFighter + " has a strength of " + str1);
		System.out.println(secondFighter + " has a strength of " + str2);
		
		if (str1 > str2) {
			System.out.println(firstFighter + " wins the fight");
		}else if (str2 > str1) {
			System.out.println(secondFighter + " wins the fight");
		}else {
			System.out.println("the fight is a draw");
		}
		buu.getStats();
		
		
    	
    	
		



    }
}
