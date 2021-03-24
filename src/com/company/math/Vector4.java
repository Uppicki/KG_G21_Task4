package com.company.math;

/**
 * Описание 3-х мерной (.) в виде вектора из 4-х компонент для матречной алгебры
 */
public class Vector4 {
    private float[] values;
    private static final int SIZE = 4;


    public Vector4(float x, float y, float z, float w) {
        this.values = new float[]{x, y, z, w};
    }

    public Vector4(float x, float y, float z) {
        this(x, y, z, 0);
    }

    public Vector4(Vector3 vector3, float w) {
        this(vector3.getX(), vector3.getY(), vector3.getZ(), w);
    }

    public Vector4(Vector3 vector3) {
        this(vector3.getX(), vector3.getY(), vector3.getZ(), 0);
    }

    private Vector4(float[] arr) {
        this.values = arr;
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
    public float getW() {
        return values[3];
    }

    public float at(int index) {
        return values[index];
    }

    private static final float EPS = 1e-12f;

    /**
     * Возвращает нормализованный по компаненте W вектор
     * @return
     */
    public Vector4 normalized() {
        if (Math.abs(getW()) < EPS) {
            return  new Vector4(getX(), getY(), getZ(), 0);
        }
        return  new Vector4(getX()/getW(), getY()/getW(), getZ()/getW(), 1f);
    }

    public Vector4 mul(float number) {
        float[] result = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            result[i] = this.at(i) *number;
        }
        return new Vector4(result);
    }

    public Vector4 mul(Vector4 vector4) {
        float[] result = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            result[i] = this.at(i) * vector4.at(i);
        }
        return new Vector4(result);
    }

    public static Vector4 zero(){
        return new Vector4(0, 0, 0, 0);
    }
}
