package com.github.gn5r.company.organization;

import java.util.List;

/**
 * 組織(団体)そのものを表す<br>
 * 会社や非営利団体に関係なく、組織そのものが持つものを定義する
 */
public interface Organization {

    /**
     * 組織としての目的を取得する
     * 
     * @return 目的
     */
    String getPurpose();

    /**
     * 組織メンバーを取得する
     * 
     * @return 組織メンバー
     */
    List<Member> getMembers();

}
