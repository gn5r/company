package com.github.gn5r.company.document;

/**
 * ドキュメント
 */
public interface Document {

    /**
     * ドキュメントの内容を書き込む
     * 
     * @param content 内容
     */
    void setContent(String content);

    /**
     * ドキュメントの内容を取得する
     * 
     * @return 内容
     */
    String getContent();

}
