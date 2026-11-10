package com.github.gn5r.company.organization;

/**
 * 組織(団体)が持つ根本的な振る舞い<br>
 * 会社や非営利団体に関係なく、組織そのものが持つものを定義する
 */
public interface Organization {

    /**
     * 組織としての目的を取得する
     * 
     * @return 目的
     */
    String getPurpose();

}
