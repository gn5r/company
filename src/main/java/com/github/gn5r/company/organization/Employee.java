package com.github.gn5r.company.organization;

/**
 * 従業員
 */
public interface Employee extends Member {

    /**
     * 社員番号を設定する
     * 
     * @param employeeNo 社員番号
     */
    void setEmployeeNo(Integer employeeNo);

    /**
     * 社員番号を取得する
     * 
     * @return 社員番号
     */
    Integer getEmployeeNo();

}
