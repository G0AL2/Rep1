package com.facebook.soloader;

/* compiled from: NativeLoaderToSoLoaderDelegate.java */
/* loaded from: classes.dex */
public class o implements i7.b {
    @Override // i7.b
    public boolean a(String str, int i10) {
        return SoLoader.q(str, ((i10 & 1) != 0 ? 16 : 0) | 0);
    }
}
