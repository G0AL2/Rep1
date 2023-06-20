package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigInfoImpl.java */
/* loaded from: classes3.dex */
public class p implements dd.n {

    /* renamed from: a  reason: collision with root package name */
    private final long f23693a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23694b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.remoteconfig.b f23695c;

    /* compiled from: FirebaseRemoteConfigInfoImpl.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f23696a;

        /* renamed from: b  reason: collision with root package name */
        private int f23697b;

        /* renamed from: c  reason: collision with root package name */
        private com.google.firebase.remoteconfig.b f23698c;

        public p a() {
            return new p(this.f23696a, this.f23697b, this.f23698c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(com.google.firebase.remoteconfig.b bVar) {
            this.f23698c = bVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(int i10) {
            this.f23697b = i10;
            return this;
        }

        public b d(long j10) {
            this.f23696a = j10;
            return this;
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b d() {
        return new b();
    }

    @Override // dd.n
    public long a() {
        return this.f23693a;
    }

    @Override // dd.n
    public com.google.firebase.remoteconfig.b b() {
        return this.f23695c;
    }

    @Override // dd.n
    public int c() {
        return this.f23694b;
    }

    private p(long j10, int i10, com.google.firebase.remoteconfig.b bVar) {
        this.f23693a = j10;
        this.f23694b = i10;
        this.f23695c = bVar;
    }
}
