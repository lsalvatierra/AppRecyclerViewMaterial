package com.example.luisangel.apprecyclerview.Modelos;

import android.os.Parcel;
import android.os.Parcelable;

public class Android implements Parcelable {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private int imagen;
    private String nombre, version;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.imagen);
        dest.writeString(this.nombre);
        dest.writeString(this.version);
    }
    protected Android(Parcel in) {
        this.id = in.readInt();
        this.imagen = in.readInt();
        this.nombre = in.readString();
        this.version = in.readString();
    }

    public static final Parcelable.Creator<Android> CREATOR = new Creator<Android>() {
        @Override
        public Android createFromParcel(Parcel source) {
            return new Android(source);
        }

        @Override
        public Android[] newArray(int size) {
            return new Android[size];
        }
    };

    public Android(int id, int imagen, String nombre, String version) {
        //public Android(int id, String nombre, String version) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.version = version;
    }
}
