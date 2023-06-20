package com.inmobi.media;

/* compiled from: RuleKey.java */
/* loaded from: classes3.dex */
public final class io {

    /* renamed from: a  reason: collision with root package name */
    private String f25780a;

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f25781b;

    public io(String str, Class<?> cls) {
        this.f25780a = str;
        this.f25781b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof io) {
            io ioVar = (io) obj;
            if (this.f25780a.equals(ioVar.f25780a) && this.f25781b == ioVar.f25781b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25780a.hashCode() + this.f25781b.getName().hashCode();
    }
}
