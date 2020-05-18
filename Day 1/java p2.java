package MainClass;
import MainClass.sharedPrinter;
class OddThread extends Thread
{
	int limit;
	sharedPrinter printer;
	public OddThread(int limit, sharedPrinter printer)
	{
			this.limit = limit;
			this.printer = printer;
	}
@Override
	public void run() 
	{
		int oddNumber = 1;        //First odd number is 1
		while (oddNumber <= limit)
		{
			printer.printOdd(oddNumber);       //Calling printOdd() method of SharedPrinter class
			oddNumber = oddNumber + 2;         //Incrementing to next odd number
		}
	}
}
package MainClass;
import MainClass.sharedPrinter;
class EvenThread extends Thread
{
int limit;
sharedPrinter printer;
public EvenThread(int limit, sharedPrinter printer)
{
this.limit = limit;
this.printer = printer;
}
@Override
public void run() 
{
int evenNumber = 2;           //First even number is 2
while (evenNumber <= limit)
{
printer.printEven(evenNumber);          //Calling printEven() method of SharedPrinter class
evenNumber = evenNumber + 2;           //Incrementing to next even number
}
}
}
package MainClass;
class sharedPrinter
{
boolean isOddPrinted = false;
synchronized void printOdd(int number)
{
while (isOddPrinted)
{
try
{
wait();
} 
catch (InterruptedException e)
{
e.printStackTrace();
}
}
System.out.println(Thread.currentThread().getName()+" : "+number);
isOddPrinted = true;
try
{
Thread.sleep(1000);
} 
catch (InterruptedException e) 
{
e.printStackTrace();
}
notify();
}
synchronized void printEven(int number)
{
while (! isOddPrinted)
{
try
{
wait();
}
catch (InterruptedException e) 
{
e.printStackTrace();
}
}
System.out.println(Thread.currentThread().getName()+" : "+number);
isOddPrinted = false;
try
{
Thread.sleep(1000);
} 
catch (InterruptedException e) 
{
e.printStackTrace();
}
notify();
}
}
package MainClass;
public class mainclass 
{
public static void main(String[] args) 
{
sharedPrinter printer = new sharedPrinter();
OddThread oddThread = new OddThread(20, printer);
oddThread.setName("ping-->");
EvenThread evenThread = new EvenThread(20, printer);
evenThread.setName("pong-->");
oddThread.start();
evenThread.start();
}
}




Output:
—-pong 1
ping — > 2
—-pong 3
ping — > 4
—-pong 5
ping — > 6
—-pong 7
ping — > 8
—-pong 9
ping — > 10
—-pong 11
ping — > 12
—-pong 13
ping — > 14
—-pong 15
ping — > 16
—-pong 17
ping — > 18
—-pong 19
ping — > 20