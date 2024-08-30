public class Str2 {

    public static void main(String[] args) {
         
          String str = "This is a string";

           String []s =  str.split(" ");
        

           for(int i=0; i<s.length; i++)
           {
             if(s[i].equalsIgnoreCase("string"))
             {
                    s[i] = "java";
             }
                 
           }

            String newstring = new String();

            for(int i=0; i<s.length; i++)
            {
                  newstring += s[i]+" ";
            }

            System.out.println(newstring);
                    
    }

    
}

