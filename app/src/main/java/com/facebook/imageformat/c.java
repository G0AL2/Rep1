package com.facebook.imageformat;

import fm.castbox.mediation.model.NetworkName;

/* compiled from: ImageFormat.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f14812b = new c(NetworkName.UNKNOWN, null);

    /* renamed from: a  reason: collision with root package name */
    private final String f14813a;

    /* compiled from: ImageFormat.java */
    /* loaded from: classes.dex */
    public interface a {
        c a(byte[] bArr, int i10);

        int b();
    }

    public c(String str, String str2) {
        this.f14813a = str;
    }

    public String a() {
        return this.f14813a;
    }

    public String toString() {
        return a();
    }
}
