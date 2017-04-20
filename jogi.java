public class jogi{
	String nimetus;
	String sihtjogi;

	public jogi(String nimetus, String sihtjogi){
				if(nimetus==null || nimetus.length()==0){
			throw new RuntimeException("Nimetus puudub");
		}
		this.nimetus=nimetus;
		this.sihtjogi=sihtjogi;
	}

	
}