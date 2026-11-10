package com.github.gn5r.company.artifacts;

import com.github.gn5r.company.document.Document;

/**
 * 設計書
 * 
 * @param <D> 設計書のドキュメント形式
 */
public interface 設計書<D extends Document> extends Document, 成果物 {

}
