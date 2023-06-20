package com.bytedance.sdk.openadsdk.core.e;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.b.c;
import org.json.JSONObject;

/* compiled from: DynamicClickInfo.java */
/* loaded from: classes.dex */
public class j implements com.bytedance.sdk.component.adexpress.b {

    /* renamed from: a  reason: collision with root package name */
    public final float f12082a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12083b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12084c;

    /* renamed from: d  reason: collision with root package name */
    public final float f12085d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12086e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12087f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12088g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12089h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12090i;

    /* renamed from: j  reason: collision with root package name */
    public final int f12091j;

    /* renamed from: k  reason: collision with root package name */
    public final String f12092k;

    /* renamed from: l  reason: collision with root package name */
    public int f12093l;

    /* renamed from: m  reason: collision with root package name */
    public JSONObject f12094m;

    /* renamed from: n  reason: collision with root package name */
    public SparseArray<c.a> f12095n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f12096o;

    /* renamed from: p  reason: collision with root package name */
    public int f12097p;

    /* compiled from: DynamicClickInfo.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected SparseArray<c.a> f12098a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private long f12099b;

        /* renamed from: c  reason: collision with root package name */
        private long f12100c;

        /* renamed from: d  reason: collision with root package name */
        private float f12101d;

        /* renamed from: e  reason: collision with root package name */
        private float f12102e;

        /* renamed from: f  reason: collision with root package name */
        private float f12103f;

        /* renamed from: g  reason: collision with root package name */
        private float f12104g;

        /* renamed from: h  reason: collision with root package name */
        private int f12105h;

        /* renamed from: i  reason: collision with root package name */
        private int f12106i;

        /* renamed from: j  reason: collision with root package name */
        private int f12107j;

        /* renamed from: k  reason: collision with root package name */
        private int f12108k;

        /* renamed from: l  reason: collision with root package name */
        private String f12109l;

        /* renamed from: m  reason: collision with root package name */
        private int f12110m;

        /* renamed from: n  reason: collision with root package name */
        private JSONObject f12111n;

        /* renamed from: o  reason: collision with root package name */
        private int f12112o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f12113p;

        public a a(int i10) {
            this.f12112o = i10;
            return this;
        }

        public a b(int i10) {
            this.f12110m = i10;
            return this;
        }

        public a c(float f10) {
            this.f12103f = f10;
            return this;
        }

        public a d(float f10) {
            this.f12104g = f10;
            return this;
        }

        public a e(int i10) {
            this.f12107j = i10;
            return this;
        }

        public a f(int i10) {
            this.f12108k = i10;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.f12111n = jSONObject;
            return this;
        }

        public a b(long j10) {
            this.f12100c = j10;
            return this;
        }

        public a c(int i10) {
            this.f12105h = i10;
            return this;
        }

        public a d(int i10) {
            this.f12106i = i10;
            return this;
        }

        public a a(boolean z10) {
            this.f12113p = z10;
            return this;
        }

        public a b(float f10) {
            this.f12102e = f10;
            return this;
        }

        public a a(long j10) {
            this.f12099b = j10;
            return this;
        }

        public a a(float f10) {
            this.f12101d = f10;
            return this;
        }

        public a a(String str) {
            this.f12109l = str;
            return this;
        }

        public a a(SparseArray<c.a> sparseArray) {
            this.f12098a = sparseArray;
            return this;
        }

        public j a() {
            return new j(this);
        }
    }

    private j(a aVar) {
        this.f12082a = aVar.f12104g;
        this.f12083b = aVar.f12103f;
        this.f12084c = aVar.f12102e;
        this.f12085d = aVar.f12101d;
        this.f12086e = aVar.f12100c;
        this.f12087f = aVar.f12099b;
        this.f12088g = aVar.f12105h;
        this.f12089h = aVar.f12106i;
        this.f12090i = aVar.f12107j;
        this.f12091j = aVar.f12108k;
        this.f12092k = aVar.f12109l;
        this.f12095n = aVar.f12098a;
        this.f12096o = aVar.f12113p;
        this.f12093l = aVar.f12110m;
        this.f12094m = aVar.f12111n;
        this.f12097p = aVar.f12112o;
    }
}
