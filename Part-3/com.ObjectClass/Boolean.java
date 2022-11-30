public class Boolean 
{
    public static void main(String[] args) 
    {

		Boolean b =new Boolean();
        Boolean b1 =new Boolean();
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
        System.out.println(b.equals(b1));
		System.out.println("*********************");
        Boolean b2 =new Boolean();
        Boolean b3 = b2;
		System.out.println(b2.hashCode());
		System.out.println(b2.hashCode());
        System.out.println(b2.equals(b3));

	}    
}
