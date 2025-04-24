package koreaIT.controller;

import koreaIT.dto.Member;

public abstract class Controller {

    static Member loginedMember = null;

    public static boolean isLogined(){
        return loginedMember != null;
    }

    public abstract void doAction(String methodName, String cmd);

}