package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void testEquals_sameObject() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        assertEquals(t1.equals(t1), true);
    }

    @Test 
    public void testEquals_differentObject() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        String t2 = "Team2";
        assertEquals(t1.equals(t2), false);
    }

    @Test 
    public void testEquals_noDifference() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F1");
        t2.addMember("Max");
        t2.addMember("Charles");
        assertEquals(t1.equals(t2), true);
    }

    @Test  
    public void testEquals_differentName() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F2");
        t2.addMember("Max");
        t2.addMember("Charles");
        assertEquals(t1.equals(t2), false);
    }

    @Test  
    public void testEquals_differentMembers() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F1");
        t2.addMember("George");
        t2.addMember("Lewis");
        assertEquals(t1.equals(t2), false);
    }

    @Test 
    public void testEquals_differentNameDifferentMembers() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F2");
        t2.addMember("Arvid");
        t2.addMember("Pepe");
        assertEquals(t1.equals(t2), false);
    }

    @Test
    public void testHashCode_noDifference() {
        Team t1 = new Team("foo");
        t1.addMember("bar");
        Team t2 = new Team("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void testHashCode_expectedValue() {
        Team t1 = new Team("foo");
        t1.addMember("bar");
        int result = t1.hashCode();
        int expectedResult = 130294;
        assertEquals(expectedResult, result);
    }
}
