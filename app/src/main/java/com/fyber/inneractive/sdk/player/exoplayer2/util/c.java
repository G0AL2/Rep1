package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Pair;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f19548a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f19549b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, 8000, 7350};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f19550c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        j jVar = new j(bArr, bArr.length);
        int a10 = jVar.a(5);
        if (a10 == 31) {
            a10 = jVar.a(6) + 32;
        }
        int a11 = a(jVar);
        int a12 = jVar.a(4);
        if (a10 == 5 || a10 == 29) {
            a11 = a(jVar);
            int a13 = jVar.a(5);
            if (a13 == 31) {
                a13 = jVar.a(6) + 32;
            }
            if (a13 == 22) {
                a12 = jVar.a(4);
            }
        }
        int i10 = f19550c[a12];
        a.a(i10 != -1);
        return Pair.create(Integer.valueOf(a11), Integer.valueOf(i10));
    }

    public static int a(j jVar) {
        int a10 = jVar.a(4);
        if (a10 == 15) {
            return jVar.a(24);
        }
        a.a(a10 < 13);
        return f19549b[a10];
    }
}
