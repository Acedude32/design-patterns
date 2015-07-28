package com.smulsky.patterns.Strategy;

public class FriendlyRelationshipStrategy implements RelationshipStrategy {
    @Override
    public void doIt() {
        System.out.println("Buy flowers for them!!!");
    }
}
