package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    public int f20323a;

    /* renamed from: b  reason: collision with root package name */
    public int f20324b;

    public q0(int i10, int i11) {
        this.f20323a = i10;
        this.f20324b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f20323a == q0Var.f20323a && this.f20324b == q0Var.f20324b;
    }

    public int hashCode() {
        return (this.f20323a * 31) + this.f20324b;
    }
}
