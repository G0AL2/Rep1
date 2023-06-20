package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f18112a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f18113b;

    /* renamed from: c  reason: collision with root package name */
    public int f18114c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f18115d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f18116e;

    /* renamed from: f  reason: collision with root package name */
    public int f18117f;

    /* renamed from: g  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f18118g;

    /* renamed from: h  reason: collision with root package name */
    public final b f18119h;

    @TargetApi(24)
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f18120a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f18121b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f18120a = cryptoInfo;
            this.f18121b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public a() {
        int i10 = u.f19606a;
        MediaCodec.CryptoInfo a10 = i10 >= 16 ? a() : null;
        this.f18118g = a10;
        this.f18119h = i10 >= 24 ? new b(a10) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return new MediaCodec.CryptoInfo();
    }
}
