package cn.guzx.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@ApiModel(description = "家人")
public class Family {
    @ApiModelProperty(value = "父亲")
    private String father;
    @ApiModelProperty(value = "母亲")
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
