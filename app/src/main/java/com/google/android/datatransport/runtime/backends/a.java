package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.d;
import java.util.Arrays;
import java.util.Objects;
import w7.i;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<i> f20989a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f20990b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_BackendRequest.java */
    /* loaded from: classes2.dex */
    public static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<i> f20991a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f20992b;

        @Override // com.google.android.datatransport.runtime.backends.d.a
        public d a() {
            String str = "";
            if (this.f20991a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f20991a, this.f20992b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.d.a
        public d.a b(Iterable<i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f20991a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.d.a
        public d.a c(byte[] bArr) {
            this.f20992b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.d
    public Iterable<i> b() {
        return this.f20989a;
    }

    @Override // com.google.android.datatransport.runtime.backends.d
    public byte[] c() {
        return this.f20990b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f20989a.equals(dVar.b())) {
                if (Arrays.equals(this.f20990b, dVar instanceof a ? ((a) dVar).f20990b : dVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20989a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20990b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f20989a + ", extras=" + Arrays.toString(this.f20990b) + "}";
    }

    private a(Iterable<i> iterable, byte[] bArr) {
        this.f20989a = iterable;
        this.f20990b = bArr;
    }
}
