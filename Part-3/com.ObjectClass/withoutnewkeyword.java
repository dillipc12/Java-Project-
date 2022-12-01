public class withoutnewkeyword 
{
    public static void main(String[] args) 
    {
        String s = "java" ;
        String s1 = "java";
        System.out.println(s.toString());
        System.out.println(s1.toString());
        
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s.equals(s1));
        System.out.println("*****************");
        String s2="java developer";
        String s3="sql developer";
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s2.equals(s3));
    }    
}
