package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<AppLovinAdImpl> f8962a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private final Object f8963b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int size;
        synchronized (this.f8963b) {
            size = this.f8962a.size();
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8963b) {
            if (a() <= 25) {
                this.f8962a.offer(appLovinAdImpl);
            } else if (v.a()) {
                v.i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    boolean b() {
        boolean z10;
        synchronized (this.f8963b) {
            z10 = a() == 0;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdImpl c() {
        AppLovinAdImpl poll;
        synchronized (this.f8963b) {
            poll = !b() ? this.f8962a.poll() : null;
        }
        return poll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLovinAdImpl d() {
        AppLovinAdImpl peek;
        synchronized (this.f8963b) {
            peek = this.f8962a.peek();
        }
        return peek;
    }
}
