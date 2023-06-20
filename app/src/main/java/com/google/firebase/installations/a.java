package com.google.firebase.installations;

import com.google.firebase.installations.g;
import java.util.Objects;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes3.dex */
final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final String f23378a;

    /* renamed from: b  reason: collision with root package name */
    private final long f23379b;

    /* renamed from: c  reason: collision with root package name */
    private final long f23380c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* loaded from: classes3.dex */
    static final class b extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private String f23381a;

        /* renamed from: b  reason: collision with root package name */
        private Long f23382b;

        /* renamed from: c  reason: collision with root package name */
        private Long f23383c;

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f23381a == null) {
                str = " token";
            }
            if (this.f23382b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f23383c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f23381a, this.f23382b.longValue(), this.f23383c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f23381a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f23383c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f23382b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f23378a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f23380c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f23379b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f23378a.equals(gVar.b()) && this.f23379b == gVar.d() && this.f23380c == gVar.c();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f23379b;
        long j11 = this.f23380c;
        return ((((this.f23378a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f23378a + ", tokenExpirationTimestamp=" + this.f23379b + ", tokenCreationTimestamp=" + this.f23380c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f23378a = str;
        this.f23379b = j10;
        this.f23380c = j11;
    }
}
