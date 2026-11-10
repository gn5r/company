package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.artifact.Infrastructure;
import com.github.gn5r.company.document.Document;

/**
 * インフラエンジニア
 */
public interface InfraEngineer extends SRE {

    /**
     * 仕様や要件をもとにインフラのキッティングを行う
     * 
     * @param spec 仕様書
     * @return キッティングしたインフラリソース
     */
    Infrastructure kitting(Document spec);

}
