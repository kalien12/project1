package Lee.task.project1;


import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        /* 필기. [프로젝트1] [deadline = 12,Jul,2024]
            자바 컬렉션을 활용한 관리 프로그램 프로젝트를 압축하여 파일로 업로드 하세요.
            관리 프로그램에서 구현 되어야 하는 내용은 다음과 같습니다.
            1. Collection 자료구조 중 사용할 자료구조를 선택한다. (ArrayList, HashMap 등)
            2. 관리 데이터의 DTO 클래스를 만든다. (ProductDTO, MemberDTO, BookDTO 등)
            3. 콘솔 입출력을 통해 데이터를 컬렉션 자료구조에 저장할 수 있고, 저장 된 데이터를 조회,
            수정, 삭제 할 수 있는 관리 프로그램을 구현한다.
            */

        ProductManager productManager = new ProductManager();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Hello, welcome to the [Product Manage System]");
            System.out.println("_____________________________________________");

            System.out.println("press 1 : [Add] your product");
            System.out.println("press 2 : [Search] your product");
            System.out.println("press 3 : [Change] info of your product");
            System.out.println("press 4 : [Delete] info of your product");
            System.out.println("press 9 : Program terminates, See you again!");

            System.out.println("PRESS THE NUMBER PLEASE : ");

            int number = sc.nextInt();
            sc.nextLine();

            switch(number) {
                case 1:
                    System.out.println("[PRODUCT NAME] : ");
                    String name = sc.nextLine();
                    System.out.println("[BRAND] : ");
                    String brand = sc.nextLine();
                    System.out.println("[TAG] : ");
                    int tag = sc.nextInt();
                    System.out.println("[PRICE] : ");
                    int price = sc.nextInt();
                    productManager.addProduct(name, brand, tag, price);

                    break;

                case 2:
                    System.out.println("please input your [TAG] number to search: ");
                    tag = sc.nextInt();
                    productManager.searchProduct(tag);

                    break;

                case 3:
                    System.out.println("please input your [TAG] number to change information :");
                    tag = sc.nextInt();
                    name = sc.nextLine();
                    brand = sc.nextLine();
                    price = sc.nextInt();
                    productManager.changeProduct(tag, name, brand, price );

                    break;

                case 4:
                    System.out.println("input [tag] to delete : ");
                    tag = sc.nextInt();
                    productManager.deleteProduct(tag);

                    break;

                case 9:
                    System.out.println("[Program is being terminated]...");
                    sc.close();
                    return;

                default :
                    System.out.println("your input is wrong, :(");
                    System.out.println("Please input the right number :) //");


            }

        }





    }
}
