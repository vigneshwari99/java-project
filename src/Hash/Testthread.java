package Hash;


class Base 
{ 

public Base() 
{ 

System.out.print("Base"); 

} 


} 

public class Testthread extends Base 
{ 

public Testthread() 
{ 

System.out.print("Derived"); 

} 

public static void main(String[] args) 
{ 

new Testthread(); 

} 

}
 

