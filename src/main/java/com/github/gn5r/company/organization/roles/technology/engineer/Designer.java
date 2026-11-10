package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.document.SpecDocument;

/**
 * デザイナー
 */
public interface Designer extends Engineer {

    /**
     * 画面デザイン
     * 
     * @param spec 仕様書
     * @return コード
     */
    String uiDesign(SpecDocument spec);

    /**
     * モック作成
     * 
     * @param spec 仕様書
     * @return モック(コード)
     */
    String mock(SpecDocument spec);

}
