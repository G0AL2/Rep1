package com.airbnb.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class j0<V> {

    /* renamed from: a  reason: collision with root package name */
    private final V f5831a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f5832b;

    public j0(V v10) {
        this.f5831a = v10;
        this.f5832b = null;
    }

    public Throwable a() {
        return this.f5832b;
    }

    public V b() {
        return this.f5831a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (b() == null || !b().equals(j0Var.b())) {
                if (a() == null || j0Var.a() == null) {
                    return false;
                }
                return a().toString().equals(a().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public j0(Throwable th) {
        this.f5832b = th;
        this.f5831a = null;
    }
}
