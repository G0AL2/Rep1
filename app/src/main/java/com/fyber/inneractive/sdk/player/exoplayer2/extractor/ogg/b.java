package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: n  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.e f18718n;

    /* renamed from: o  reason: collision with root package name */
    public a f18719o;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f18718n = null;
            this.f18719o = null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements f, m {

        /* renamed from: a  reason: collision with root package name */
        public long[] f18720a;

        /* renamed from: b  reason: collision with root package name */
        public long[] f18721b;

        /* renamed from: c  reason: collision with root package name */
        public long f18722c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f18723d = -1;

        public a() {
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
            long j10 = this.f18723d;
            if (j10 >= 0) {
                long j11 = -(j10 + 2);
                this.f18723d = -1L;
                return j11;
            }
            return -1L;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public boolean a() {
            return true;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public m b() {
            return this;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f
        public long c(long j10) {
            long j11 = (b.this.f18750i * j10) / 1000000;
            this.f18723d = this.f18720a[u.b(this.f18720a, j11, true, true)];
            return j11;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long a(long j10) {
            return this.f18722c + this.f18721b[u.b(this.f18720a, (b.this.f18750i * j10) / 1000000, true, true)];
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long c() {
            com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = b.this.f18718n;
            return (eVar.f19555d * 1000000) / eVar.f19552a;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int i10;
        int i11;
        int i12;
        byte b10;
        int i13;
        byte[] bArr = kVar.f19579a;
        int i14 = -1;
        if (bArr[0] == -1) {
            int i15 = (bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
            switch (i15) {
                case 1:
                    i14 = DownloadResource.STATUS_RUNNING;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i10 = i15 - 2;
                    i11 = 576;
                    i14 = i11 << i10;
                    break;
                case 6:
                case 7:
                    kVar.f(4);
                    long j10 = kVar.f19579a[kVar.f19580b];
                    int i16 = 7;
                    while (true) {
                        if (i16 >= 0) {
                            if (((1 << i16) & j10) != 0) {
                                i16--;
                            } else if (i16 < 6) {
                                j10 &= i13 - 1;
                                i12 = 7 - i16;
                            } else if (i16 == 7) {
                                i12 = 1;
                            }
                        }
                    }
                    i12 = 0;
                    if (i12 != 0) {
                        for (int i17 = 1; i17 < i12; i17++) {
                            if ((kVar.f19579a[kVar.f19580b + i17] & 192) != 128) {
                                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                            }
                            j10 = (j10 << 6) | (b10 & 63);
                        }
                        kVar.f19580b += i12;
                        int l10 = i15 == 6 ? kVar.l() : kVar.q();
                        kVar.e(0);
                        i14 = l10 + 1;
                        break;
                    } else {
                        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
                    }
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    i10 = i15 - 8;
                    i11 = 256;
                    i14 = i11 << i10;
                    break;
            }
            return i14;
        }
        return -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j10, h.a aVar) throws IOException, InterruptedException {
        byte[] bArr = kVar.f19579a;
        if (this.f18718n == null) {
            this.f18718n = new com.fyber.inneractive.sdk.player.exoplayer2.util.e(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, kVar.f19581c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f18718n;
            int i10 = eVar.f19554c;
            int i11 = eVar.f19552a;
            aVar.f18755a = com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "audio/flac", (String) null, -1, i10 * i11, eVar.f19553b, i11, -1, singletonList, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null);
        } else {
            if ((bArr[0] & Byte.MAX_VALUE) == 3) {
                a aVar2 = new a();
                this.f18719o = aVar2;
                kVar.f(1);
                int n10 = kVar.n() / 18;
                aVar2.f18720a = new long[n10];
                aVar2.f18721b = new long[n10];
                for (int i12 = 0; i12 < n10; i12++) {
                    aVar2.f18720a[i12] = kVar.i();
                    aVar2.f18721b[i12] = kVar.i();
                    kVar.f(2);
                }
            } else if (bArr[0] == -1) {
                a aVar3 = this.f18719o;
                if (aVar3 != null) {
                    aVar3.f18722c = j10;
                    aVar.f18756b = aVar3;
                }
                return false;
            }
        }
        return true;
    }
}
