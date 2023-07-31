import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testOriginalStatus() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindAll_1() {
        FilmManager manager = new FilmManager();

        manager.add("Movie I");

        String[] expected = {"Movie I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindAll_3() {
        FilmManager manager = new FilmManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] expected = {"Movie I", "Movie II", "Movie III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast_3() {
        FilmManager manager = new FilmManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");

        String[] expected = {"Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast_5() {
        FilmManager manager = new FilmManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");

        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast_6() {
        FilmManager manager = new FilmManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");
        manager.add("Movie VI");

        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
