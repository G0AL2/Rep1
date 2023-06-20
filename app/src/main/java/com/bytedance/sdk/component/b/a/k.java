package com.bytedance.sdk.component.b.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public i f10072a;

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.sdk.component.b.a.a f10073a;

        /* renamed from: b  reason: collision with root package name */
        Map<String, List<String>> f10074b;

        /* renamed from: c  reason: collision with root package name */
        f f10075c;

        /* renamed from: d  reason: collision with root package name */
        String f10076d;

        /* renamed from: e  reason: collision with root package name */
        Object f10077e;

        /* renamed from: f  reason: collision with root package name */
        l f10078f;

        public a() {
            this.f10074b = new HashMap();
        }

        public a a(com.bytedance.sdk.component.b.a.a aVar) {
            this.f10073a = aVar;
            return this;
        }

        public a b(String str, String str2) {
            if (!this.f10074b.containsKey(str)) {
                this.f10074b.put(str, new ArrayList());
            }
            this.f10074b.get(str).add(str2);
            return this;
        }

        public a a(Object obj) {
            this.f10077e = obj;
            return this;
        }

        a(k kVar) {
            this.f10075c = kVar.b();
            this.f10076d = kVar.c();
            this.f10074b = kVar.d();
            this.f10077e = kVar.a();
            this.f10078f = kVar.f();
            this.f10073a = kVar.e();
        }

        public a a(String str) {
            return a(f.c(str));
        }

        public a a(f fVar) {
            this.f10075c = fVar;
            return this;
        }

        public k b() {
            return new k() { // from class: com.bytedance.sdk.component.b.a.k.a.1
                @Override // com.bytedance.sdk.component.b.a.k
                public Object a() {
                    return a.this.f10077e;
                }

                @Override // com.bytedance.sdk.component.b.a.k
                public f b() {
                    return a.this.f10075c;
                }

                @Override // com.bytedance.sdk.component.b.a.k
                public String c() {
                    return a.this.f10076d;
                }

                @Override // com.bytedance.sdk.component.b.a.k
                public Map d() {
                    return a.this.f10074b;
                }

                @Override // com.bytedance.sdk.component.b.a.k
                public com.bytedance.sdk.component.b.a.a e() {
                    return a.this.f10073a;
                }

                @Override // com.bytedance.sdk.component.b.a.k
                public l f() {
                    return a.this.f10078f;
                }

                public String toString() {
                    return "";
                }
            };
        }

        public a a(String str, String str2) {
            return b(str, str2);
        }

        public a a() {
            return a("GET", (l) null);
        }

        private a a(String str, l lVar) {
            this.f10076d = str;
            this.f10078f = lVar;
            return this;
        }

        public a a(l lVar) {
            return a("POST", lVar);
        }
    }

    public abstract Object a();

    public void a(i iVar) {
        this.f10072a = iVar;
    }

    public abstract f b();

    public abstract String c();

    public abstract Map<String, List<String>> d();

    public abstract com.bytedance.sdk.component.b.a.a e();

    public l f() {
        return null;
    }

    public a g() {
        return new a(this);
    }
}
