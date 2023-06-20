package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C7A<T> {
    public static byte[] A04;
    public static String[] A05 = {"IPzGtGdAf7dMWjoiAfsJwT8MSbfW", "XMCeZkZyu3cdrivUr2jZRBASAtioBKsk", "M9df3TmYW4NVaJXwV617xCLf0ka0RL", "QgNQyFbsObpuCkNzfa3XkTwr8fWterHM", "OM6XrXF8htknNzzoWXy", "2umg9hNEEJctkPlZR8BXtgIxIwG9FY0j", "MjJVouBCVmg2kVwWDhDqrlmadtoLZ7M", "22y3hOnyLMExHbJepmdK5jKs80KnwphC"};
    public static final String A06;
    public final long A00;
    @Nullable
    public final AnonymousClass78 A01;
    public final AnonymousClass79 A02;
    public final T A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{105, 126, 114, 40, 124};
    }

    public abstract int A06() throws Exception;

    public abstract JSONObject A08(JSONObject jSONObject) throws JSONException;

    public abstract boolean A0A(C7A<T> c7a);

    static {
        A04();
        A06 = C7A.class.getSimpleName();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public C7A(long j10, @Nullable AnonymousClass78 anonymousClass78, T signalValue, AnonymousClass79 anonymousClass79) {
        this.A00 = j10;
        this.A01 = anonymousClass78;
        this.A03 = signalValue;
        this.A02 = anonymousClass79;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final long A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @Nullable
    private final AnonymousClass78 A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final AnonymousClass79 A02() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"CatchGeneralException"})
    public final int A05() {
        int length = (A01() != null ? A01().A02().getBytes().length : 0) + 8;
        try {
            return A06() + length;
        } catch (Exception e10) {
            C6O.A03(e10);
            return length;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final T A07() {
        return this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public final JSONObject A09(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put(A03(4, 1, 2), ((float) this.A00) / 1000.0f);
            } catch (Throwable th) {
                C6O.A03(th);
            }
        }
        if (this.A01 != null && z10) {
            jSONObject.put(A03(0, 3, 0), this.A01.A03());
        }
        if (this.A02 != AnonymousClass79.A04 && A07() != null) {
            A08(jSONObject);
        } else {
            AnonymousClass79 anonymousClass79 = this.A02;
            AnonymousClass79 anonymousClass792 = AnonymousClass79.A04;
            if (A05[7].charAt(6) != 'n') {
                throw new RuntimeException();
            }
            A05[7] = "j6hvLenmhks7DifvzYp6ZMm4s1P7WZuQ";
            String A03 = A03(3, 1, 71);
            if (anonymousClass79 == anonymousClass792) {
                jSONObject.put(A03, ((AnonymousClass77) this.A03).A08());
            } else if (this.A03 == null) {
                jSONObject.put(A03, new AnonymousClass77(AnonymousClass76.A07).A08());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final boolean A0B(@Nullable C7A<T> c7a, EnumSet<EnumC07426z> enumSet) {
        long A08;
        if (c7a == null || A02() != c7a.A02()) {
            return false;
        }
        if (A02() == AnonymousClass79.A04 && c7a.A02() == AnonymousClass79.A04) {
            return A0A(c7a);
        }
        boolean z10 = false;
        if (enumSet.contains(EnumC07426z.A0E)) {
            z10 = A0A(c7a);
        }
        if (enumSet.contains(EnumC07426z.A0C)) {
            z10 &= (A01() == null || c7a.A01() == null || !A01().A02().equals(c7a.A01().A02())) ? false : true;
        }
        if (enumSet.contains(EnumC07426z.A0D)) {
            if (A02() == AnonymousClass79.A0D || A02() == AnonymousClass79.A0B) {
                A08 = C6C.A08();
            } else {
                A08 = C6C.A09();
            }
            long epsilon = Math.abs(this.A00 - c7a.A00());
            return z10 & (epsilon < A08);
        }
        return z10;
    }
}
