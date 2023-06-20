package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* loaded from: classes2.dex */
public final class s {
    public static void a(String str) {
        if (u.f19606a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (u.f19606a >= 18) {
            Trace.endSection();
        }
    }
}
