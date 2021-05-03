public class Book 
{

   private int numPages;
   private String title;
   private int newPages;
   public Book(int numPages_in, String title_in)
   {
      numPages = numPages_in;
      title = title_in;
   
   
   }
   
   public String getTitle()
   {
   
   return title;
   
   }
   
   public int getPages()
   {
   return numPages;
   
   }
   
   public int morePages(int addedPages)
   {
   
  newPages =  1000 - (numPages +addedPages);
  return newPages;
   
   }
   
   public String toString()
   {
   
   String toReturn = "";
   
   toReturn = title + " with " +numPages+ " pages";
   return toReturn;
   }
   
  }