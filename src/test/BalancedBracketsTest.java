package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // First example test tests if having correctly placed, empty brackets returns true
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test if an empty string returns true
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    // Test if a string consisting of nothing but non-bracket characters returns true
    @Test
    public void nonBracketCharactersWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("This should return true"));
    }

    // Test if multiple pairs of balanced brackets return true
    @Test
    public void multiplePairsOfBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][][]"));
    }

    // Test if a string with balanced brackets and non-bracket characters returns true
    @Test
    public void balancedBracketsWithNonBracketCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Returns [true]"));
    }

    // Test if a string with only a front bracket returns false
    @Test
    public void frontBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    // Test if a string with only a back bracket returns false
    @Test
    public void backBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // Test if out of order brackets returns false
    @Test
    public void wrongBracketOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // Test if several balanced brackets and a single, unbalanced, front bracket returns false
    @Test
    public void multipleBalancedBracketsAndSingleFrontBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][]["));
    }

    // Test if several balanced brackets and a single, unbalanced, back bracket returns false
    @Test
    public void multipleBalancedBracketsAndSingleBackBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][]]"));
    }

    // Test if only a front bracket among non-bracket characters returns false
    @Test
    public void singleFrontBracketWithNonBracketCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("This[ will return false."));
    }

    // Test if only a back bracket among non-bracket characters returns false
    @Test
    public void singleBackBracketWithNonBracketCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("This] will return false."));
    }

    // Test if out of order brackets with non-bracket characters returns false
    @Test
    public void OutOfOrderBracketsWithNonBracketCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("This][ will return false."));
    }



}
