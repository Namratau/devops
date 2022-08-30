Class X
{
public void methodX()
{
System.out.println("Class X method");
}
}
Class Y extends X 
{
public void methodY()
{
System.out.println("class Y method");
}
}
Class Z extends Y
{
public void methodZ()
{
System.out.println("class Z method");
}

public static void main(String[] args) 
{
Z obj = new Z();
obj.methodX();
obj.methodY();
obj.methodZ();
}
}
