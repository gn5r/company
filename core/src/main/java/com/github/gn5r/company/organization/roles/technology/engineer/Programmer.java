package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.artifacts.ソースコード;
import com.github.gn5r.company.artifacts.仕様書;

/**
 * プログラマー
 */
public interface Programmer extends Engineer {

    /**
     * 仕様書からプログラミングをする
     * 
     * @param spec 仕様書
     * @return コード
     */
    ソースコード programming(仕様書<?> spec);

}
