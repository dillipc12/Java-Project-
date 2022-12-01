public class withoutnewkeyword1 
{
    public static void main(String[] args) 
    {
        String s= "java";
        String s1= "java";
        String s2= "sql";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
        System.out.println(s1==s2);
        System.out.println(s.equals(s2));
            
    }    
}
