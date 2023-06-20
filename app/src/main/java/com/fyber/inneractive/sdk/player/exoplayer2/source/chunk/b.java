package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;

/* loaded from: classes2.dex */
public final class b {
    public static boolean a(e eVar, int i10, Exception exc, long j10) {
        if (a(exc)) {
            boolean a10 = eVar.a(i10, j10);
            int i11 = ((v) exc).f19521a;
            if (a10) {
                Log.w("ChunkedTrackBlacklist", "Blacklisted: duration=" + j10 + ", responseCode=" + i11 + ", format=" + eVar.a(i10));
            } else {
                Log.w("ChunkedTrackBlacklist", "Blacklisting failed (cannot blacklist last enabled track): responseCode=" + i11 + ", format=" + eVar.a(i10));
            }
            return a10;
        }
        return false;
    }

    public static boolean a(Exception exc) {
        if (exc instanceof v) {
            int i10 = ((v) exc).f19521a;
            return i10 == 404 || i10 == 410;
        }
        return false;
    }
}
