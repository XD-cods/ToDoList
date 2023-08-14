
import toDoList.ToDoList;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ToDoList list = new ToDoList();
    Scanner console = new Scanner(System.in);
    while (true) {
      System.out.println("---------------------------------------------------");
      list.printList();
      System.out.println("---------------------------------------------------\n");
      menu();
      System.out.println("Выберите пункт меню");
      switch (console.nextInt()) {
        case 1:
          list.addToList(console.nextLine());
          break;
        case 2:
          System.out.println("Какой элемент удалить?");
          list.deleteFromList(console.nextInt());
          break;
      }
    }
  }

  public static void menu() {
    System.out.println("1. Добавить в список\n2. Удалить из списка");
  }

}
