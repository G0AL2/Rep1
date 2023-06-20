package com.applovin.impl.sdk.e;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f8348a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.applovin.impl.sdk.m f8349b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f8350c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f8351d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8352e;

    public a(String str, com.applovin.impl.sdk.m mVar) {
        this(str, mVar, false);
    }

    public a(String str, com.applovin.impl.sdk.m mVar, boolean z10) {
        this.f8348a = str;
        this.f8349b = mVar;
        this.f8350c = mVar.A();
        this.f8351d = mVar.L();
        this.f8352e = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        this.f8350c.b(this.f8348a, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Throwable th) {
        this.f8350c.b(this.f8348a, str, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str) {
        this.f8350c.c(this.f8348a, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        this.f8350c.d(this.f8348a, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.applovin.impl.sdk.m d() {
        return this.f8349b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        this.f8350c.e(this.f8348a, str);
    }

    public String e() {
        return this.f8348a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context f() {
        return this.f8351d;
    }

    public boolean g() {
        return this.f8352e;
    }
}
