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
    public void equals_sameObject() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        assertEquals(t1.equals(t1), true);
    }

    @Test 
    public void equals_differentObject() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        String t2 = "Team2";
        assertEquals(t1.equals(t2), false);
    }

    @Test 
    public void equals_noDifference() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F1");
        t2.addMember("Max");
        t2.addMember("Charles");
        assertEquals(t1.equals(t2), true);
    }

    @Test  
    public void equals_differentName() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F2");
        t2.addMember("Max");
        t2.addMember("Charles");
        assertEquals(t1.equals(t2), false);
    }

    @Test  
    public void equals_differentMembers() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F1");
        t2.addMember("George");
        t2.addMember("Lewis");
        assertEquals(t1.equals(t2), false);
    }

    @Test 
    public void equals_differentNameDifferentMembers() {
        Team t1 = new Team("F1");
        t1.addMember("Max");
        t1.addMember("Charles");
        Team t2 = new Team("F2");
        t2.addMember("Arvid");
        t2.addMember("Pepe");
        assertEquals(t1.equals(t2), false);
    }
}
