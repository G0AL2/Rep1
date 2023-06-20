package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class J5 extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public Handler A00;
    public IU A01;
    @Nullable
    public DummySurface A02;
    @Nullable
    public Error A03;
    @Nullable
    public RuntimeException A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 34);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, 12, 4, 4, 16, -22, 12, 9, -3, -8, -6, -4, 105, -124, -116, -113, -120, -121, 67, -105, -110, 67, -116, -111, -116, -105, -116, -124, -113, -116, -99, -120, 67, -121, -104, -112, -112, -100, 67, -106, -104, -107, -119, -124, -122, -120, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -23, -36, -29, -36, -40, -22, -36, -105, -37, -20, -28, -28, -16, -105, -22, -20, -23, -35, -40, -38, -36, -84, -67, -75, -75, -63, -101, -67, -70, -82, -87, -85, -83};
    }

    public J5() {
        super(A00(77, 12, 38));
    }

    private void A01() {
        IK.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i10) {
        IK.A01(this.A01);
        this.A01.A09(i10);
        this.A02 = new DummySurface(this, this.A01.A07(), i10 != 0);
    }

    public final DummySurface A04(int i10) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new IU(this.A00);
        boolean z10 = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i10, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.A04;
        if (runtimeException == null) {
            Error error = this.A03;
            if (error == null) {
                return (DummySurface) IK.A01(this.A02);
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void A05() {
        IK.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    A01();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                A03(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                Log.e(A00(0, 12, 117), A00(12, 34, 1), e10);
                this.A03 = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                Log.e(A00(0, 12, 117), A00(12, 34, 1), e11);
                this.A04 = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
