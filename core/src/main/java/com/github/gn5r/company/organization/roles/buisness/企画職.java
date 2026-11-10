package com.github.gn5r.company.organization.roles.buisness;

import com.github.gn5r.company.document.Excel;
import com.github.gn5r.company.document.PowerPoint;
import com.github.gn5r.company.organization.Employee;

/**
 * 企画職
 */
public interface 企画職 extends Employee {

    /**
     * 企画を考え企画案を作成する
     * 
     * @param <T>  事業
     * @param data 情報
     * @return 企画案
     */
    <T> PowerPoint plan(T data);

    /**
     * 調査対象を分析してデータをまとめる
     * 
     * @param <T>    調査対象
     * @param target 調査対象
     * @return リサーチ結果
     */
    <T> Excel research(T target);

}
