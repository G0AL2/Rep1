package com.th3rdwave.safeareacontext;

/* compiled from: Rect.java */
/* loaded from: classes3.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    float f28452a;

    /* renamed from: b  reason: collision with root package name */
    float f28453b;

    /* renamed from: c  reason: collision with root package name */
    float f28454c;

    /* renamed from: d  reason: collision with root package name */
    float f28455d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(float f10, float f11, float f12, float f13) {
        this.f28452a = f10;
        this.f28453b = f11;
        this.f28454c = f12;
        this.f28455d = f13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(c cVar) {
        if (this == cVar) {
            return true;
        }
        return this.f28452a == cVar.f28452a && this.f28453b == cVar.f28453b && this.f28454c == cVar.f28454c && this.f28455d == cVar.f28455d;
    }
}
