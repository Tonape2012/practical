package Lab;

public class Constructorstu 
{
	String Name;
	String Course;
	int age;
	public Constructorstu(String Name,String Course,int age) 
	{
		this.Name = Name;
		this.Course =Course;
		this.age = age;
	}
	public String getName()
	{
		return Name;
	}public String getCourse() 

    { 
       return Course; 
       } 
         public int getage() 

    { 

        return age; 

    } 
public static void main(String[] args) 

    { 
	Constructorstu c1 = new Constructorstu ("Aboli","CSE", 21); 

  

      System.out.println("The Studen name is "+ c1.getName()); 

      System.out.println("The Studen course is "+ c1.getCourse()); 

      System.out.println("Its studen age is"+ c1.getage()); 
    }
}

      

        

     

		
	
	
	
		
	