package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.j;

/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final long f23607a;

    /* renamed from: b  reason: collision with root package name */
    private final long f23608b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    /* renamed from: com.google.firebase.remoteconfig.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0309b {

        /* renamed from: a  reason: collision with root package name */
        private long f23609a = 60;

        /* renamed from: b  reason: collision with root package name */
        private long f23610b = j.f23662j;

        public b c() {
            return new b(this);
        }

        public C0309b d(long j10) throws IllegalArgumentException {
            if (j10 >= 0) {
                this.f23609a = j10;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
        }

        public C0309b e(long j10) {
            if (j10 >= 0) {
                this.f23610b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f23607a;
    }

    public long b() {
        return this.f23608b;
    }

    private b(C0309b c0309b) {
        this.f23607a = c0309b.f23609a;
        this.f23608b = c0309b.f23610b;
    }
}
