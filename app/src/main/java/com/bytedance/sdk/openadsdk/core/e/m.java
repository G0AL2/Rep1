package com.bytedance.sdk.openadsdk.core.e;

/* compiled from: LoadingInfo.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private long f12157a = 10000;

    /* renamed from: b  reason: collision with root package name */
    private long f12158b = 10000;

    /* renamed from: c  reason: collision with root package name */
    private String f12159c = "";

    public long a() {
        return this.f12157a;
    }

    public long b() {
        return this.f12158b;
    }

    public String c() {
        return this.f12159c;
    }

    public void a(long j10) {
        if (j10 <= 0) {
            this.f12157a = 10L;
        } else {
            this.f12157a = j10;
        }
    }

    public void b(long j10) {
        if (j10 < 0) {
            this.f12158b = 20L;
        } else {
            this.f12158b = j10;
        }
    }

    public void a(String str) {
        this.f12159c = str;
    }
}
