package com.ironsource.mediationsdk.utils;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f27466a;

    /* renamed from: b  reason: collision with root package name */
    public String f27467b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27468c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f27469d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f27470e;

    public j() {
        this(false, null, false, null, null, 31);
    }

    private j(boolean z10, String str, boolean z11, int[] iArr, int[] iArr2) {
        qe.k.f(str, "pixelEventsUrl");
        this.f27466a = z10;
        this.f27467b = str;
        this.f27468c = z11;
        this.f27469d = iArr;
        this.f27470e = iArr2;
    }

    private /* synthetic */ j(boolean z10, String str, boolean z11, int[] iArr, int[] iArr2, int i10) {
        this(true, "https://outcome-ssp.supersonicads.com/mediation?adUnit=3", false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                return this.f27466a == jVar.f27466a && qe.k.a(this.f27467b, jVar.f27467b) && this.f27468c == jVar.f27468c && qe.k.a(this.f27469d, jVar.f27469d) && qe.k.a(this.f27470e, jVar.f27470e);
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z10 = this.f27466a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        String str = this.f27467b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z11 = this.f27468c;
        int i11 = (hashCode + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        int[] iArr = this.f27469d;
        int hashCode2 = (i11 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.f27470e;
        return hashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f27466a + ", pixelEventsUrl=" + this.f27467b + ", pixelEventsCompression=" + this.f27468c + ", pixelOptOut=" + Arrays.toString(this.f27469d) + ", pixelOptIn=" + Arrays.toString(this.f27470e) + ")";
    }
}
