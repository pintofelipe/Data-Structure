package com.coco.doblecircular;

public class NodoDC {
    private NodoDC ant;
    private NodoDC sgt;
    private int age;

    public NodoDC getAnt() {
        return ant;
    }

    public void setAnt(NodoDC ant) {
        this.ant = ant;
    }

    public NodoDC getSgt() {
        return sgt;
    }

    public void setSgt(NodoDC sgt) {
        this.sgt = sgt;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
