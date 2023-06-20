package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1418Yq implements InterfaceC07386v {
    public static byte[] A01;
    public static String[] A02 = {"DYzZ33D", "FX", "1OACtFyT458udh1Nq8LtT5hKAntFdlV0", "NREy1eS", "YXbhfnB1JeAOpwzc7R5F4UgUcnERyrlo", "CB", "UiK58QgaQ3DZSY0y2Dj7Y4rAezwTtVBd", "ZsDGmeWwG8AfDaZfTpPswbVEo9CgGFmV"};
    public final /* synthetic */ C1416Yo A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{49, 39, 44, 49, 45, 48};
    }

    static {
        A01();
    }

    public C1418Yq(C1416Yo c1416Yo) {
        this.A00 = c1416Yo;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws Exception {
        Context context;
        C1416Yo c1416Yo = this.A00;
        context = c1416Yo.A01;
        c1416Yo.A00 = (SensorManager) context.getSystemService(A00(0, 6, 57));
        if (Build.VERSION.SDK_INT < 20) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        C1416Yo c1416Yo2 = this.A00;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "Uf";
        strArr2[1] = "fm";
        if (c1416Yo2.A00 == null) {
            return this.A00.A07(AnonymousClass76.A07);
        }
        List<Sensor> sensorList = this.A00.A00.getSensorList(-1);
        ArrayList arrayList = new ArrayList();
        for (Sensor sensor : sensorList) {
            arrayList.add(new C1417Yp(sensor));
        }
        return this.A00.A0D(arrayList);
    }
}
