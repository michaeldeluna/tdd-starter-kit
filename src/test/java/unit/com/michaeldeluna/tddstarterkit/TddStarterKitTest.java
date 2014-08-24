package unit.com.michaeldeluna.tddstarterkit;

import com.michaeldeluna.tddstarterkit.TddStarterKit;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItems;

public class TddStarterKitTest {

    private final TddStarterKit tddStarterKit = new TddStarterKit();

    @Test public void demonstratesHowToUseHamcrestContains() {
        assertThat(
                tddStarterKit.split("The quick brown fox jumps over the lazy dog"),
                contains("The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"));
    }

    @Test public void demonstratesHowToUseHamcrestHasItems() {
        assertThat(
                tddStarterKit.split("The quick brown fox jumps over the lazy dog"),
                hasItems("brown", "jumps", "fox", "over", "quick"));
    }
}
