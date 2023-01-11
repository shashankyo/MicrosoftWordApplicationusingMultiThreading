package microsoftapplication;

import java.util.Scanner;

public class MicrosoftWord  extends Thread{
public void run()
{
	try
	{
		if(getName().equals("TYPE"))
		{
			typing();
		}
	else if(getName().equals("SPELL"))
	{
		spellCheck();
	
	}
	else {
		autoSave();
	}
	}
catch(Exception e)
{
	e.printStackTrace();
}
}

void typing()
{
	try
	{
		System.out.println("Typing started");
		Scanner scan = new Scanner(System.in);
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(i);
			System.out.println("Typing in  Progress");
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		System.out.println("typing over");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void spellCheck()
{
	try
	{
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(i);
			System.out.println("checking spelling");
			Thread.sleep(3000);
		}
		System.out.println("spell checking over");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

void autoSave()
{
	try
	{
		System.out.println("auto saving the data");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			System.out.println("autosaving the datas");
			Thread.sleep(3000);
		}
		System.out.println("saving over");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
}
}