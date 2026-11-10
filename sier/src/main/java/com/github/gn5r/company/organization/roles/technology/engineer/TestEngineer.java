package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.artifacts.仕様書;
import com.github.gn5r.company.document.Excel;

/**
 * テストエンジニア
 */
public interface TestEngineer extends Engineer {

    /**
     * テスト仕様書をもとにテストを実行し、その結果を返す
     * 
     * @param spec 仕様書
     * @return テスト結果
     */
    仕様書<Excel> テスト(仕様書<Excel> spec);

}
