package com.example.fastfood;

import java.io.Serializable;


@SuppressWarnings("sandwich")
public class sandwich implements Serializable {
    private int mNombre;
    private int mIdent;
    private int mDescri;
    private int mPrecio;
    private int mTitulo;

    @Override
    public String toString() {
        return "sandwich{" +
                "mNombre=" + mNombre +
                ", mIdent=" + mIdent +
                ", mDescri=" + mDescri +
                ", mPrecio=" + mPrecio +
                ", mTitulo=" + mTitulo +
                '}';
    }

    public sandwich(int mNombre, int mIdent, int mDescri, int mPrecio, int mTitulo) {
        this.mNombre = mNombre;
        this.mIdent = mIdent;
        this.mDescri = mDescri;
        this.mPrecio = mPrecio;
        this.mTitulo = mTitulo;
    }

    public int getmNombre() {
        return mNombre;
    }

    public void setmNombre(int mNombre) {
        this.mNombre = mNombre;
    }

    public int getmIdent() {
        return mIdent;
    }

    public void setmIdent(int mIdent) {
        this.mIdent = mIdent;
    }

    public int getmDescri() {
        return mDescri;
    }

    public void setmDescri(int mDescri) {
        this.mDescri = mDescri;
    }

    public int getmPrecio() {
        return mPrecio;
    }

    public void setmPrecio(int mPrecio) {
        this.mPrecio = mPrecio;
    }

    public int getmTitulo() {
        return mTitulo;
    }

    public void setmTitulo(int mTitulo) {
        this.mTitulo = mTitulo;
    }
}
