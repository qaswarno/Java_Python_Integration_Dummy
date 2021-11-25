package integration;
import org.python.util.PythonInterpreter;

public class Call_Python {

	public static void main(String[] args) {
		PythonInterpreter interpreter = new PythonInterpreter();
	     interpreter.execfile(System.getProperty("user.dir")+"/Python_Code/Functions.py");
	     //interpreter.eval("repr(my_function())");
	   

	}

}
