package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class UD implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C8S {
    public static byte[] A02;
    public final C1400Xy A00;
    public final /* synthetic */ UB A01;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, 14, 74, 9, 11, 4, 4, 5, 30, 74, 8, 15, 74, 9, 6, 3, 9, 1, 15, 14, 74, 8, 15, 12, 5, 24, 15, 74, 3, 30, 74, 3, 25, 74, 28, 3, 15, 29, 15, 14, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 56, 25, 86, 2, 25, 3, 21, 30, 86, 18, 23, 2, 23, 86, 4, 19, 21, 25, 4, 18, 19, 18, 90, 86, 6, 26, 19, 23, 5, 19, 86, 19, 24, 5, 3, 4, 19, 86, 2, 25, 3, 21, 30, 86, 19, 0, 19, 24, 2, 5, 86, 4, 19, 23, 21, 30, 86, 2, 30, 19, 86, 23, 18, 86, 32, 31, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, 24, 31, 24, 17, 86, 16, 23, 26, 5, 19, 86, 31, 16, 86, 15, 25, 3, 86, 31, 24, 2, 19, 4, 21, 19, 6, 2, 86, 2, 30, 19, 86, 19, 0, 19, 24, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public UD(UB ub2, C1400Xy c1400Xy) {
        this.A01 = ub2;
        this.A00 = c1400Xy;
    }

    public /* synthetic */ UD(UB ub2, C1400Xy c1400Xy, UM um) {
        this(ub2, c1400Xy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        C1220Qw c1220Qw;
        MK mk;
        K8 k82;
        boolean z10;
        boolean z11;
        K8 k83;
        OG og = new OG();
        c1220Qw = this.A01.A0R;
        OG A03 = og.A03(c1220Qw);
        mk = this.A01.A0f;
        Map<String, String> A05 = A03.A02(mk).A05();
        k82 = this.A01.A0I;
        if (k82 != null) {
            k83 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(k83.A04()));
        }
        z10 = this.A01.A0W;
        if (z10) {
            z11 = this.A01.A0W;
            A05.put(A00(DownloadResource.STATUS_INSUFFICIENT_SPACE_ERROR, 3, 116), String.valueOf(z11));
        }
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> map) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(map);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    public final C1400Xy A5b() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MK mk;
        C1400Xy c1400Xy;
        MK mk2;
        C1400Xy c1400Xy2;
        C1400Xy c1400Xy3;
        MK mk3;
        MK mk4;
        if (L0.A02(this)) {
            return;
        }
        try {
            mk = this.A01.A0f;
            boolean A08 = mk.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c1400Xy = this.A01.A0c;
            int A0E = JR.A0E(c1400Xy);
            if (A0E >= 0) {
                mk3 = this.A01.A0f;
                if (mk3.A03() < A0E) {
                    mk4 = this.A01.A0f;
                    if (!mk4.A07()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            mk2 = this.A01.A0f;
            c1400Xy2 = this.A01.A0c;
            if (!mk2.A09(c1400Xy2)) {
                c1400Xy3 = this.A01.A0c;
                if (JR.A14(c1400Xy3)) {
                    if (this.A01.A0a != null) {
                        this.A01.A0a.A0Q(A01());
                    }
                    Lq.A00(new K1(this), new K2(this), ActivityUtils.A00());
                    return;
                }
                A05(A01());
            } else if (this.A01.A0a != null) {
                this.A01.A0a.A0N(A01());
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        OE oe2;
        OE oe3;
        View view3;
        View view4;
        OE oe4;
        OE oe5;
        view2 = this.A01.A04;
        if (view2 != null) {
            oe2 = this.A01.A0L;
            if (oe2 != null) {
                oe3 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                oe3.setBounds(0, 0, width, view4.getHeight());
                oe4 = this.A01.A0L;
                oe5 = this.A01.A0L;
                oe4.A0D(!oe5.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MK mk;
        C1400Xy c1400Xy;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        mk = this.A01.A0f;
        c1400Xy = this.A01.A0c;
        view2 = this.A01.A04;
        mk.A06(c1400Xy, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
