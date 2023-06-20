package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.aA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1464aA implements InterfaceC07386v {
    public final /* synthetic */ C1462a8 A00;

    public C1464aA(C1462a8 c1462a8) {
        this.A00 = c1462a8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws Exception {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter != null) {
            bluetoothAdapter2 = this.A00.A00;
            ArrayList arrayList = new ArrayList();
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter2.getBondedDevices()) {
                arrayList.add(new C1463a9(bluetoothDevice));
            }
            return this.A00.A0D(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A06);
    }
}
