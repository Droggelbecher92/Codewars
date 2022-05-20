package de.kittlaus.codewars.may;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTest {



    @Test
    public void sampleTest() {
        assertEquals(true,Parentheses.validParentheses( "()" ));
        assertEquals(false,Parentheses.validParentheses( "())" ));
        assertEquals(true,Parentheses.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,Parentheses.validParentheses( "(dsgdsg))2432" ));
        assertEquals(true,Parentheses.validParentheses( "adasdasfa" ));
        assertEquals(true,Parentheses.validParentheses( "{(V()4=)0kr5()fwY(JG[V)p[|" ));
        assertEquals(false,Parentheses.validParentheses( "(()(((()" ));
        assertEquals(false,Parentheses.validParentheses( "()()((()" ));
    }

}