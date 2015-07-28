package com.smulsky.patterns.Strategy;

public class Client {
    public static void main(String[] args) {
        Ukraine ukraine = new Ukraine();
        RelationshipStrategy strategy = new FriendlyRelationshipStrategy();
        ukraine.setRelationship(strategy);
        ukraine.makeRelationship();
    }
}
