package com.ironsource.mediationsdk.utils;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27404a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27405b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f27406c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27407d;

    public b() {
        this(false, null, false, false, 15);
    }

    public b(boolean z10, String str, boolean z11, boolean z12) {
        qe.k.f(str, "externalArmEventsUrl");
        this.f27404a = z10;
        this.f27405b = str;
        this.f27406c = z11;
        this.f27407d = z12;
    }

    private /* synthetic */ b(boolean z10, String str, boolean z11, boolean z12, int i10) {
        this(true, "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData", true, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f27404a == bVar.f27404a && qe.k.a(this.f27405b, bVar.f27405b) && this.f27406c == bVar.f27406c && this.f27407d == bVar.f27407d;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f27404a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        String str = this.f27405b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        ?? r22 = this.f27406c;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z11 = this.f27407d;
        return i12 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        return "ApplicationGeneralSettings(isExternalArmEventsEnabled=" + this.f27404a + ", externalArmEventsUrl=" + this.f27405b + ", shouldUseAppSet=" + this.f27406c + ", shouldReuseAdvId=" + this.f27407d + ")";
    }
}
