package com.github.gn5r.company.document;

import lombok.Getter;
import lombok.Setter;

/**
 * エクセル
 */
@Getter
@Setter
public final class Excel implements Office, SpecDocument {

    private String content;

}
