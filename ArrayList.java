// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<String> Favorite = new ArrayList<>();
    Favorite.add("The Scientist");
    Favorite.add("Exile");
    Favorite.add("Override");
    Favorite.add("Video Games");
    Favorite.add("Yellow");
    Favorite.add("Atomic Habits");
    Favorite.add("The Four Agreement");
    Favorite.add("What I Know For Sure ");
    Favorite.add("Empty Bottles");
    Favorite.add("CODA");
    Favorite.add("The Fault in Our Stars");
    Favorite.add("Howl's Moving Castle ");

    Favorite.remove(2);

    for (String fav : Favorite) {
      System.out.println(fav);
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}