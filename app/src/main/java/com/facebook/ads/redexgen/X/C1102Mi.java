package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Mi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1102Mi implements SensorEventListener {
    public static byte[] A0A;
    public long A04;
    public long A05;
    public long A06;
    @Nullable
    public SensorManager A07;
    public final C1400Xy A08;
    public int A03 = 0;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public final Set<InterfaceC1101Mh> A09 = new CopyOnWriteArraySet();

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{119, 65, 74, 87, 75, 86, 87, 4, 74, 75, 80, 4, 87, 81, 84, 84, 75, 86, 80, 65, 64, 17, 42, 35, 41, 43, 44, 37, 98, 44, 45, 54, 98, 49, 55, 50, 50, 45, 48, 54, 39, 38, 21, 3, 8, 21, 9, 20};
    }

    public C1102Mi(C1400Xy c1400Xy) {
        this.A08 = c1400Xy;
    }

    private void A01() {
        SensorManager sensorManager;
        this.A07 = (SensorManager) this.A08.getSystemService(A00(42, 6, 41));
        if (this.A07 == null) {
            Toast.makeText(this.A08, A00(0, 21, 107), 1).show();
        }
        boolean z10 = false;
        try {
            z10 = this.A07.registerListener(this, this.A07.getDefaultSensor(1), 3);
        } catch (Exception unused) {
            Toast.makeText(this.A08, A00(21, 21, 13), 1).show();
        }
        if (!z10 && (sensorManager = this.A07) != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public final void A03(InterfaceC1101Mh interfaceC1101Mh) {
        if (this.A09.isEmpty()) {
            A01();
        } else if (this.A09.contains(interfaceC1101Mh)) {
            return;
        }
        this.A09.add(interfaceC1101Mh);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long now = this.A04;
        if (elapsedRealtime - now > 500) {
            this.A03 = 0;
        }
        long j10 = this.A06;
        if (elapsedRealtime - j10 > 100) {
            long now2 = elapsedRealtime - j10;
            float speed = (Math.abs(((((sensorEvent.values[0] + sensorEvent.values[1]) + sensorEvent.values[2]) - this.A00) - this.A01) - this.A02) / ((float) now2)) * 10000.0f;
            if (speed > 800.0f) {
                int i10 = this.A03 + 1;
                this.A03 = i10;
                if (i10 >= 3) {
                    long now3 = this.A05;
                    if (elapsedRealtime - now3 > 1000) {
                        this.A05 = elapsedRealtime;
                        this.A03 = 0;
                        for (InterfaceC1101Mh interfaceC1101Mh : this.A09) {
                            interfaceC1101Mh.ACJ();
                        }
                    }
                }
                this.A04 = elapsedRealtime;
            }
            this.A06 = elapsedRealtime;
            this.A00 = sensorEvent.values[0];
            this.A01 = sensorEvent.values[1];
            this.A02 = sensorEvent.values[2];
        }
    }
}
