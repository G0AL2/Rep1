package com.inmobi.media;

/* compiled from: RawAsset.java */
/* loaded from: classes3.dex */
public final class bn {

    /* renamed from: a  reason: collision with root package name */
    final byte f24802a;

    /* renamed from: b  reason: collision with root package name */
    final String f24803b;

    public bn(byte b10, String str) {
        this.f24802a = b10;
        this.f24803b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bn) {
            bn bnVar = (bn) obj;
            return this.f24802a == bnVar.f24802a && this.f24803b.equals(bnVar.f24803b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24802a * 31) + this.f24803b.hashCode();
    }
}
