package com.github.gn5r.company.organization.roles.buisness;

import com.github.gn5r.company.artifacts.仕様書;
import com.github.gn5r.company.artifacts.要件定義書;
import com.github.gn5r.company.document.Document;
import com.github.gn5r.company.organization.roles.technology.engineer.Engineer;

/**
 * プロダクトマネージャー
 */
public interface PdM extends 企画職, Engineer {

    /**
     * 要件定義をする
     * 
     * @param <R>          要件の形式
     * @param <D>          要件定義書のドキュメント形式
     * @param requirements 要件
     * @return 要件定義書
     */
    <R, D extends Document> 要件定義書<D> 要件定義(R requirements);

    /**
     * 基本設計をする<br>
     * 要件定義をもとに何を作るかを設計する
     * 
     * @param <D>        仕様書のドキュメント形式
     * @param definition 要件定義書
     * @return 仕様書
     */
    <D extends Document> 仕様書<D> 基本設計(要件定義書<?> definition);

}
