package seafood.component.lang.handlers

import com.intellij.lexer.BaseHtmlLexer
import com.intellij.lexer.Lexer
//import seafood.component.lang.SeafoodHandledLexer

class SeafoodTagClosedHandler : BaseHtmlLexer.TokenHandler{
    override fun handleElement(lexer: Lexer?) {
//        val handled = lexer as SeafoodHandledLexer
//        if (handled.seenTemplate() && handled.seenScript()) {
//            handled.setSeenTag(true)
//        }
    }
}