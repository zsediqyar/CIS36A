class Swapper {
    int x;
    int y;

    Swapper(int x, int y) {
      this.x = x;
      this.y = y;
    }

    int getX() { return x; }
    int getY() { return y; }

    void swap(int x, int y) {
      int temp = x;
      x = y;
      y = temp;
      System.out.println("X is now: " + x + "\nY is now: " + y);
    }
  }