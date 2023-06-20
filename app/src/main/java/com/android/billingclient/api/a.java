package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    /* renamed from: com.android.billingclient.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0102a {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f6012a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f6013b;

        /* renamed from: c  reason: collision with root package name */
        private volatile o2.h f6014c;

        /* synthetic */ C0102a(Context context, o2.v vVar) {
            this.f6013b = context;
        }

        public a a() {
            if (this.f6013b != null) {
                if (this.f6014c != null) {
                    if (this.f6012a) {
                        if (this.f6014c != null) {
                            return new b(null, this.f6012a, this.f6013b, this.f6014c, null);
                        }
                        return new b(null, this.f6012a, this.f6013b, null);
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public C0102a b() {
            this.f6012a = true;
            return this;
        }

        public C0102a c(o2.h hVar) {
            this.f6014c = hVar;
            return this;
        }
    }

    public static C0102a e(Context context) {
        return new C0102a(context, null);
    }

    public abstract void a(o2.a aVar, o2.b bVar);

    public abstract void b();

    public abstract boolean c();

    public abstract e d(Activity activity, c cVar);

    public abstract void f(String str, o2.g gVar);

    public abstract void g(f fVar, o2.i iVar);

    public abstract void h(o2.c cVar);
}
