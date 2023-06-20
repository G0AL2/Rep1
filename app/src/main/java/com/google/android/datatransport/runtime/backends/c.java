package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import java.util.Objects;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes2.dex */
final class c extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20995a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a f20996b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a f20997c;

    /* renamed from: d  reason: collision with root package name */
    private final String f20998d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, h8.a aVar, h8.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f20995a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f20996b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f20997c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f20998d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public Context b() {
        return this.f20995a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public String c() {
        return this.f20998d;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public h8.a d() {
        return this.f20997c;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public h8.a e() {
        return this.f20996b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f20995a.equals(fVar.b()) && this.f20996b.equals(fVar.e()) && this.f20997c.equals(fVar.d()) && this.f20998d.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f20995a.hashCode() ^ 1000003) * 1000003) ^ this.f20996b.hashCode()) * 1000003) ^ this.f20997c.hashCode()) * 1000003) ^ this.f20998d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f20995a + ", wallClock=" + this.f20996b + ", monotonicClock=" + this.f20997c + ", backendName=" + this.f20998d + "}";
    }
}
