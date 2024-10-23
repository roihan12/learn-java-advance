package roihan.sori.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("Roihan");
        mutable.add("Sori");

        List<String> immuttable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Test", "test2");
        elements.add("Budi");

    }
}
