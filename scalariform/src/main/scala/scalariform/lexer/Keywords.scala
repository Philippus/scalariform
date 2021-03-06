package scalariform.lexer

import scalariform.lexer.Tokens._

object Keywords {

  def apply(s: String): Option[TokenType] = keywords get s

  private val keywords = Map(
    "abstract" -> ABSTRACT,
    "case" -> CASE,
    "catch" -> CATCH,
    "class" -> CLASS,
    "def" -> DEF,
    "do" -> DO,
    "else" -> ELSE,
    "extends" -> EXTENDS,
    "false" -> FALSE,
    "final" -> FINAL,
    "finally" -> FINALLY,
    "for" -> FOR,
    "forSome" -> FORSOME,
    "if" -> IF,
    "implicit" -> IMPLICIT,
    "import" -> IMPORT,
    "lazy" -> LAZY,
    "match" -> MATCH,
    "new" -> NEW,
    "null" -> NULL,
    "object" -> OBJECT,
    "override" -> OVERRIDE,
    "package" -> PACKAGE,
    "private" -> PRIVATE,
    "protected" -> PROTECTED,
    "return" -> RETURN,
    "sealed" -> SEALED,
    "super" -> SUPER,
    "this" -> THIS,
    "throw" -> THROW,
    "trait" -> TRAIT,
    "try" -> TRY,
    "true" -> TRUE,
    "type" -> TYPE,
    "val" -> VAL,
    "var" -> VAR,
    "while" -> WHILE,
    "with" -> WITH,
    "yield" -> YIELD,
    "_" -> USCORE,
    ":" -> COLON,
    "=" -> EQUALS,
    "=>" -> ARROW,
    "<-" -> LARROW,
    "<:" -> SUBTYPE,
    "<%" -> VIEWBOUND,
    ">:" -> SUPERTYPE,
    "#" -> HASH,
    "@" -> AT,
    "." -> DOT,
    "+" -> PLUS,
    "-" -> MINUS,
    "*" -> STAR,
    "|" -> PIPE,
    "~" -> TILDE,
    "!" -> EXCLAMATION
  )

}
