package com.smulsky.patterns.Strategy;

public class Ukraine {
    private RelationshipStrategy relationship;

    public void setRelationship(RelationshipStrategy relationship) {
        this.relationship = relationship;
    }

    public void makeRelationship(){
        relationship.doIt();
    }
}
