import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class Lexer {

    public static void main(String[] args) throws Exception {
        System.out.println("Parsing: " + args[0]);

        FileInputStream fis = new FileInputStream(new File(args[0]));
        ANTLRInputStream input = new ANTLRInputStream(fis);
        DecafLexer lexer = new DecafLexer(input);

        Token token = lexer.nextToken();
        while (token.getType() != DecafLexer.EOF) {
            System.out.println("\t" + getTokenType(token.getType()) + " --> " + token.getText());
            token = lexer.nextToken();
        }
    }

    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case DecafLexer.CLASS:
                return "CLASS";
            case DecafLexer.PROGRAM:
                return "PROGRAM";
            case DecafLexer.IF:
                return "IF";
            case DecafLexer.ELSE:
                return "ELSE";
            case DecafLexer.FOR:
                return "FOR";
            case DecafLexer.RETURN:
                return "RETURN";
            case DecafLexer.BREAK:
                return "BREAK";
            case DecafLexer.CONTINUE:
                return "CONTINUE";
            case DecafLexer.BOOLEAN:
                return "BOOLEAN";
            case DecafLexer.CHAR:
                return "CHAR";
            case DecafLexer.INT:
                return "INT";
            case DecafLexer.STRING:
                return "STRING";
            case DecafLexer.TRUE:
                return "TRUE";
            case DecafLexer.FALSE:
                return "FALSE";
            case DecafLexer.VOID:
                return "VOID";
            case DecafLexer.CALLOUT:
                return "CALLOUT";
            case DecafLexer.SEMICOLON:
                return "SEMICOLON";
            case DecafLexer.LCURLY:
                return "LCURLY";
            case DecafLexer.RCURLY:
                return "RCURLY";
            case DecafLexer.LSQUARE:
                return "LSQUARE";
            case DecafLexer.RSQUARE:
                return "RSQUARE";
            case DecafLexer.LROUND:
                return "LROUND";
            case DecafLexer.RROUND:
                return "RROUND";
            case DecafLexer.COMMA:
                return "COMMA";
            case DecafLexer.QUOTES:
                return "QUOTES";
            case DecafLexer.APOSTROPHE:
                return "APOSTROPHE";
            case DecafLexer.ADD:
                return "ADD";
            case DecafLexer.SUB:
                return "SUB";
            case DecafLexer.MULTIPLY:
                return "MULTIPLY";
            case DecafLexer.DIVIDE:
                return "DIVIDE";
            case DecafLexer.REMINDER:
                return "REMINDER";
            case DecafLexer.AND:
                return "AND";
            case DecafLexer.OR:
                return "OR";
            case DecafLexer.NOT:
                return "NOT";
            case DecafLexer.GREATER_OP:
                return "GREATER_OP";
            case DecafLexer.LESS_OP:
                return "LESS_OP";
            case DecafLexer.GREATER_eq_op:
                return "GREATER_eq_op";
            case DecafLexer.LESS_eq_op:
                return "LESS_eq_op";
            case DecafLexer.EQUAL_OP:
                return "EQUAL_OP";
            case DecafLexer.ADD_eq_op:
                return "ADD_eq_op";
            case DecafLexer.SUB_eq_op:
                return "SUB_eq_op";
            case DecafLexer.EQUALITY_OP:
                return "EQUALITY_OP";
            case DecafLexer.UNEQUALITY_OP:
                return "UNEQUALITY_OP";
            case DecafLexer.ID:
                return "ID";
            case DecafLexer.ALPHA:
                return "ALPHA";
            case DecafLexer.CHAR_LITERAL:
                return "CHAR_LITERAL";
            case DecafLexer.DECIMAL_LITERAL:
                return "DECIMAL_LITERAL";
            case DecafLexer.DIGIT:
                return "DIGIT";
            case DecafLexer.HEX_LITERAL:
                return "HEX_LITERAL";
            case DecafLexer.BOOL_LITERAL:
                return "BOOL_LITERAL";
            case DecafLexer.STRING_LITERAL:
                return "STRING_LITERAL";
            case DecafLexer.ALPHA_NUM:
                return "ALPHA_NUM";
            case DecafLexer.HEX_DIGIT:
                return "HEX_DIGIT";
            case DecafLexer.LINE_COMMENT:
                return "LINE_COMMENT";
            case DecafLexer.COMMENT:
                return "COMMENT";
            case DecafLexer.NEWLINE:
                return "NEWLINE";
            case DecafLexer.WHITESPACE:
                return "WHITESPACE";
            default:
                return "OTRO";
        }
    }
}