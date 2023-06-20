package com.bytedance.sdk.component.a;

import android.text.TextUtils;

/* compiled from: Js2JavaCall.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f9260a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9261b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9262c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9263d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9264e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9265f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9266g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9267h;

    /* compiled from: Js2JavaCall.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f9268a;

        /* renamed from: b  reason: collision with root package name */
        private String f9269b;

        /* renamed from: c  reason: collision with root package name */
        private String f9270c;

        /* renamed from: d  reason: collision with root package name */
        private String f9271d;

        /* renamed from: e  reason: collision with root package name */
        private String f9272e;

        /* renamed from: f  reason: collision with root package name */
        private String f9273f;

        /* renamed from: g  reason: collision with root package name */
        private String f9274g;

        private a() {
        }

        public a a(String str) {
            this.f9268a = str;
            return this;
        }

        public a b(String str) {
            this.f9269b = str;
            return this;
        }

        public a c(String str) {
            this.f9270c = str;
            return this;
        }

        public a d(String str) {
            this.f9271d = str;
            return this;
        }

        public a e(String str) {
            this.f9272e = str;
            return this;
        }

        public a f(String str) {
            this.f9273f = str;
            return this;
        }

        public a g(String str) {
            this.f9274g = str;
            return this;
        }

        public q a() {
            return new q(this);
        }
    }

    public static a a() {
        return new a();
    }

    public String toString() {
        return "methodName: " + this.f9263d + ", params: " + this.f9264e + ", callbackId: " + this.f9265f + ", type: " + this.f9262c + ", version: " + this.f9261b + ", ";
    }

    private q(String str, int i10) {
        this.f9261b = null;
        this.f9262c = null;
        this.f9263d = null;
        this.f9264e = null;
        this.f9265f = str;
        this.f9266g = null;
        this.f9260a = i10;
        this.f9267h = null;
    }

    public static q a(String str, int i10) {
        return new q(str, i10);
    }

    public static boolean a(q qVar) {
        return qVar == null || qVar.f9260a != 1 || TextUtils.isEmpty(qVar.f9263d) || TextUtils.isEmpty(qVar.f9264e);
    }

    private q(a aVar) {
        this.f9261b = aVar.f9268a;
        this.f9262c = aVar.f9269b;
        this.f9263d = aVar.f9270c;
        this.f9264e = aVar.f9271d;
        this.f9265f = aVar.f9272e;
        this.f9266g = aVar.f9273f;
        this.f9260a = 1;
        this.f9267h = aVar.f9274g;
    }
}
