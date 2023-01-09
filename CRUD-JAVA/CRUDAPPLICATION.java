

                                 //CRUD-APPLICATION

import java.util.*;
class Student
{
	private String fname;
	private String lname;
	private int rollno;
	
	      //constructor for asigning value
	Student(String fname, String lname,int rollno)
	{
      this.fname=fname;
      this.lname=lname;
      this.rollno=rollno;
    }
  public String fname()
  {
	  return fname;
  }
  public String lname()
  {
	  return lname;
  }
  public int rollno()
  {
	  return rollno;
  }
  public String toString()
  {
	  return fname+" "+lname+" "+rollno;
  }
  
}

			class CRUDAPPLICATION
			{
				public static void main(String args[])
				{
					List<Student> s=new ArrayList<Student>();
					Scanner sc=new Scanner(System.in); // THIS SCANNERIS FOR 1st STRING
					Scanner sc1=new Scanner(System.in); // THIS SCANNERIS FOR 2nd STRING
					Scanner sc2=new Scanner(System.in); // THIS SCANNER IS FOR INTEGER
					int ch;
					do{
						System.out.println("IF YOU WANT TO INSERT  ::: ENTER-1");
						System.out.println("IF YOU WANT TO DISPLAY ::: ENTER-2");
						System.out.println("IF YOU WANT TO DELETE  ::: ENTER-3");
						System.out.println("IF YOU WANT TO UPDATE  ::: ENTER-4");
						System.out.println("IF YOU WANT TO STOP    ::: ENTER-0");
						System.out.print("ENTER YOUR CHOICE !!! < -- > =");
						
						ch=sc2.nextInt();
						
						switch(ch)
						{                
													//INSERT RECORD
							case 1:
							
							System.out.print("Enter Your Firstname : ");
							   String fname=sc.next();
							System.out.print("Enter your Lastname  : ");
							   String lname=sc1.next();
							System.out.print("Enter your Roll Number : ");
							   int rollno=sc2.nextInt();
							  System.out.println("----------------------------------------");
							  System.out.println("RECORD ADDED SUCCESSFULLY");
							  System.out.println("----------------------------------------");
							s.add(new Student(fname,lname,rollno));
							  
							//--------------------------------------------------------------------
							break;
							 //--------------------------------------------------------------------
													 //DISPLAY RECORD
							 //--------------------------------------------------------------------						 
							case 2:
							System.out.println("----------------------------------------");
							Iterator<Student> i=s.iterator();
							while(i.hasNext())
							{
								Student s1=i.next();
								System.out.println(s1);
							}             
							System.out.println("----------------------------------------");
							break;
							
							 //--------------------------------------------------------------------
										   //DELETE THE DATA
							 //--------------------------------------------------------------------			   
							case 3:
							 boolean found=false;
							 System.out.println("ENTER ROLL NUMBER TO DELETE");
							 int rollno2=sc2.nextInt();
							 System.out.println("----------------------------------------");
							 i=s.iterator();
							 while(i.hasNext())
							 {
								 Student s1=i.next();
								 if(s1./*get*/rollno()== rollno2)
								 {
									 i.remove();
								 found=true;
								 }
							 }
							 if(!found)
								 System.out.println("RECORD IS NOT FOUND ");
							 else
								 System.out.println("DELETED SUCCESSFULLY");
							  System.out.println("----------------------------------------");
							 break;
							 
											   // UPDATE RECORD
							case 4:
							 found=false;
							 System.out.println("ENTER ROLL NUMBER TO UPDATE");
							  int rollno1=sc2.nextInt();
							 System.out.println("----------------------------------------");
							 ListIterator<Student> li= s.listIterator();
							 
							 while(li.hasNext())
							 {
								 Student s2=li.next();
								 if(s2.rollno()== rollno1)
								 {
									System.out.print("ENTER NEW FISRT NAME : ");
									  fname=sc.next();
									System.out.print("ENTER NEW LAST NAME : ");
									  lname=sc1.next();
									System.out.print("ENTER NEW ROLL NUMBER : ");
									rollno=sc2.nextInt();
									 System.out.println("----------------------------------------");
									li.set(new Student(fname,lname,rollno));
								 found=true;
								 }
							 }
							 if(!found)
								 System.out.println("RECORD IS NOT FOUND ");
							 else
								 System.out.println("UPDATED SUCCESSFULLY");
							  System.out.println("----------------------------------------");
							 break;
						   
						}
					}
					   while(ch!=0);
				}
			}		