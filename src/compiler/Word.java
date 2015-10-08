/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

/**
 *
 * @author pedrohbnp
 */
public class Word extends Token{
    
    private String lexeme = "";
    
    public static final Word and = new Word (Tag.AND,"&&");
    public static final Word or = new Word (Tag.OR,"||");
    public static final Word ne = new Word (Tag.NE,"!=");
    public static final Word ge = new Word (Tag.GE,">=");
    public static final Word le = new Word (Tag.LE,"<=");
    public Word(int tag, String s) {
        super(tag);
        lexeme = s;
    }
    
    @Override
    public String toString(){
        return "" + lexeme;
    }

    public String getLexeme() {
        return lexeme;
    }
    
    
}