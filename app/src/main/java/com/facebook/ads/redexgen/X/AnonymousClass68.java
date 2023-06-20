package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.ads.redexgen.X.68  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass68 {
    public static byte[] A00;
    public static String[] A01 = {"r7c1s5U0efOStYGowMowhUbuYlQTG1Tt", "4N5luf2P5Kce0fziMzoENYJ9JUsEy4RG", "Zwxj", "L2KmiKnie6D54jPyz7fJn9CofNiJStjg", "Reipc3PbxUqE4G7HYurM4m8tamMVkuwI", "qFHCxa5Kyhox8u", "zslT757DGHQcDkpTRw1DlpZ4hqoBSQOy", "oFLB5GUqllb2V05SIM"};
    public static final AtomicReference<C6D> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(15) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "ewynTuX5etTUvRbKneAORAXWy6m3gfja";
            strArr[0] = "MEXbvG7De7lT0m7kyXT3Vo2bJU5t0LAQ";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{60, 40, 57, 52, 56, 51, 62, 56, 2, 51, 56, 41, 42, 50, 47, 54, 115, 57, 56, 37, 45, 47, 36, 47, 56, 35, 41};
    }

    static {
        A01();
        A02 = new AtomicReference<>();
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02(@Nullable Activity activity, MotionEvent motionEvent) {
        C6D c6d;
        try {
            if (AnonymousClass69.A0P(activity) && (c6d = A02.get()) != null) {
                c6d.A05(motionEvent);
            }
        } catch (Throwable th) {
            C1399Xx A002 = C8T.A00();
            if (A002 != null) {
                A002.A06().A8y(A00(20, 7, 86), C07828z.A1F, new AnonymousClass90(th));
            }
        }
    }

    public static void A03(Context context) {
        if (!(context instanceof Application)) {
            return;
        }
        ActivityUtils.A05(new C1528bC());
    }

    public static void A04(C1399Xx c1399Xx, @Nullable String str) {
        MX.A06.execute(new C1531bF(c1399Xx, str));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(C1399Xx c1399Xx, String str) {
        if (!AnonymousClass69.A0P(c1399Xx)) {
            return;
        }
        if (A02.get() == null && C7J.A0E(C7J.A03(str))) {
            A04(c1399Xx, str);
            return;
        }
        C6D c6d = A02.get();
        if (c6d != null) {
            MX.A06.execute(new C1530bE(c6d, str, c1399Xx));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.ads.redexgen.X.6B] */
    @SuppressLint({"CatchGeneralException"})
    public static synchronized void A07(C1399Xx c1399Xx, @Nullable String str) {
        synchronized (AnonymousClass68.class) {
            try {
            } finally {
            }
            if (A02.get() != null) {
                return;
            }
            if (AnonymousClass69.A0P(c1399Xx)) {
                C1526bA c1526bA = new C1526bA(c1399Xx);
                C1527bB c1527bB = new C1527bB(c1399Xx);
                C6C A0J = new Object() { // from class: com.facebook.ads.redexgen.X.6B
                    public double A00;
                    public float A01;
                    public int A02;
                    public int A03;
                    public int A04;
                    public int A05;
                    public int A06;
                    public long A07;
                    public long A08;
                    public long A09;
                    public C6L A0A;
                    public C6M A0B;
                    public C6N A0C;
                    public EnumC07426z A0D;
                    public C7B A0E;
                    public C7C A0F;
                    public Class A0G;
                    @Nullable
                    public String A0H;
                    @Nullable
                    public String A0I;
                    public String A0J;
                    public HashMap<Integer, Integer> A0K;
                    public Map<Integer, String> A0L;
                    public ScheduledExecutorService A0M;
                    public boolean A0N;

                    public final C6B A00(double d10) {
                        this.A00 = d10;
                        return this;
                    }

                    public final C6B A01(float f10) {
                        this.A01 = f10;
                        return this;
                    }

                    public final C6B A02(int i10) {
                        this.A02 = i10;
                        return this;
                    }

                    public final C6B A03(int i10) {
                        this.A03 = i10;
                        return this;
                    }

                    public final C6B A04(int i10) {
                        this.A04 = i10;
                        return this;
                    }

                    public final C6B A05(int i10) {
                        this.A05 = i10;
                        return this;
                    }

                    public final C6B A06(int i10) {
                        this.A06 = i10;
                        return this;
                    }

                    public final C6B A07(long j10) {
                        this.A07 = j10;
                        return this;
                    }

                    public final C6B A08(long j10) {
                        this.A08 = j10;
                        return this;
                    }

                    public final C6B A09(C6L c6l) {
                        this.A0A = c6l;
                        return this;
                    }

                    public final C6B A0A(C6M c6m) {
                        this.A0B = c6m;
                        return this;
                    }

                    public final C6B A0B(C6N c6n) {
                        this.A0C = c6n;
                        return this;
                    }

                    public final C6B A0C(EnumC07426z enumC07426z) {
                        this.A0D = enumC07426z;
                        return this;
                    }

                    public final C6B A0D(Class cls) {
                        this.A0G = cls;
                        return this;
                    }

                    public final C6B A0E(@Nullable String str2) {
                        this.A0I = str2;
                        return this;
                    }

                    public final C6B A0F(String str2) {
                        this.A0J = str2;
                        return this;
                    }

                    public final C6B A0G(HashMap<Integer, Integer> circularBufferLengthMap) {
                        this.A0K = circularBufferLengthMap;
                        return this;
                    }

                    public final C6B A0H(Map map) {
                        this.A0L = map;
                        return this;
                    }

                    public final C6B A0I(boolean z10) {
                        this.A0N = z10;
                        return this;
                    }

                    public final C6C A0J() {
                        C6C c6c = new C6C();
                        c6c.A0J = this.A0N;
                        c6c.A02 = this.A04;
                        c6c.A0G = this.A0K;
                        c6c.A01 = this.A03;
                        c6c.A00 = this.A02;
                        c6c.A04 = this.A06;
                        c6c.A0F = this.A0J;
                        c6c.A07 = this.A0B;
                        c6c.A06 = this.A0A;
                        double unused = C6C.A0K = this.A00;
                        c6c.A09 = this.A0D;
                        c6c.A0H = this.A0L;
                        c6c.A03 = this.A05;
                        c6c.A0C = this.A0G;
                        c6c.A08 = this.A0C;
                        float unused2 = C6C.A0L = this.A01;
                        long unused3 = C6C.A0N = this.A08;
                        long unused4 = C6C.A0M = this.A07;
                        c6c.A05 = this.A09;
                        c6c.A0B = this.A0F;
                        c6c.A0A = this.A0E;
                        c6c.A0I = this.A0M;
                        c6c.A0D = this.A0H;
                        c6c.A0E = this.A0I;
                        return c6c;
                    }
                }.A0I(true).A04(AnonymousClass69.A05(c1399Xx)).A02(AnonymousClass69.A03(c1399Xx)).A03(AnonymousClass69.A04(c1399Xx)).A06(AnonymousClass69.A07(c1399Xx)).A0G(AnonymousClass69.A0M()).A0A(c1526bA).A09(c1527bB.A00()).A00(AnonymousClass69.A01(c1399Xx)).A0C(EnumC07426z.A0G).A0F(AnonymousClass69.A0D(c1399Xx)).A0H(AnonymousClass69.A0N(c1399Xx)).A05(AnonymousClass69.A06(c1399Xx)).A0D(Build.class).A01(AnonymousClass69.A02(c1399Xx)).A08(AnonymousClass69.A09(c1399Xx)).A07(AnonymousClass69.A08(c1399Xx)).A0B(c1527bB).A0E(A00(0, 20, 65)).A0J();
                if (AnonymousClass69.A0Q(c1399Xx)) {
                    A03(c1399Xx.getApplicationContext());
                }
                C6D c6d = new C6D(c1399Xx, A0J, AnonymousClass69.A0A(c1399Xx));
                if (str != null) {
                    c6d.A06(str);
                }
                A02.set(c6d);
            }
        }
    }
}
