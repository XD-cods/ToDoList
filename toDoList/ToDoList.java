




package toDoList;

public class ToDoList {

  private String[] list = new String[0];

  public void addToList(String note) {
    String[] tempList = new String[list.length + 1];
    for (int i = 0; i < list.length; i++) {
      tempList[i] = list[i];
    }
    tempList[list.length] = note;
    list = tempList;
    tempList = null;
  }

  public void deleteFromList(int index) {
    index -= 1;
    int listLength = list.length;
    if (index < 0 || index >= listLength) {
      System.out.println("Error");
      return;
    }
    String[] tempList = new String[listLength - 1];
    for (int i = 0; i < tempList.length; i++) {
      if (i != index) {
        tempList[i] = list[i];
      } else {
        tempList[i] = list[i + 1];
      }
    }
    list = tempList;
  }

  public void printList() {
    for (int i = 0; i < list.length; i++) {
      System.out.println(i + 1 + ". " + list[i]);
    }
  }
}
