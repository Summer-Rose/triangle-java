public class Triangle {
  private int mSideOne;
  private int mSideTwo;
  private int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public int getSideOne() {
    return mSideOne;
  }

  public int getSideTwo() {
    return mSideTwo;
  }

  public int getSideThree() {
    return mSideThree;
  }

  public boolean isNotATriangle() {
    return (mSideOne + mSideTwo <= mSideThree) || (mSideTwo + mSideThree <= mSideOne) || (mSideThree + mSideOne <= mSideTwo);
  }

  public boolean isEquilateral() {
    return (mSideOne == mSideTwo) && (mSideTwo == mSideThree);
  }

  public boolean isIsosceles() {
    return (mSideOne == mSideTwo) || (mSideOne == mSideThree) || (mSideTwo == mSideThree);
  }

  public boolean isScalene() {
    return (mSideOne != mSideTwo) && (mSideTwo != mSideThree) && (mSideOne != mSideThree);
  }
}
