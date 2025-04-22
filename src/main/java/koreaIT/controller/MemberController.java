package koreaIT.controller;

import koreaIT.dto.Member;
import koreaIT.util.Util;

import java.util.List;
import java.util.Scanner;

public class MemberController {

    private Scanner sc;
    List<Member> memberList;
    int lastMemebrId = 0;

    public MemberController(Scanner sc, List<Member> memberList) {
        this.sc = sc;
        this.memberList = memberList;
    }

    public void doJoin() {

        String loginId;
        while (true) {
            System.out.print("로그인 아이디 : ");
            loginId = sc.nextLine();

            if (isJoinableLoginId(loginId) == false) {
                System.out.println("이미 사용 중인 아이디입니다.");
                continue;
            }
            break;
        }

        String loginPw;
        while (true) {
            System.out.print("로그인 비밀번호 : ");
            loginPw = sc.nextLine();
            System.out.print("로그인 비밀번호 확인 : ");
            String loginPwConfirm = sc.nextLine();

            if (!loginPw.equals(loginPwConfirm)) {
                System.out.println("비밀번호 다시 확인해주세요.");
                continue;
            }
            break;
        }


        System.out.print("이름 : ");
        String name = sc.nextLine();

        String regDate = Util.getNowDate();

        lastMemebrId++;
        Member addMember = new Member(lastMemebrId, regDate, "", loginId, loginPw, name);

        memberList.add(addMember);

        System.out.printf("%d번 회원이 등록되었습니다. %s님 환영합니다.\n", lastMemebrId, name);

    }

    private boolean isJoinableLoginId(String loginId) {
        for (Member member : memberList) {
            if (member.getLoginId().equals(loginId)) {
                return false;
            }
        }
        return true;
    }
}