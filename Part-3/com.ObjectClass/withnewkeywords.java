public class withnewkeywords 
{
    public static void main(String[] args) 
    {
        String s = new String("java");    
        String s1 = new String("java"); 
        System.out.println(s.toString());
        System.out.println(s1.toString());

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }    
}
