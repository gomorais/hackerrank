package challenge30Days12;

public class Grade extends Student{
	private int score;

	public Grade(String fname, String lname, int p, int score) {
		super(fname, lname, p);
		this.score = score;
		// TODO Auto-generated constructor stub
	}
	
	public char calculate(){
		if (this.score<40){
			return 'D';
		}else if(40 <= this.score && this.score < 60){
			return 'B';
		}else if( 60 <= this.score && this.score < 75){
			return 'A';
		}else if( 75<= this.score && this.score <90){
			return 'E';
			
		}else if(90<= this.score && this.score <= 100) {
			return 'O';
		}else 
			return 'X';
			
	}
	
	

}
