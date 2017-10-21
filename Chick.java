class Chick implements Animal {     
  private String myType;     
  private String mySound;
  private String myShySound;
  public Chick(String type, String sound, String shySound) {         
    myType = type;         
    mySound = sound;
    myShySound = shySound;
  }     
  public Chick() {         
    myType = "unknown";         
    mySound = "unknown";
  }      
  public String getSound() {
    if (Math.random()<.5)
      return mySound;
    else
      return myShySound;
  }     
  public String getType() {
    return myType;
  }
}
