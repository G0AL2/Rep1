package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class UV extends L8 {
    public static byte[] A01;
    public final /* synthetic */ C8U A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{111, 99, 97, 34, 106, 109, 111, 105, 110, 99, 99, 103, 34, 109, 104, Byte.MAX_VALUE, 34, 64, 67, 79, 77, 64, 83, 79, 67, 89, 66, 88, 73, 94, 95, 88, 91, 87, 85, 88, 107, 87, 91, 65, 90, 64, 81, 70, 71, 84, 92, 88, 74, 76, 75, 92, 93, 102, 74, 92, 74, 74, 80, 86, 87, 102, 80, 93, 108, 100, 96, 114, 116, 115, 100, 101, 94, 114, 100, 114, 114, 104, 110, 111, 94, 117, 104, 108, 100};
    }

    public UV(C8U c8u) {
        this.A00 = c8u;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AtomicInteger atomicInteger;
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 63), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                C1039Js.A06(this.A00, RK.A00(this.A00), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 10), this.A00.A07().A02()).putString(A00(64, 21, 50), MJ.A02(this.A00.A07().A01())).apply();
        } catch (JSONException e10) {
            this.A00.A06().A8y(A00(31, 14, 7), IronSourceConstants.BN_AUCTION_SUCCESS, new AnonymousClass90(e10));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (C1039Js.class) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry : C1039Js.A02().entrySet()) {
                edit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            edit.apply();
            atomicInteger = C1039Js.A04;
            atomicInteger.set(2);
        }
    }
}
