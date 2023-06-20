package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothAdapter;

/* renamed from: com.facebook.ads.redexgen.X.aC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1466aC implements InterfaceC07386v {
    public final /* synthetic */ C1462a8 A00;

    public C1466aC(C1462a8 c1462a8) {
        this.A00 = c1462a8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter != null) {
            C1462a8 c1462a8 = this.A00;
            bluetoothAdapter2 = c1462a8.A00;
            return c1462a8.A08(bluetoothAdapter2.getAddress());
        }
        return this.A00.A07(AnonymousClass76.A06);
    }
}
