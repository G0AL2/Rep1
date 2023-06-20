package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18562a = u.a("vide");

    /* renamed from: b  reason: collision with root package name */
    public static final int f18563b = u.a("soun");

    /* renamed from: c  reason: collision with root package name */
    public static final int f18564c = u.a("text");

    /* renamed from: d  reason: collision with root package name */
    public static final int f18565d = u.a("sbtl");

    /* renamed from: e  reason: collision with root package name */
    public static final int f18566e = u.a("subt");

    /* renamed from: f  reason: collision with root package name */
    public static final int f18567f = u.a("clcp");

    /* renamed from: g  reason: collision with root package name */
    public static final int f18568g = u.a("cenc");

    /* renamed from: h  reason: collision with root package name */
    public static final int f18569h = u.a("meta");

    /* loaded from: classes.dex */
    public interface a {
        int a();

        int b();

        boolean c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0254b {

        /* renamed from: a  reason: collision with root package name */
        public final i[] f18570a;

        /* renamed from: b  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.i f18571b;

        /* renamed from: c  reason: collision with root package name */
        public int f18572c;

        /* renamed from: d  reason: collision with root package name */
        public int f18573d = 0;

        public C0254b(int i10) {
            this.f18570a = new i[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18574a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18575b;

        /* renamed from: c  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18576c;

        public c(a.b bVar) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = bVar.P0;
            this.f18576c = kVar;
            kVar.e(12);
            this.f18574a = kVar.o();
            this.f18575b = kVar.o();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int a() {
            return this.f18575b;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int b() {
            int i10 = this.f18574a;
            return i10 == 0 ? this.f18576c.o() : i10;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public boolean c() {
            return this.f18574a != 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18577a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18578b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18579c;

        /* renamed from: d  reason: collision with root package name */
        public int f18580d;

        /* renamed from: e  reason: collision with root package name */
        public int f18581e;

        public d(a.b bVar) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = bVar.P0;
            this.f18577a = kVar;
            kVar.e(12);
            this.f18579c = kVar.o() & 255;
            this.f18578b = kVar.o();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int a() {
            return this.f18578b;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int b() {
            int i10 = this.f18579c;
            if (i10 == 8) {
                return this.f18577a.l();
            }
            if (i10 == 16) {
                return this.f18577a.q();
            }
            int i11 = this.f18580d;
            this.f18580d = i11 + 1;
            if (i11 % 2 == 0) {
                int l10 = this.f18577a.l();
                this.f18581e = l10;
                return (l10 & 240) >> 4;
            }
            return this.f18581e & 15;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public boolean c() {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
        if (r8 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.C0253a r46, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b r47, long r48, com.fyber.inneractive.sdk.player.exoplayer2.drm.a r50, boolean r51) throws com.fyber.inneractive.sdk.player.exoplayer2.l {
        /*
            Method dump skipped, instructions count: 2001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b, long, com.fyber.inneractive.sdk.player.exoplayer2.drm.a, boolean):com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h");
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, int i11, C0254b c0254b, int i12) {
        int i13 = kVar.f19580b;
        while (true) {
            if (i13 - i10 >= i11) {
                return 0;
            }
            kVar.e(i13);
            int c10 = kVar.c();
            int i14 = 1;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(c10 > 0, "childAtomSize should be positive");
            if (kVar.c() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.W) {
                int i15 = i13 + 8;
                Pair pair = null;
                Integer num = null;
                i iVar = null;
                boolean z10 = false;
                while (i15 - i13 < c10) {
                    kVar.e(i15);
                    int c11 = kVar.c();
                    int c12 = kVar.c();
                    if (c12 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.f18514c0) {
                        num = Integer.valueOf(kVar.c());
                    } else if (c12 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.X) {
                        kVar.f(4);
                        z10 = kVar.c() == f18568g;
                    } else if (c12 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.Y) {
                        int i16 = i15 + 8;
                        while (true) {
                            if (i16 - i15 >= c11) {
                                iVar = null;
                                break;
                            }
                            kVar.e(i16);
                            int c13 = kVar.c();
                            if (kVar.c() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.Z) {
                                kVar.f(6);
                                boolean z11 = kVar.l() == i14;
                                int l10 = kVar.l();
                                byte[] bArr = new byte[16];
                                System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, 16);
                                kVar.f19580b += 16;
                                iVar = new i(z11, l10, bArr);
                            } else {
                                i16 += c13;
                                i14 = 1;
                            }
                        }
                    }
                    i15 += c11;
                    i14 = 1;
                }
                if (z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(num != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, iVar);
                }
                if (pair != null) {
                    c0254b.f18570a[i12] = (i) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            i13 += c10;
        }
    }

    public static Pair<String, byte[]> a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) {
        kVar.e(i10 + 8 + 4);
        kVar.f(1);
        a(kVar);
        kVar.f(2);
        int l10 = kVar.l();
        if ((l10 & 128) != 0) {
            kVar.f(2);
        }
        if ((l10 & 64) != 0) {
            kVar.f(kVar.q());
        }
        if ((l10 & 32) != 0) {
            kVar.f(2);
        }
        kVar.f(1);
        a(kVar);
        int l11 = kVar.l();
        String str = null;
        if (l11 == 32) {
            str = "video/mp4v-es";
        } else if (l11 == 33) {
            str = "video/avc";
        } else if (l11 != 35) {
            if (l11 != 64) {
                if (l11 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (l11 == 165) {
                    str = "audio/ac3";
                } else if (l11 != 166) {
                    switch (l11) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (l11) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
        } else {
            str = "video/hevc";
        }
        kVar.f(12);
        kVar.f(1);
        int a10 = a(kVar);
        byte[] bArr = new byte[a10];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, a10);
        kVar.f19580b += a10;
        return Pair.create(str, bArr);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int l10 = kVar.l();
        int i10 = l10 & 127;
        while ((l10 & 128) == 128) {
            l10 = kVar.l();
            i10 = (i10 << 7) | (l10 & 127);
        }
        return i10;
    }
}
