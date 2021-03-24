package com.company.third;

import java.util.List;

/**
 * Описывает 3-х мерную модель в общем виде
 */

public interface IModel {
    /**
     * Возвращает список линий описывающих грани 3-х мерного объекта
     * @return Список из {@link PolyLine3D}
     */
    List<PolyLine3D> getLines();
}
