package com.ironsource.sdk.controller;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f27708a = a.f27710a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f27709b = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: classes3.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f27710a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f27711b = 2;
    }

    public b(String str) {
    }

    public final synchronized void a() {
        this.f27708a = a.f27711b;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.f27708a != a.f27711b) {
            this.f27709b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final synchronized void b() {
        Object[] array = this.f27709b.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            ((Runnable) array[i10]).run();
            array[i10] = null;
        }
        this.f27709b.clear();
    }
}
