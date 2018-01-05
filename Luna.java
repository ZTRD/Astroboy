package Main;
import java.time.*;
//import another library for user input

public class Luna {
  
	public Luna(){
  }
  
  public String getTime(LocalTime obj){
  	return "The time is currently "+obj.getHour()+":"+obj.getMinute()+":"+obj.getSecond();
  }
  //(obj.getHour()<10) ? "0"+obj.getHour() : obj.getHour() <- Ternary Operator
  
  /* 
  public String LessThan(int time)
 	{
  	return (time<10) ? "0"+time : time;
  	}
  */
	
  // return "The time is currently "+LessThan(obj.getHour())+":"+LessThan(obj.getMinute())+":"+LessThan(obj.getSecond());
  
	public static void main (String[] args){
		Luna Unus = new Luna();
    LocalTime localTime = LocalTime.now();
    // User Input
    // if USER INPUT = I want time; Then Display + witty response
		System.out.println(Unus.getTime(localTime));
	}

}
