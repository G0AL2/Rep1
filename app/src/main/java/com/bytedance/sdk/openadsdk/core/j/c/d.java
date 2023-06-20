package com.bytedance.sdk.openadsdk.core.j.c;

import java.util.Arrays;
import java.util.List;

/* compiled from: VastUtils.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f12467a = Arrays.asList("video/mp4", "video/3gpp");

    public static double a(int i10, double d10, int i11, int i12, int i13, String str) {
        double a10 = a(i10, d10, i11, i12);
        return a(str) * (1.0d / ((a10 + 1.0d) + a(i13)));
    }

    private static double a(int i10, double d10, int i11, int i12) {
        double d11 = 0.0d;
        double abs = d10 != Double.MIN_VALUE ? Math.abs(d10 - (i12 != 0 ? i11 / i12 : 0.0d)) : 0.0d;
        if (i10 != Integer.MIN_VALUE && i10 != 0) {
            d11 = Math.abs((i10 - i11) / i10);
        }
        return abs + d11;
    }

    private static double a(int i10) {
        int max = Math.max(i10, 0);
        if (700 > max || max > 1500) {
            return Math.min(Math.abs(700 - max) / 700.0f, Math.abs(1500 - max) / 1500.0f);
        }
        return 0.0d;
    }

    private static double a(String str) {
        if (str == null) {
            str = "";
        }
        char c10 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            if (hashCode == 1331848029 && str.equals("video/mp4")) {
                c10 = 0;
            }
        } else if (str.equals("video/3gpp")) {
            c10 = 1;
        }
        return c10 != 0 ? 1.0d : 1.5d;
    }
}
