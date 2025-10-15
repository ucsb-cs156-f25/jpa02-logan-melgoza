package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Logan";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "logan-melgoza";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-14");
        team.addMember("PRATIMA REDDY");
        team.addMember("DANIEL JUNKYUK");
        team.addMember("LOGAN CHRISTOPHER");
        team.addMember("CATHERINE");
        team.addMember("FERNANDO");
        team.addMember("KEYI");
        return team;
    }
}
