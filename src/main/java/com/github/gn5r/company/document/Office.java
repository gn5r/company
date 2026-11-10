package com.github.gn5r.company.document;

/**
 * Microsoft Office
 */
public sealed interface Office extends Document permits Excel, PowerPoint, Word {

}
