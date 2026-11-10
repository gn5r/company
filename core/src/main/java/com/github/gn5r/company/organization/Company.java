package com.github.gn5r.company.organization;

import java.time.LocalDate;
import java.util.List;

/**
 * 会社が持つ振る舞い<br>
 * 現状は株式会社・非営利団体関係なく、思いつく限りの振る舞いを定義
 */
public interface Company extends Organization {

    /**
     * 会社名を取得する
     * 
     * @return 会社名
     */
    String getName();

    /**
     * ビジョンを取得する
     * 
     * @return ビジョン
     */
    String getVision();

    /**
     * ミッションを取得する
     * 
     * @return ミッション
     */
    String getMission();

    /**
     * 事業内容を取得する
     * 
     * @return 事業内容
     */
    List<String> getService();

    /**
     * 創業日を取得する
     * 
     * @return 創業日
     */
    LocalDate getFoundingDate();

    /**
     * 所在地を取得する
     * 
     * @return 所在地
     */
    String getLocation();

}
