package com.smulsky.patterns.Strategy;

public class AggressiveRelationshipStrategy implements RelationshipStrategy {
    @Override
    public void doIt() {
        System.out.println("Attack them!!!");
    }
}
