public class HelloWorldFailure{


public static void main(String args[]){
}

public void printHello() throws Exception{

throw new Exception("Failure in method printHello of HelloWorlFailure class");
//System.out.println("Inside method printHello of HelloWorldSuccess!");

//return "HelloWorldSuccess";
}

}