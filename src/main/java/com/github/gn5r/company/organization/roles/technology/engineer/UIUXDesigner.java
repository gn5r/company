package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.document.SpecDocument;

/**
 * UI/UXデザイナー
 */
public interface UIUXDesigner extends Designer {

    /**
     * UXデザインをする
     * 
     * @param spec 仕様書
     * @return コード
     */
    String uxDesign(SpecDocument spec);

}
