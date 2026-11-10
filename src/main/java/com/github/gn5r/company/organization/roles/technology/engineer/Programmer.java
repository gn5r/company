package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.document.SpecDocument;

/**
 * プログラマー
 */
public interface Programmer extends Engineer {
    
    /**
     * 仕様書からプログラミングをする
     * @param spec 仕様書
     * @return コード
     */
    String programming(SpecDocument spec);

}
