package com.github.gn5r.company.organization;

import java.time.LocalDate;

/**
 * 組織の一員<br>
 * 従業員/業務委託など雇用形態を一切問わない
 */
public interface Member {

    /**
     * 名を設定する
     * 
     * @param firstName 名
     */
    void setFirstName(String firstName);

    /**
     * 名を取得する
     * 
     * @return 名
     */
    String getFirstName();

    /**
     * 姓を設定する
     * 
     * @param 姓
     */
    void setFamilyName(String familyName);

    /**
     * 姓を取得する
     * 
     * @return 姓
     */
    String getFamilyName();

    /**
     * 参画日を設定する
     * 
     * @param 参画日
     */
    void setJoinDate(LocalDate joinDate);

    /**
     * 参画日を取得する
     * 
     * @return 参画日
     */
    LocalDate getJoinDate();
}
