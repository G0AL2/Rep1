package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18185e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    public boolean f18186b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18187c;

    /* renamed from: d  reason: collision with root package name */
    public int f18188d;

    public a(n nVar) {
        super(nVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public boolean a(k kVar) throws d.a {
        if (!this.f18186b) {
            int l10 = kVar.l();
            int i10 = (l10 >> 4) & 15;
            this.f18188d = i10;
            if (i10 == 2) {
                this.f18204a.a(i.a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f18185e[(l10 >> 2) & 3], -1, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
                this.f18187c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f18204a.a(i.a((String) null, i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (l10 & 1) == 1 ? 2 : 3, (List<byte[]>) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
                this.f18187c = true;
            } else if (i10 != 10) {
                throw new d.a("Audio format not supported: " + this.f18188d);
            }
            this.f18186b = true;
        } else {
            kVar.f(1);
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public void b(k kVar, long j10) {
        if (this.f18188d == 2) {
            int a10 = kVar.a();
            this.f18204a.a(kVar, a10);
            this.f18204a.a(j10, 1, a10, 0, null);
            return;
        }
        int l10 = kVar.l();
        if (l10 == 0 && !this.f18187c) {
            int a11 = kVar.a();
            byte[] bArr = new byte[a11];
            System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, a11);
            kVar.f19580b += a11;
            Pair<Integer, Integer> a12 = com.fyber.inneractive.sdk.player.exoplayer2.util.c.a(bArr);
            this.f18204a.a(i.a((String) null, AudioTrackTranscoder.MIMETYPE_AUDIO_AAC, (String) null, -1, -1, ((Integer) a12.second).intValue(), ((Integer) a12.first).intValue(), -1, Collections.singletonList(bArr), (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null));
            this.f18187c = true;
        } else if (this.f18188d != 10 || l10 == 1) {
            int a13 = kVar.a();
            this.f18204a.a(kVar, a13);
            this.f18204a.a(j10, 1, a13, 0, null);
        }
    }
}
