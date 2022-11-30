public class hashCodeOverride 
{
    static int num=5678987;
    public static void main(String[] args) 
    {
        
       
            hashCodeOverride h = new hashCodeOverride();
            System.out.println(h.hashCode());
            hashCodeOverride h1= new hashCodeOverride();
            System.out.println(h1.hashCode());
    }
        public int hashCode()
        {
            return num++;
        }    
}    

