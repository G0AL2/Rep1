package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private String f6055a;

    /* renamed from: b  reason: collision with root package name */
    private List f6056b;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f6057a;

        /* renamed from: b  reason: collision with root package name */
        private List f6058b;

        /* synthetic */ a(o2.p pVar) {
        }

        public f a() {
            String str = this.f6057a;
            if (str != null) {
                if (this.f6058b != null) {
                    f fVar = new f();
                    fVar.f6055a = str;
                    fVar.f6056b = this.f6058b;
                    return fVar;
                }
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
            throw new IllegalArgumentException("SKU type must be set");
        }

        public a b(List<String> list) {
            this.f6058b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.f6057a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f6055a;
    }

    public List<String> b() {
        return this.f6056b;
    }
}
