package com.github.gn5r.company.organization.roles.buisness;

import com.github.gn5r.company.document.Excel;
import com.github.gn5r.company.document.Office;
import com.github.gn5r.company.document.SpecDocument;
import com.github.gn5r.company.organization.roles.technology.engineer.Engineer;

/**
 * プロダクトマネージャー
 */
public interface PdM extends Plan, Engineer {

    /**
     * 要件定義
     * 
     * @param requirements 要件
     * @return 要件定義書
     */
    SpecDocument requirementsDefinition(Office requirements);

    /**
     * 基本設計<br>
     * 要件定義をもとに何を作るかを設計する
     * 
     * @param definition 要件定義書
     * @return 仕様書
     */
    SpecDocument functionalDesign(Excel definition);

}
