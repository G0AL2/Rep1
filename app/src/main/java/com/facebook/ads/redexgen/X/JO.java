package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class JO implements ServiceConnection {
    public static byte[] A01;
    public static String[] A02 = {"gCE7yAWhZ11POJo", "8eM0H3liKB3nGBy13JLbaheObXzockOS", "SrGYKC1xYV5SoIQD7ZF53usJTscK0ftd", "oLip1OJDGHIgZvy2QUOX9qyG369fMg", "6uZfg75M38niEnOd8qY5oGvuLo0AhuLi", "uWwQwstOxxQOEnZtY9gGQbDlT6RzLRhG", "9XdBRAedcNLeI9uVxDe6AZ6PBdWknMtH", "4BOwR4x4EiTbHLOE844U0c6wT73UImO8"};
    public final /* synthetic */ JP A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, 22, 35, 39, 26, 20, 22, -47, 20, 32, 31, 31, 22, 20, 37, 22, 21, -23, -5, 8, 12, -1, -7, -5, -74, -6, -1, 9, -7, 5, 4, 4, -5, -7, 10, -5, -6};
    }

    static {
        A01();
    }

    public JO(JP jp) {
        this.A00 = jp;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Bundle A00;
        C1400Xy c1400Xy;
        Messenger messenger;
        this.A00.A08(C07828z.A1q, new AnonymousClass90(A00(0, 17, 51)));
        this.A00.A01 = true;
        this.A00.A00 = new Messenger(iBinder);
        Message obtain = Message.obtain((Handler) null, 1);
        A00 = this.A00.A00();
        obtain.setData(A00);
        try {
            messenger = this.A00.A00;
            messenger.send(obtain);
        } catch (RemoteException e10) {
            this.A00.A07(C07828z.A1p, new AnonymousClass90(e10));
        }
        c1400Xy = this.A00.A03;
        c1400Xy.unbindService(this);
        String[] strArr = A02;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "6rYpepdvoTPI6QzkC6GFRKhQTPWG03vn";
        strArr2[2] = "LXAj3j5RTtl8LiKDcCRVk7kWTLRj4LCr";
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1400Xy c1400Xy;
        this.A00.A08(C07828z.A1r, new AnonymousClass90(A00(17, 20, 24)));
        try {
            c1400Xy = this.A00.A03;
            c1400Xy.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.A00.A00 = null;
        this.A00.A01 = false;
    }
}
