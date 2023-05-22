package hellopackage;

public class HelloWorldDriver{

static HelloWorldSuccess hws= new HelloWorldSuccess();

static HelloWorldFailure  hwf= new HelloWorldFailure();

public static void main(String args[]){

hws.printHello();

try{
hwf.printHello();
}catch(Exception e){
	System.out.println("Inside main method HelloWorldDriver calling printHello HelloWorldSuccess thrown exception!");
}

}


public void printHelloWorldSuccess() {

System.out.println("Inside method printHello of HelloWorldSuccess!");

return "HelloWorldSuccess";
}


public void printHelloWorldFailure() throws Exception{

throw new Exception("Failure in method printHello of HelloWorlFailure class");

}


}