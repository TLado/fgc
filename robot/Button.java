class Button {
    private String modelID;
    private boolean modelPressed;
    public Button(String ID, boolean pressed) {
      modelID = ID;
      modelPressed = pressed;
    } 

    public String getID() {
      return modelID;
    }
    public void setState(boolean pressed) {
      modelPressed = pressed;
    }
    public boolean getState() {
      return modelPressed;
    }
}