package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.drm.ExoMediaDrm;
import com.inmobi.media.jh;

@SuppressLint({"HandlerLeak"})
/* loaded from: assets/audience_network.dex */
public class C1 extends Handler {
    public final /* synthetic */ C1375Wz A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public C1(C1375Wz c1375Wz, Looper looper) {
        super(looper);
        this.A00 = c1375Wz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i10) {
        return Math.min((i10 - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private boolean A01(Message message) {
        int i10;
        if (message.arg1 == 1) {
            int i11 = message.arg2 + 1;
            i10 = this.A00.A0D;
            if (i11 > i10) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i11;
            sendMessageDelayed(obtain, A00(i11));
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int errorCount, Object obj, boolean z10) {
        obtainMessage(errorCount, z10 ? 1 : 0, 0, obj).sendToTarget();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C1 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (L0.A02(this)) {
            return;
        }
        try {
            Object obj = message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (CS) obj);
                } else if (i10 == 1) {
                    Pair<ExoMediaDrm.KeyRequest, String> keyRequest = (Pair) obj;
                    e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (CO) keyRequest.first, (String) keyRequest.second);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e10) {
                e = e10;
                if (A01(message)) {
                    return;
                }
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
