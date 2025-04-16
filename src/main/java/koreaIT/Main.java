package koreaIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Article> articleList = new ArrayList<>();

        System.out.println(" == 프로그램 시작 == ");

        int lastId = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("명령어) ");
            String cmd = sc.nextLine().trim();

            if(cmd.startsWith("article detail")){
                String[] cmdBits = cmd.split(" ");

                if(cmdBits.length > 3) {
                    System.out.println("명령어를 제대로 입력해주세요");
                }

                try{
                    int detailId = Integer.parseInt(cmdBits[2]);
                }catch (NumberFormatException e) {
                    System.out.println("정수를 제대로 입력해 주세요");
                }catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("정수를 추가해서 입력해주세요");
                }



            }

            else if (cmd.equals("article list")) {
                System.out.println("번호  /  제목  /  내용");
                for (int i = articleList.size()-1 ; i >= 0 ; i--) {
                    System.out.printf("%d  /%s  /%s\n",
                            articleList.get(i).getId(),
                            articleList.get(i).getTitle(),
                            articleList.get(i).getBody());

                }
            } else if (cmd.equals("article write")) {
                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("내용 : ");
                String body = sc.nextLine();

                lastId++;
                int id = lastId;

                Article addArticle = new Article();
                addArticle.setId(id);
                addArticle.setTitle(title);
                addArticle.setBody(body);

                articleList.add(addArticle);

                System.out.printf("%d번 글이 생성되었습니다.\n", lastId);
            } else if (cmd.equals("exit")) {
                System.out.println(" == 프로그램 종료 == ");
                break;
            }
            else {
                System.out.println("사용 할 수 없는 명령어 입니다.");
            }


        }
    }
}
