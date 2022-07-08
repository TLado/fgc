public class RobotController {
  public static void main(String[] args) {
    Controller ctrl = new Controller();

    Button button1 = new Button("A", true);
    Button button2 = new Button("B", false);
    Button button3 = new Button("X", false);
    Button button4 = new Button("Y", true);

    ctrl.addButton(button1);
    ctrl.addButton(button2);
    ctrl.addButton(button3);
    ctrl.addButton(button4);

    System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
    ctrl.pressAll();
    System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
    ctrl.releaseAll();
    System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
  }
}