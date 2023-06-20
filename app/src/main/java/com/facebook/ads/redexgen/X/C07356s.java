package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.6s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07356s {
    public final int A00;
    public final InterfaceC07386v A01;
    public final EnumSet<EnumC07426z> A02;

    public C07356s(int i10, EnumSet<EnumC07426z> enumSet, InterfaceC07386v interfaceC07386v) {
        this.A00 = i10;
        this.A02 = enumSet;
        this.A01 = interfaceC07386v;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC07386v A01() {
        if (this.A02.contains(EnumC07426z.A07)) {
            return this.A01;
        }
        return null;
    }

    @Nullable
    public final InterfaceC07386v A02(EnumC07396w enumC07396w) {
        if (A04(enumC07396w)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC07426z> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC07396w enumC07396w) {
        return C7J.A0E(enumC07396w) && this.A02.contains(EnumC07426z.A00(enumC07396w.A03()));
    }
}
