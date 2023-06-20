package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7E {
    public static byte[] A06;
    public static String[] A07 = {"aJ4yIqlrLMt", "EKTEccEpmR5675IOZ9lerUvwdG3ro5hY", "jTSIV3oRBrHoNrPkrRMeoeXpEd5JgTWm", "V52m2mthgbiWP0xFHXCG", "Wq", "BEItf56ADM92z1bkMxhlUdx7QMuMYd3L", "2Z", "ce4p6sp9ssAJXyOyOHhkkoq4sskZtb0W"};
    public int A00;
    public final Context A01;
    public final C6C A02;
    public final C7B A03;
    public final C7C A04;
    public final Set<C07356s> A05 = new HashSet();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "0R";
            strArr2[4] = "EB";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
            i13++;
        }
    }

    public static void A02() {
        A06 = new byte[]{91, 77, 92, 100, 73, 91, 92, 120, 77, 90, 65, 71, 76, 65, 75, 107, 71, 68, 68, 77, 75, 92, 65, 71, 70, 124, 65, 69, 77, 101, 91};
    }

    static {
        A02();
    }

    public C7E(Context context, C6C c6c) {
        this.A02 = c6c;
        this.A01 = context;
        this.A04 = c6c.A0c();
        this.A03 = c6c.A0b();
    }

    @Nullable
    private AnonymousClass78 A00() {
        if (this.A02.A0a() == EnumC07426z.A0G) {
            return null;
        }
        Context context = this.A01;
        return new AnonymousClass78(context == null ? A01(0, 0, 58) : context.getPackageName());
    }

    @SuppressLint({"CatchGeneralException"})
    private void A03(long j10) {
        C7A signalValueTypeDef;
        try {
            JSONObject jSONObject = new JSONObject();
            for (C07356s c07356s : this.A05) {
                InterfaceC07386v A01 = c07356s.A01();
                if (A01 == null) {
                    signalValueTypeDef = new YD(SystemClock.elapsedRealtime(), A00(), new AnonymousClass77(AnonymousClass76.A04));
                } else {
                    signalValueTypeDef = A01.A5J();
                }
                jSONObject.put(Integer.toString(c07356s.A00()), signalValueTypeDef.A09(false));
            }
            Throwable t10 = new NullPointerException(A01(0, 31, 26));
            throw t10;
        } catch (Throwable t11) {
            C6O.A03(t11);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private void A04(long j10) {
        try {
            this.A02.A0j().schedule(new Runnable() { // from class: com.facebook.ads.redexgen.X.7D
                @Override // java.lang.Runnable
                public final void run() {
                    if (L0.A02(this)) {
                        return;
                    }
                    try {
                        C7E.this.A05();
                    } catch (Throwable th) {
                        L0.A00(th, this);
                    }
                }
            }, j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    public final void A05() {
        if (this.A02.A0W() <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A04.getLastPeriodicCollectionTimeMs() >= this.A02.A0W()) {
            A03(currentTimeMillis);
            A04(this.A02.A0W());
            return;
        }
        A04(Math.abs(currentTimeMillis - (this.A04.getLastPeriodicCollectionTimeMs() + this.A02.A0W())));
    }

    public final void A06(int i10) {
        this.A00 = i10;
    }

    public final void A07(C07356s c07356s) {
        this.A05.add(c07356s);
    }
}
