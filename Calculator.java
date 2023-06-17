
public class calculator{
	int result=0;
	
	public void main(String args[]){
		
	}
	public int calc(String operation, int num1, int num2){
	
		switch(operation){
			case "addition":
				result = num1+num2;
			case "subtraction":
				result = num1-num2;
			case "multiplication":
				result = num1*num2;
			case "devision":
				result = num1/num2;
		}
	return result;	
	}
}