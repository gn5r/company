package com.github.gn5r.company.organization.roles.technology.engineer;

import java.util.List;

import com.github.gn5r.company.artifacts.インフラ成果物;
import com.github.gn5r.company.artifacts.設計書;
import com.github.gn5r.company.document.Excel;

/**
 * 保守運用エンジニア
 */
public interface 保守運用エンジニア extends Programmer, TestEngineer {

    /**
     * 問い合わせ対応
     * 
     * @param <I>     問い合わせ種別
     * @param inquiry 問い合わせ内容
     * @return 問い合わせやり取り
     */
    <I> String 問い合わせ対応(I inquiry);

    /**
     * 保守対応
     * 
     * @param <T>   保守種別
     * @param <R>   結果
     * @param issue 保守内容
     * @return 対応結果
     */
    <T, R> R 保守対応(T issue);

    /**
     * 障害対応
     * 
     * @param <I>      障害
     * @param <R>      結果
     * @param incident 障害内容
     * @return 対応結果
     */
    <I, R> R 障害対応(I incident);

    /**
     * リリース作業
     * 
     * @param <F>      機能
     * @param features リリースする機能たち
     * @return リリース成否
     */
    <F> boolean リリース作業(List<F> features);

    /**
     * 既存の何かを対象に開発者体験を向上する<br>
     * CI/CDの整備や自動化などを含む
     * 
     * @param <R>   結果
     * @param input 改善するもの
     * @return 向上したもの
     */
    <I, R> R 開発者体験の向上(I input);

    /**
     * 詳細設計書をもとに、インフラリソースのリファクタリングをする
     * 
     * @param doc 仕様書
     * @return リファクタリングしたインフラリソース
     */
    インフラ成果物 インフラ改善(設計書<Excel> doc);

    /**
     * インフラやアラートを監視して調査する
     * 
     * @param infra インフラリソース
     * @return 調査結果・監視レポート
     */
    String 監視(インフラ成果物 infra);

}
