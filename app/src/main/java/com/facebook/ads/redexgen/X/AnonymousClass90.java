package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.90  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass90 extends Exception {
    public int A00;
    public int A01;
    @Nullable
    public JSONObject A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public AnonymousClass90(String str) {
        super(str);
        this.A00 = 0;
        this.A05 = true;
        this.A04 = true;
        this.A03 = false;
        this.A01 = -1;
    }

    public AnonymousClass90(String str, String str2) {
        super(str + '\n' + str2);
        this.A00 = 0;
        this.A05 = true;
        this.A04 = true;
        this.A03 = false;
        this.A01 = -1;
    }

    public AnonymousClass90(Throwable th) {
        super(th);
        this.A00 = 0;
        this.A05 = true;
        this.A04 = true;
        this.A03 = false;
        this.A01 = -1;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    @Nullable
    public final JSONObject A02() {
        return this.A02;
    }

    public final void A03(int i10) {
        this.A00 = i10;
    }

    public final void A04(int i10) {
        this.A01 = i10;
    }

    public final void A05(@Nullable JSONObject jSONObject) {
        this.A02 = jSONObject;
    }

    public final void A06(boolean z10) {
        this.A04 = z10;
    }

    public final void A07(boolean z10) {
        this.A03 = z10;
    }

    public final void A08(boolean z10) {
        this.A05 = z10;
    }

    public final boolean A09() {
        return this.A04;
    }

    public final boolean A0A() {
        return this.A03;
    }

    public final boolean A0B() {
        return this.A05;
    }
}
