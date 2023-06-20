package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.eV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1721eV<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    @Nullable
    public List<InterfaceC1723eX<ModelType, StateType>> A01 = null;
    public C1720eU A00 = C1720eU.A06;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1721eV(ModelType modeltype, StateType statetype, String str) {
        this.A02 = modeltype;
        this.A03 = statetype;
        this.A04 = str;
    }

    public static /* synthetic */ C1720eU A00(C1721eV c1721eV) {
        return c1721eV.A00;
    }

    public static /* synthetic */ Object A01(C1721eV c1721eV) {
        return c1721eV.A02;
    }

    public static /* synthetic */ Object A02(C1721eV c1721eV) {
        return c1721eV.A03;
    }

    public static /* synthetic */ String A03(C1721eV c1721eV) {
        return c1721eV.A04;
    }

    public static /* synthetic */ List A04(C1721eV c1721eV) {
        return c1721eV.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eX != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1721eV<ModelType, StateType> A05(InterfaceC1723eX<ModelType, StateType> interfaceC1723eX) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1723eX);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1720eU<ModelType, StateType> A06() {
        return new C1720eU<>(this);
    }
}
