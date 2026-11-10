package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.artifacts.インフラ成果物;
import com.github.gn5r.company.artifacts.仕様書;
import com.github.gn5r.company.artifacts.設計書;
import com.github.gn5r.company.document.Document;

/**
 * インフラエンジニア
 */
public interface インフラエンジニア extends Engineer {

    /**
     * 仕様書をもとにインフラ設計をする
     * 
     * @param <D>  設計書のドキュメント形式
     * @param spec 仕様書
     * @return 設計書
     */
    <D extends Document> 設計書<D> インフラ設計(仕様書<?> spec);

    /**
     * インフラ設計書をもとにインフラの構築をする
     * 
     * @param doc 設計書
     * @return インフラリソース
     */
    インフラ成果物 インフラ構築(設計書<?> doc);

}
