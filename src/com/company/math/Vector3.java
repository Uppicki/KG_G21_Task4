package com.company.math;
/**
 * Класс Vector представляет собой точку в реальном мире
 */
public class Vector3 {
    private float[] values;


    public Vector3(float x, float y, float z) {
        this.values = new float[]{x, y, z};
    }


    public float getX() {
        return values[0];
    }
    public float getY() {
        return values[1];
    }
    public float getZ() {
        return values[2];
    }

    public float at(int index) {
        return values[index];
    }
}
