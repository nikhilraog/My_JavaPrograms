public class HelloWorld{
    
    
     public static void run(String r){
        char[] s = r.toCharArray();
        int n = s.length;
         boolean b = false;
    char x = s[0];
    for(int i = 1; i<n; i++)
    {
    if(x == s[i])
		if(b==false)
		{
			System.out.printf("%5d",i-1);
			b = true;		
		}
		else
			continue;
	else
	{
		x = s[i];
		b = false;
	}
    }
         
     }
     public static void main(String []args){
         
        String s = "011100111" ;
        run(s);
        //System.out.println("Hello World");
     }
}
