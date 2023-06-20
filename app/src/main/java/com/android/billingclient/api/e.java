package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private int f6051a;

    /* renamed from: b  reason: collision with root package name */
    private String f6052b;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f6053a;

        /* renamed from: b  reason: collision with root package name */
        private String f6054b = "";

        /* synthetic */ a(o2.n nVar) {
        }

        public e a() {
            e eVar = new e();
            eVar.f6051a = this.f6053a;
            eVar.f6052b = this.f6054b;
            return eVar;
        }

        public a b(String str) {
            this.f6054b = str;
            return this;
        }

        public a c(int i10) {
            this.f6053a = i10;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f6052b;
    }

    public int b() {
        return this.f6051a;
    }

    public String toString() {
        String zzk = zzb.zzk(this.f6051a);
        String str = this.f6052b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzk).length() + 32 + String.valueOf(str).length());
        sb2.append("Response Code: ");
        sb2.append(zzk);
        sb2.append(", Debug Message: ");
        sb2.append(str);
        return sb2.toString();
    }
}
