package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.document.SpecDocument;

/**
 * データベースエンジニア
 */
public interface DatabaseEngineer extends Engineer {

    /**
     * テーブル設計
     * 
     * @param spec 仕様書
     * @return ER図とか
     */
    SpecDocument tableDesign(SpecDocument spec);

}
