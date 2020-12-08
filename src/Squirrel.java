package src;

public class Squirrel {

  String Name;
  String Colors;
  String Jump;
  String Type;
  boolean DeadOrAlive;
  boolean DoAFlip;

  public Squirrel (String newType, boolean DoA, String newColor) {

    this.Type = newType;
    this.DeadOrAlive = DoA;
    this.Colors = newColor;

  }

  public void Jump() {
    System.out.print("Yes, it can jump");
  }

  public void DoAFlip() {
    System.out.print("Yes it did a flip");
  }

}