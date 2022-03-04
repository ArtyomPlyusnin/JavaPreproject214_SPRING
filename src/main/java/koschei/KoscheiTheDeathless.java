package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;                                      //поле С объектом №1

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();    //модуль, возвращающий строку + объект №1
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    } //сеттер для объекта №1
}
