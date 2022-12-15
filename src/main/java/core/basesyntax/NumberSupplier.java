package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
  public int getRandomNumber() {
    Random random = new Random();
    return random.nextInt(100);
  }
}
