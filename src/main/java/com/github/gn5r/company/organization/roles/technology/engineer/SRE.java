package com.github.gn5r.company.organization.roles.technology.engineer;

import com.github.gn5r.company.artifact.Infrastructure;
import com.github.gn5r.company.document.Document;

/**
 * SRE<br>
 * ※本来のSREの振る舞いとはやや異なるが、実体験をもとに振る舞いを分離したもの
 */
public interface SRE extends Engineer {

    /**
     * 仕様や要件をもとに、インフラリソースのリファクタリングを行う
     * 
     * @param spec 仕様書
     * @return リファクタリングしたインフラリソース
     */
    Infrastructure refactoring(Document spec);

    /**
     * インフラやシステムのパフォーマンス・信頼性を改善する
     * 
     * @param infra インフラリソース
     * @return 改善されたインフラリソース
     */
    Infrastructure tuning(Infrastructure infra);

    /**
     * インフラ(AWSコンソール等)やアラートを監視して調査する
     * 
     * @param infra インフラリソース
     * @return 調査結果・監視レポート
     */
    String monitoring(Infrastructure infra);

    /**
     * 運用作業やインフラ構築をコード化(IaC)・自動化する
     * 
     * @param manual 手順書や仕様書
     * @return 自動化コード
     */
    String automate(Document manual);

}
