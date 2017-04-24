public class jogi{
	String nimetus;
	double pikkus;
	double vooluhulk;
	String sihtjogi;

	
	
	public jogi(String nimetus, double pikkus, double vooluhulk, String sihtjogi){
				if(nimetus==null || nimetus.length()==0){
			throw new RuntimeException("Nimetus puudub");
		}
		this.nimetus=nimetus;
		this.sihtjogi=sihtjogi;
		this.pikkus=pikkus;
		this.vooluhulk=vooluhulk;
		
	}
	
	public static void main(String[] arg){
		jogi j1=new jogi("Kasari", 113, 25, "Kasari");
		jogi j2=new jogi("Vigala", 95, 25, "Kasari");
		jogi j3=new jogi("Velise", 74, 25, "Vigala");
		jogi j4=new jogi("Velise", 74, 25, "Velisett");	
		
		
		if (j4.sihtjogi == j3.nimetus){
			System.out.println(j4.nimetus+" -> "+j3.nimetus);
		}if(j3.sihtjogi == j2.nimetus){
			System.out.println(j3.nimetus+" -> "+j2.nimetus);
		}if(j2.sihtjogi == j1.nimetus){
			System.out.println(j2.nimetus+" -> "+j1.nimetus);
			
		}if(j1.sihtjogi == j1.nimetus){
			System.out.println(j1.nimetus+" -> Meri "); 
		
		}
/* 		if (j3.sihtjogi == j2.nimetus && j2.sihtjogi == j1.nimetus && j1.sihtjogi == j1.nimetus){
			System.out.println(j3.nimetus+" -> "+j2.nimetus+" -> "+j1.nimetus+" -> meri");
		} */
		
	}
	
}