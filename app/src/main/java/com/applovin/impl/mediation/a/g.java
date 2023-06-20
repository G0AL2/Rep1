package com.applovin.impl.mediation.a;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final h f7223a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7224b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7225c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7226d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7227e;

    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);
    }

    private g(h hVar, com.applovin.impl.mediation.g gVar, String str, String str2) {
        String str3;
        this.f7223a = hVar;
        this.f7226d = str;
        this.f7227e = str2;
        if (gVar != null) {
            this.f7224b = gVar.h();
            str3 = gVar.i();
        } else {
            str3 = null;
            this.f7224b = null;
        }
        this.f7225c = str3;
    }

    public static g a(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar != null) {
            if (gVar != null) {
                return new g(hVar, gVar, str, null);
            }
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static g a(h hVar, String str) {
        return b(hVar, null, str);
    }

    public static g b(h hVar, com.applovin.impl.mediation.g gVar, String str) {
        if (hVar != null) {
            return new g(hVar, gVar, null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public h a() {
        return this.f7223a;
    }

    public String b() {
        return this.f7224b;
    }

    public String c() {
        return this.f7225c;
    }

    public String d() {
        return this.f7226d;
    }

    public String e() {
        return this.f7227e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f7223a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f7224b);
        sb2.append('\'');
        sb2.append(", mAdapterVersion='");
        sb2.append(this.f7225c);
        sb2.append('\'');
        sb2.append(", mSignalDataLength='");
        String str = this.f7226d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append('\'');
        sb2.append(", mErrorMessage=");
        sb2.append(this.f7227e);
        sb2.append('}');
        return sb2.toString();
    }
}
