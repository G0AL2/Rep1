package oc;

/* compiled from: Protobuf.java */
/* loaded from: classes3.dex */
public @interface d {

    /* compiled from: Protobuf.java */
    /* loaded from: classes3.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
