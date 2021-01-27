package cn.guzx.bean;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Family {
    private String father;
    private String mom;

    @Override
    public String toString() {
        return "Family{" +
                "father='" + father + '\'' +
                ", mom='" + mom + '\'' +
                '}';
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
    }
}
