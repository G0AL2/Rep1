package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6037a;

    /* renamed from: b  reason: collision with root package name */
    private String f6038b;

    /* renamed from: c  reason: collision with root package name */
    private String f6039c;

    /* renamed from: d  reason: collision with root package name */
    private String f6040d;

    /* renamed from: e  reason: collision with root package name */
    private int f6041e = 0;

    /* renamed from: f  reason: collision with root package name */
    private zzu f6042f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f6043g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6044h;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f6045a;

        /* renamed from: b  reason: collision with root package name */
        private String f6046b;

        /* renamed from: c  reason: collision with root package name */
        private String f6047c;

        /* renamed from: d  reason: collision with root package name */
        private int f6048d = 0;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList f6049e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6050f;

        /* synthetic */ a(o2.l lVar) {
        }

        public c a() {
            ArrayList arrayList;
            ArrayList arrayList2 = this.f6049e;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (!this.f6049e.contains(null)) {
                    if (this.f6049e.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.f6049e.get(0);
                        String n10 = skuDetails.n();
                        ArrayList arrayList3 = this.f6049e;
                        int size = arrayList3.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i10);
                            if (!n10.equals("play_pass_subs") && !skuDetails2.n().equals("play_pass_subs") && !n10.equals(skuDetails2.n())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String r10 = skuDetails.r();
                        ArrayList arrayList4 = this.f6049e;
                        int size2 = arrayList4.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i11);
                            if (!n10.equals("play_pass_subs") && !skuDetails3.n().equals("play_pass_subs") && !r10.equals(skuDetails3.r())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                    c cVar = new c(null);
                    cVar.f6037a = !((SkuDetails) this.f6049e.get(0)).r().isEmpty();
                    cVar.f6038b = this.f6045a;
                    cVar.f6040d = this.f6047c;
                    cVar.f6039c = this.f6046b;
                    cVar.f6041e = this.f6048d;
                    ArrayList arrayList5 = this.f6049e;
                    if (arrayList5 != null) {
                        arrayList = new ArrayList(arrayList5);
                    } else {
                        arrayList = new ArrayList();
                    }
                    cVar.f6043g = arrayList;
                    cVar.f6044h = this.f6050f;
                    cVar.f6042f = zzu.zzh();
                    return cVar;
                }
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }

        public a b(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f6049e = arrayList;
            return this;
        }
    }

    /* synthetic */ c(o2.m mVar) {
    }

    public static a b() {
        return new a(null);
    }

    public boolean a() {
        return this.f6044h;
    }

    public final int c() {
        return this.f6041e;
    }

    public final String d() {
        return this.f6038b;
    }

    public final String e() {
        return this.f6040d;
    }

    public final String f() {
        return this.f6039c;
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f6043g);
        return arrayList;
    }

    public final List h() {
        return this.f6042f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return (!this.f6044h && this.f6038b == null && this.f6040d == null && this.f6041e == 0 && !this.f6037a) ? false : true;
    }
}
