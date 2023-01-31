public class Recursion {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example: 
        // String fullName = "elizer ponio jr";

        String fullName = "bianca louise rosales";
        System.out.println("ENTER NAME:");

        removeLetter(fullName);
    }

    static void removeLetter(String str) {  
 
        if (str.length()==0){
            return;
        }

    
        char vowel = str.charAt(0);
        if (vowel == 'a' | vowel == 'e' | vowel == 'i' | vowel == 'o' | vowel == 'u'| vowel == ' '){
            System.out.print(vowel);

        }

        removeLetter(str.substring(1)); 

        
    

         }   
        
        } 
//CONSONANT RESULT 

// Scanner sc =new Scanner(System.in);



     //   String str1,str2="";
       // int i;

        //System.out.println("ENTER NAME:\n");
        //str1=sc.nextLine(); 

        //for(i=0;i<str1.length();i++) {

           // if (str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U'||str1.charAt(i)=='a'||
            //str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u');
       //else 
       
       {

        //str2=str2+str1.charAt(i);

       }

        }
        //System.out.println(str2); 


        
    
