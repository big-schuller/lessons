package com.company.lesson1;

public abstract class AModel implements IModel {
    protected int id = 0;
    protected int length = 0;
    protected int height = 0;
    protected boolean isStop = false;

    AModel(int id, int length, int height){
        this.id = id;
        this.length = length;
        this.height = height;
    }

    @Override
    public void toRun(ILet let) {
        if(isStop() || let.getLength() == 0) return;
        this.length -= let.getLength();
        if(this.length < 0) {
            System.out.println(this + " не пробежал " + let);
            this.setStop(true);
            return;
        }
        System.out.println(this + " пробежал " + let);
    }

    @Override
    public void jump(ILet let) {
        if(isStop() || let.getHeight() == 0) return;
        this.height -= let.getHeight();
        if(this.height < 0) {
            System.out.println(this + " не перепрыгнул " + let);
            this.setStop(true);
            return;
        }
        System.out.println(this + " перепрыгнул " + let);
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean isStop() {
        return isStop;
    }

    public void setStop(boolean stop) {
        isStop = stop;
    }

    @Override
    public String toString() {
        return "Undefined №" + this.getId();
    }
}
