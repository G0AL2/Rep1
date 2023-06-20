package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.c;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i<T> extends c {

    /* renamed from: a  reason: collision with root package name */
    private String f8747a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8748b;

    /* loaded from: classes.dex */
    public static class a<T> extends c.a<T> {

        /* renamed from: o  reason: collision with root package name */
        private String f8749o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f8750p;

        public a(m mVar) {
            super(mVar);
            this.f8665h = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cI)).intValue();
            this.f8666i = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cH)).intValue();
            this.f8667j = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cN)).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a a(Object obj) {
            return b((a<T>) obj);
        }

        public a b(T t10) {
            this.f8664g = t10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: b */
        public a a(JSONObject jSONObject) {
            this.f8663f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: b */
        public i<T> a() {
            return new i<>(this);
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: c */
        public a a(Map<String, String> map) {
            this.f8661d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a a(int i10) {
            this.f8665h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a a(String str) {
            this.f8659b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: d */
        public a b(Map<String, String> map) {
            this.f8662e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e */
        public a b(int i10) {
            this.f8666i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e */
        public a c(String str) {
            this.f8660c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: e */
        public a c(boolean z10) {
            this.f8670m = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f */
        public a c(int i10) {
            this.f8667j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f */
        public a b(String str) {
            this.f8658a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* renamed from: f */
        public a d(boolean z10) {
            this.f8671n = z10;
            return this;
        }

        public a g(String str) {
            this.f8749o = str;
            return this;
        }

        public a g(boolean z10) {
            this.f8750p = z10;
            return this;
        }
    }

    protected i(a aVar) {
        super(aVar);
        this.f8747a = aVar.f8749o;
        this.f8748b = aVar.f8750p;
    }

    public static a b(m mVar) {
        return new a(mVar);
    }

    public boolean p() {
        return this.f8747a != null;
    }

    public String q() {
        return this.f8747a;
    }

    public boolean r() {
        return this.f8748b;
    }
}
