


package wordgame.model;

public class SecretWord {
    private String word;
    StringBuilder word_onterminal = new StringBuilder();
    public SecretWord(String secret){
        this.word = secret;
    }

    public String word_withEmptySpaces(){
        String display = "";
        for (int i=0; i<this.word.length();i++){
            word_onterminal.append('_');
            display= word_onterminal.toString();
        }
        System.out.print("Enter your guess for ");
        System.out.println(display);
        return display;
    }

    public String word_withChar(String withChar){
        String temp = withChar;
        System.out.print("Enter your guess for ");
        System.out.println(temp);
        return temp;
    }

    public boolean isFull(StringBuilder word)
   {
      for (int i = 0; i < word.length(); i++)
      {
         String check_empty = word.toString();
            if (check_empty.contains("_"))
            {
               return false;
            }
      }
      return true;
   }

    public String getSecretWord(){        
        return this.word;
    }
}

