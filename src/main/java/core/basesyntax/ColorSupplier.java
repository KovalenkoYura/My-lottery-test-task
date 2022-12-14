package core.basesyntax;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ColorSupplier {
  public String getRandomColor() {
    Random random = new Random();
    List<Colors> colors = Arrays.asList(Colors.values());
    return colors.get(random.nextInt(colors.size())).name();
  }
}
