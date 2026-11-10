package com.github.gn5r.company.organization.roles.technology.engineer;

import java.util.List;

/**
 * 保守運用エンジニア<br>
 * 実体験をもとに振る舞いを定義
 */
public interface OpsEngineer extends SRE {

    /**
     * 問い合わせ対応
     * 
     * @param <I>     問い合わせ種別
     * @param inquiry 問い合わせ内容
     * @return 問い合わせやり取り
     */
    <I> String inquiryResponse(I inquiry);

    /**
     * 保守対応
     * 
     * @param <T>   保守種別
     * @param <R>   結果
     * @param issue 保守内容
     * @return 対応結果
     */
    <T, R> R troubleshooting(T issue);

    /**
     * 障害対応
     * 
     * @param <I>      障害
     * @param <R>      結果
     * @param incident 障害内容
     * @return 対応結果
     */
    <I, R> R incidentHandling(I incident);

    /**
     * リリース作業
     * 
     * @param <F>      機能
     * @param features リリースする機能たち
     * @return リリース成否
     */
    <F> boolean release(List<F> features);

    /**
     * CI/CDを整備する
     * 
     * @param code 既存コード
     * @return コード
     */
    String cicd(String code);

}
