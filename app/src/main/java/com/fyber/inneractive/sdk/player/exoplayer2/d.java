package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes.dex */
public final class d extends Exception {
    public d(int i10, String str, Throwable th, int i11) {
        super(null, th);
    }

    public static d a(Exception exc, int i10) {
        return new d(1, null, exc, i10);
    }
}
