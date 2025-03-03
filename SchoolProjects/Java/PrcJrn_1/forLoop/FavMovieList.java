public class FavMovieList {
     
     public static void main(String[] args) {
          String animes[] = {"Azumanga Diaoh", "SpyxFamily", "AOT", "Kaiju no.8"};
          
          System.out.println("Favorite Animes : ");
          
          for(String anime : animes) {
               System.out.println("- " + anime);
          }
     }
}