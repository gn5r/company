package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.artifacts.仕様書;
import com.github.gn5r.company.artifacts.成果物;
import com.github.gn5r.company.artifacts.要件定義書;
import com.github.gn5r.company.artifacts.設計書;
import com.github.gn5r.company.document.Excel;

/**
 * SE
 */
public interface SE extends Programmer, TestEngineer {

    /**
     * 要件定義をする
     * 
     * @param <R>          要件の形式
     * @param requirements 要件
     * @return 要件定義書
     */
    <R> 要件定義書<Excel> 要件定義(R requirements);

    /**
     * 基本設計をする<br>
     * 要件定義をもとに何を作るかを設計する
     * 
     * @param definition 要件定義書
     * @return 基本設計書
     */
    設計書<Excel> 基本設計(要件定義書<Excel> definition);

    /**
     * 詳細設計をする<br>
     * 基本設計書をもとにもう少し具体的に何をどう作るか設計する
     * 
     * @param doc 基本設計書
     * @return 詳細設計書
     */
    設計書<Excel> 詳細設計(設計書<Excel> definition);

    /**
     * 仕様をもとにテーブル設計をする
     * 
     * @param spec 仕様書
     * @return テーブル設計書
     */
    設計書<Excel> テーブル設計(仕様書<Excel> spec);

    /**
     * 設計書やコードレビューをする
     * 
     * @param artifact 成果物
     * @return レビュー結果
     */
    String レビュー(成果物 artifact);

}
