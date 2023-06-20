package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.15  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass15 extends BroadcastReceiver {
    public static String[] A03 = {"JgmY627JJ4fVvMUsUI7dBJzvca", "2Fivc7ze9Y6M7vLBAhVCw66dd2zEUTp", "oqNyJxLxp23hnAfKGRpFUMlaCTnSy4au", "HRO7fC4J0U3bXqsrOiWljP6J940cuLTJ", "rhEs9JkkityiMJcgD18RNPKtdGmllPs6", "c8I5EiJJKjWgwuyghylYWruaZ4nXJiut", "YeKDqRnNq5JcEGU0HYsnt6sxK1D4K6hE", "zIQMBMVVQmczFglCifMrZtV9RNUhKeCf"};
    public AbstractC1660dQ A00;
    public AnonymousClass14 A01;
    public String A02;

    public AnonymousClass15(String str, AbstractC1660dQ abstractC1660dQ, AnonymousClass14 anonymousClass14) {
        this.A00 = abstractC1660dQ;
        this.A01 = anonymousClass14;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Q9.A06.A03(this.A02));
        intentFilter.addAction(Q9.A09.A03(this.A02));
        intentFilter.addAction(Q9.A04.A03(this.A02));
        intentFilter.addAction(Q9.A0A.A03(this.A02));
        intentFilter.addAction(Q9.A05.A03(this.A02));
        intentFilter.addAction(Q9.A0C.A03(this.A02));
        intentFilter.addAction(Q9.A0B.A03(this.A02));
        intentFilter.addAction(Q9.A03.A03(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Q9.A06.A03(this.A02).equals(action)) {
            AnonymousClass14 anonymousClass14 = this.A01;
            AbstractC1660dQ abstractC1660dQ = this.A00;
            if (A03[1].length() != 11) {
                A03[0] = "z37hhVYNur1y5njE4t22VYTMbB";
                anonymousClass14.ACE(abstractC1660dQ);
                return;
            }
        } else if (Q9.A09.A03(this.A02).equals(action)) {
            boolean A1H = JR.A1H(context);
            String[] strArr = A03;
            if (strArr[3].charAt(16) != strArr[4].charAt(16)) {
                A03[0] = "a2nbOp8yH430aeg70B0MHQFnwN";
                if (A1H) {
                    AnonymousClass14 anonymousClass142 = this.A01;
                    AbstractC1660dQ abstractC1660dQ2 = this.A00;
                    AdError adError = AdError.AD_PRESENTATION_ERROR;
                    String[] strArr2 = A03;
                    if (strArr2[3].charAt(16) != strArr2[4].charAt(16)) {
                        String[] strArr3 = A03;
                        strArr3[2] = "Smm3aT6IchFgLH9ob00fwQqxHFnPPG6O";
                        strArr3[5] = "wzZfDEncWZ9M4YUYJFr8Gzf2lfnMb6hd";
                        anonymousClass142.ACF(abstractC1660dQ2, adError);
                        return;
                    }
                    String[] strArr4 = A03;
                    strArr4[6] = "douVyTcHxmEKv1YyJqQbVTsvWWCOpXBn";
                    strArr4[7] = "x6yn97aV8hj96Z0WREVv4HAdEeLr9VIY";
                    anonymousClass142.ACF(abstractC1660dQ2, adError);
                    return;
                }
                this.A01.ACF(this.A00, AdError.INTERNAL_ERROR);
                return;
            }
        } else if (Q9.A04.A03(this.A02).equals(action)) {
            this.A01.ACB(this.A00);
            return;
        } else if (Q9.A0A.A03(this.A02).equals(action)) {
            this.A01.ACD(this.A00);
            return;
        } else if (Q9.A05.A03(this.A02).equals(action)) {
            this.A01.onRewardedVideoClosed();
            return;
        } else if (Q9.A0B.A03(this.A02).equals(action)) {
            this.A01.AC9(this.A00);
            return;
        } else if (Q9.A0C.A03(this.A02).equals(action)) {
            this.A01.ACA(this.A00);
            return;
        } else if (!Q9.A03.A03(this.A02).equals(action)) {
            return;
        } else {
            this.A01.onRewardedVideoActivityDestroyed();
            return;
        }
        throw new RuntimeException();
    }
}
