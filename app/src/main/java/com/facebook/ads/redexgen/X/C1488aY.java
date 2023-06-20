package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.aY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1488aY extends C07296m {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C6C A02;
    public final C7F A03;

    public C1488aY(Context context, C6C c6c) {
        super(context, c6c);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c6c;
        this.A03 = C7F.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A05(HashMap<Integer, C1489aZ> hashMap) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A06);
    }

    public final InterfaceC07386v A0G() {
        return new C1499aj(this);
    }

    public final InterfaceC07386v A0H() {
        return new C1501al(this);
    }

    public final InterfaceC07386v A0I() {
        return new C1502am(this);
    }

    public final InterfaceC07386v A0J() {
        return new C1506aq(this);
    }

    public final InterfaceC07386v A0K() {
        return new C1494ae(this);
    }

    public final InterfaceC07386v A0L() {
        return new C1491ab(this);
    }

    public final InterfaceC07386v A0M() {
        return new C1498ai(this);
    }

    public final InterfaceC07386v A0N() {
        return new C1497ah(this);
    }

    public final InterfaceC07386v A0O() {
        return new C1493ad(this);
    }

    public final InterfaceC07386v A0P() {
        return new C1490aa(this);
    }

    public final InterfaceC07386v A0Q() {
        return new C1492ac(this);
    }

    public final InterfaceC07386v A0R() {
        return new C1495af(this);
    }

    public final InterfaceC07386v A0S() {
        return new C1496ag(this);
    }

    public final InterfaceC07386v A0T() {
        return new C1508as(this);
    }

    public final InterfaceC07386v A0U() {
        return new C1507ar(this);
    }

    public final InterfaceC07386v A0V() {
        return new C1505ap(this);
    }

    public final InterfaceC07386v A0W() {
        return new C1504ao(this);
    }

    public final InterfaceC07386v A0X() {
        return new C1503an(this);
    }

    public final InterfaceC07386v A0Y() {
        return new C1500ak(this);
    }
}
