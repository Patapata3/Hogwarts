package com.example.hogwarts.domain.model.valueObjects;

public class Score {
    private int gryffindor;
    private int hufflepuff;
    private int ravenclaw;
    private int slytherin;

    public Score(int gryffindor, int hufflepuff, int ravenclaw, int slytherin) {
        this.gryffindor = gryffindor;
        this.hufflepuff = hufflepuff;
        this.ravenclaw = ravenclaw;
        this.slytherin = slytherin;
    }

    public int getGryffindor() {
        return gryffindor;
    }

    public void setGryffindor(int gryffindor) {
        this.gryffindor = gryffindor;
    }

    public int getHufflepuff() {
        return hufflepuff;
    }

    public void setHufflepuff(int hufflepuff) {
        this.hufflepuff = hufflepuff;
    }

    public int getRavenclaw() {
        return ravenclaw;
    }

    public void setRavenclaw(int ravenclaw) {
        this.ravenclaw = ravenclaw;
    }

    public int getSlytherin() {
        return slytherin;
    }

    public void setSlytherin(int slytherin) {
        this.slytherin = slytherin;
    }
}
