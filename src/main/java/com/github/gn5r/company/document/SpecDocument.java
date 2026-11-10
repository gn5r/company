package com.github.gn5r.company.document;

/**
 * 仕様書
 */
public sealed interface SpecDocument extends Document permits Excel, Markdown {

}
