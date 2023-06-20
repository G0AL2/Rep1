package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.InterfaceC0987Hs;
import com.inmobi.media.jh;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Hr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC0986Hr<T extends InterfaceC0987Hs> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;
    @Nullable
    public InterfaceC0985Hq<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C1323Uw A09;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-112, -125, -73, -64, -57, -110, -116, -81, -95, -92, -108, -95, -77, -85, -76, -38, -39, -76, -53, -78, -54, -46, -44, -41, -34, -123, -54, -41, -41, -44, -41, -123, -47, -44, -58, -55, -50, -45, -52, -123, -40, -39, -41, -54, -58, -46, -87, -62, -71, -52, -60, -71, -73, -56, -71, -72, 116, -71, -58, -58, -61, -58, 116, -64, -61, -75, -72, -67, -62, -69, 116, -57, -56, -58, -71, -75, -63, -38, -13, -22, -3, -11, -22, -24, -7, -22, -23, -91, -22, -3, -24, -22, -11, -7, -18, -12, -13, -91, -19, -26, -13, -23, -15, -18, -13, -20, -91, -15, -12, -26, -23, -91, -24, -12, -14, -11, -15, -22, -7, -22, -23, -117, -92, -101, -82, -90, -101, -103, -86, -101, -102, 86, -101, -82, -103, -101, -90, -86, -97, -91, -92, 86, -94, -91, -105, -102, -97, -92, -99, 86, -87, -86, -88, -101, -105, -93, -46, -43, -57, -54, -96, -94, -55, -46, -39, -92};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hs> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public HandlerC0986Hr(C1323Uw c1323Uw, Looper looper, T loadable, InterfaceC0985Hq<T> interfaceC0985Hq, int i10, long j10) {
        super(looper);
        this.A09 = c1323Uw;
        this.A05 = loadable;
        this.A01 = interfaceC0985Hq;
        this.A03 = i10;
        this.A04 = j10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    private void A02() {
        ExecutorService executorService;
        HandlerC0986Hr handlerC0986Hr;
        this.A02 = null;
        executorService = this.A09.A02;
        handlerC0986Hr = this.A09.A00;
        executorService.execute(handlerC0986Hr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public final void A05(int i10) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i10) {
            return;
        }
        throw iOException;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public final void A06(long j10) {
        HandlerC0986Hr handlerC0986Hr;
        handlerC0986Hr = this.A09.A00;
        IK.A04(handlerC0986Hr == null);
        this.A09.A00 = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public final void A07(boolean z10) {
        this.A08 = z10;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A3y();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z10) {
            A03();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.ABF(this.A05, elapsedRealtime, elapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
            } else if (message.what != 4) {
                A03();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.ABF(this.A05, elapsedRealtime, j10, false);
                    return;
                }
                int i10 = message.what;
                if (i10 == 1) {
                    this.A01.ABF(this.A05, elapsedRealtime, j10, false);
                } else if (i10 == 2) {
                    try {
                        this.A01.ABH(this.A05, elapsedRealtime, j10);
                    } catch (RuntimeException e10) {
                        Log.e(A01(6, 8, 48), A01(77, 44, 117), e10);
                        this.A09.A01 = new C0991Hw(e10);
                    }
                } else if (i10 != 3) {
                } else {
                    this.A02 = (IOException) message.obj;
                    int ABI = this.A01.ABI(this.A05, elapsedRealtime, j10, this.A02);
                    if (ABI != 3) {
                        if (ABI == 2) {
                            return;
                        }
                        this.A00 = ABI == 1 ? 1 : this.A00 + 1;
                        A06(A00());
                        return;
                    }
                    this.A09.A01 = this.A02;
                }
            } else {
                throw ((Error) message.obj);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    @Override // java.lang.Runnable
    public final void run() {
        String A01 = A01(6, 8, 48);
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C1017Iw.A02(A01(156, 10, 86) + this.A05.getClass().getSimpleName() + A01(0, 6, 68));
                                try {
                                    this.A05.A8m();
                                } finally {
                                    C1017Iw.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (IOException e10) {
                            if (!this.A08) {
                                obtainMessage(3, e10).sendToTarget();
                            }
                        } catch (Exception e11) {
                            Log.e(A01, A01(121, 35, 38), e11);
                            if (!this.A08) {
                                obtainMessage(3, new C0991Hw(e11)).sendToTarget();
                            }
                        }
                    } catch (Error e12) {
                        Log.e(A01, A01(46, 31, 68), e12);
                        if (!this.A08) {
                            obtainMessage(4, e12).sendToTarget();
                        }
                        throw e12;
                    }
                } catch (OutOfMemoryError e13) {
                    Log.e(A01, A01(14, 32, 85), e13);
                    if (!this.A08) {
                        obtainMessage(3, new C0991Hw(e13)).sendToTarget();
                    }
                }
            } catch (InterruptedException unused) {
                IK.A04(this.A07);
                if (!this.A08) {
                    sendEmptyMessage(2);
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
