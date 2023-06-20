package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.e;
import java.util.Objects;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes2.dex */
final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f20993a;

    /* renamed from: b  reason: collision with root package name */
    private final long f20994b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(e.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f20993a = aVar;
        this.f20994b = j10;
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    public long b() {
        return this.f20994b;
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    public e.a c() {
        return this.f20993a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f20993a.equals(eVar.c()) && this.f20994b == eVar.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f20994b;
        return ((this.f20993a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f20993a + ", nextRequestWaitMillis=" + this.f20994b + "}";
    }
}
