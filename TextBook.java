public class TextBook extends Book
{
private String subject;



public TextBook (int numPages_in, String title_in, String subject_in)
{
 super(numPages_in, title_in);
 subject = subject_in;
 


}

public boolean hasSamePages(Object o)
   {
      if (o instanceof TextBook)
      {
         return true;
      }
      else 
      {
      
         Book nextBook = (Book) o;
         
         //criteria for if they have qual attributes 
         if (nextBook.getPages() == this.getPages() )         {
            return true;
         }
         
      }
      return false;
   }
   
   public String toString()
   {
   
   String toReturn = "";
   toReturn = subject + ": " + this.getTitle() + " with " +this.getPages() + " pages";
   return toReturn;
   
   }
}