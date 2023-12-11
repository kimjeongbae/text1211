package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Article> articleList = new ArrayList<>();

        int lastId = 1;


        System.out.println("==== 시스템 시작 ====");

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("제목 : ");
                String title = sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();

                System.out.println(lastId + "번 게시글이 입력되었습니다.");

                Article article = new Article(lastId, title, content);
                articleList.add(article);

                lsatId++;

            } else if (command.equals("목록")) {
                System.out.println("번호 / 제목 / 내용");
                System.out.println("---------------------");

                for (Article article : articleList) {
                    System.out.printf("%d,   %s,   %s", article.getId(), article.getTitle(), article.getContent());
                }
            } else if (command.equals("삭제")) {
                System.out.println("삭제할 ID를 입력하세요");
                System.out.println("ID : ");
                int removeId = Integer.parseInt(sc.nextLine().trim());

                for (int i = 0; i < articleList.size(); i++) {
                    if (articleList.get(i).getId() == removeId) {
                        articleList.remove(articleList.get(i));
                    }
                }
                System.out.println(removeId + "번 게시글이 삭제 되었습니다.");

            } else if (command.equals("수정")) {
                System.out.println("수정할 ID를 입력하세요");
                System.out.println("ID : ");
                int modifyId = Integer.parseInt(sc.nextLine().trim());

                for (int i = 0; i < articleList.size(); i++) {
                    if (articleList.get(i).getId() == modifyId) {
                        Article article = articleList.get(i);

                        System.out.printf("기존 제목 : %s\n", article.getTitle() );
                        System.out.print("수정 제목 : ");
                        String title = sc.nextLine();
                        article.setTitle(title);

                        System.out.printf("기존 내용 : %s\n", article.getContent() );
                        System.out.print("수정 내용 : ");
                        String content = sc.nextLine();
                        article.setContent(content);

                        System.out.println(modifyId + "번 게시글이 수정되었습니다.");
                    }
                }
            } else if (command.equals("회원가입")){
                System.out.println("== 게시판 회원가입 환영합니다 ==");
                System.out.println("회원 정보를 입력 해주세요");

                System.out.println("아이디");
                String memberid = sc.nextLine();

                System.out.println("비밀번호");
                String password = sc.nextLine();

                System.out.println("비밀번호 확인)");
                String paswordConfrim = sc.nextLine();


                System.out.println("닉네임) ");
                String nickname = sc.nextLine();

                Member member = new Member(id,memberid,nickname);
                memberList.add(member);

                int memberId = Integer.parseInt(sc.nextLine());
                for(int i = 0; i < memberList.size(); i++){
                    if(memberLastId)
                }

            }



        }

        sc.close();
    }
}


