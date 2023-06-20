package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class c {
    public long A;
    public boolean B;
    public long C;
    public Method D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public float P;
    public com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] Q;
    public ByteBuffer[] R;
    public ByteBuffer S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.d f18004a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f18005a0;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.h f18006b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f18007b0;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] f18008c;

    /* renamed from: c0  reason: collision with root package name */
    public long f18009c0;

    /* renamed from: d  reason: collision with root package name */
    public final f f18010d;

    /* renamed from: e  reason: collision with root package name */
    public final ConditionVariable f18011e = new ConditionVariable(true);

    /* renamed from: f  reason: collision with root package name */
    public final long[] f18012f;

    /* renamed from: g  reason: collision with root package name */
    public final b f18013g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedList<g> f18014h;

    /* renamed from: i  reason: collision with root package name */
    public AudioTrack f18015i;

    /* renamed from: j  reason: collision with root package name */
    public int f18016j;

    /* renamed from: k  reason: collision with root package name */
    public int f18017k;

    /* renamed from: l  reason: collision with root package name */
    public int f18018l;

    /* renamed from: m  reason: collision with root package name */
    public int f18019m;

    /* renamed from: n  reason: collision with root package name */
    public int f18020n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18021o;

    /* renamed from: p  reason: collision with root package name */
    public int f18022p;

    /* renamed from: q  reason: collision with root package name */
    public long f18023q;

    /* renamed from: r  reason: collision with root package name */
    public m f18024r;

    /* renamed from: s  reason: collision with root package name */
    public m f18025s;

    /* renamed from: t  reason: collision with root package name */
    public long f18026t;

    /* renamed from: u  reason: collision with root package name */
    public long f18027u;

    /* renamed from: v  reason: collision with root package name */
    public ByteBuffer f18028v;

    /* renamed from: w  reason: collision with root package name */
    public int f18029w;

    /* renamed from: x  reason: collision with root package name */
    public int f18030x;

    /* renamed from: y  reason: collision with root package name */
    public int f18031y;

    /* renamed from: z  reason: collision with root package name */
    public long f18032z;

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AudioTrack f18033a;

        public a(AudioTrack audioTrack) {
            this.f18033a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f18033a.flush();
                this.f18033a.release();
            } finally {
                c.this.f18011e.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public AudioTrack f18035a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f18036b;

        /* renamed from: c  reason: collision with root package name */
        public int f18037c;

        /* renamed from: d  reason: collision with root package name */
        public long f18038d;

        /* renamed from: e  reason: collision with root package name */
        public long f18039e;

        /* renamed from: f  reason: collision with root package name */
        public long f18040f;

        /* renamed from: g  reason: collision with root package name */
        public long f18041g;

        /* renamed from: h  reason: collision with root package name */
        public long f18042h;

        /* renamed from: i  reason: collision with root package name */
        public long f18043i;

        public b() {
        }

        public void a(AudioTrack audioTrack, boolean z10) {
            this.f18035a = audioTrack;
            this.f18036b = z10;
            this.f18041g = -9223372036854775807L;
            this.f18038d = 0L;
            this.f18039e = 0L;
            this.f18040f = 0L;
            if (audioTrack != null) {
                this.f18037c = audioTrack.getSampleRate();
            }
        }

        public long b() {
            throw new UnsupportedOperationException();
        }

        public long c() {
            throw new UnsupportedOperationException();
        }

        public boolean d() {
            return false;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public long a() {
            if (this.f18041g != -9223372036854775807L) {
                return Math.min(this.f18043i, this.f18042h + ((((SystemClock.elapsedRealtime() * 1000) - this.f18041g) * this.f18037c) / 1000000));
            }
            int playState = this.f18035a.getPlayState();
            if (playState == 1) {
                return 0L;
            }
            long playbackHeadPosition = this.f18035a.getPlaybackHeadPosition() & 4294967295L;
            if (this.f18036b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f18040f = this.f18038d;
                }
                playbackHeadPosition += this.f18040f;
            }
            if (this.f18038d > playbackHeadPosition) {
                this.f18039e++;
            }
            this.f18038d = playbackHeadPosition;
            return playbackHeadPosition + (this.f18039e << 32);
        }
    }

    @TargetApi(19)
    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0244c extends b {

        /* renamed from: j  reason: collision with root package name */
        public final AudioTimestamp f18044j;

        /* renamed from: k  reason: collision with root package name */
        public long f18045k;

        /* renamed from: l  reason: collision with root package name */
        public long f18046l;

        /* renamed from: m  reason: collision with root package name */
        public long f18047m;

        public C0244c() {
            super(null);
            this.f18044j = new AudioTimestamp();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c.b
        public void a(AudioTrack audioTrack, boolean z10) {
            super.a(audioTrack, z10);
            this.f18045k = 0L;
            this.f18046l = 0L;
            this.f18047m = 0L;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c.b
        public long b() {
            return this.f18047m;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c.b
        public long c() {
            return this.f18044j.nanoTime;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c.b
        public boolean d() {
            boolean timestamp = this.f18035a.getTimestamp(this.f18044j);
            if (timestamp) {
                long j10 = this.f18044j.framePosition;
                if (this.f18046l > j10) {
                    this.f18045k++;
                }
                this.f18046l = j10;
                this.f18047m = j10 + (this.f18045k << 32);
            }
            return timestamp;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {
        public d(Throwable th) {
            super(th);
        }

        public d(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {
        public e(int i10, int i11, int i12, int i13) {
            super("AudioTrack init failed: " + i10 + ", Config(" + i11 + ", " + i12 + ", " + i13 + ")");
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final m f18048a;

        /* renamed from: b  reason: collision with root package name */
        public final long f18049b;

        /* renamed from: c  reason: collision with root package name */
        public final long f18050c;

        public g(m mVar, long j10, long j11) {
            this.f18048a = mVar;
            this.f18049b = j10;
            this.f18050c = j11;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends Exception {
        public h(int i10) {
            super("AudioTrack write failed: " + i10);
        }
    }

    public c(com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] bVarArr, f fVar) {
        this.f18010d = fVar;
        if (u.f19606a >= 18) {
            try {
                this.D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (u.f19606a >= 19) {
            this.f18013g = new C0244c();
        } else {
            this.f18013g = new b(null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.audio.d dVar = new com.fyber.inneractive.sdk.player.exoplayer2.audio.d();
        this.f18004a = dVar;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.audio.h();
        this.f18006b = hVar;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] bVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.b[bVarArr.length + 3];
        this.f18008c = bVarArr2;
        bVarArr2[0] = new com.fyber.inneractive.sdk.player.exoplayer2.audio.f();
        bVarArr2[1] = dVar;
        System.arraycopy(bVarArr, 0, bVarArr2, 2, bVarArr.length);
        bVarArr2[bVarArr.length + 2] = hVar;
        this.f18012f = new long[10];
        this.P = 1.0f;
        this.L = 0;
        this.f18020n = 3;
        this.Z = 0;
        this.f18025s = m.f19141d;
        this.W = -1;
        this.Q = new com.fyber.inneractive.sdk.player.exoplayer2.audio.b[0];
        this.R = new ByteBuffer[0];
        this.f18014h = new LinkedList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r10, int r11, int r12, int r13, int r14, int[] r15) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.c.d {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.c.a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r11 < r10) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.nio.ByteBuffer r9, long r10) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.c.h {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.c.b(java.nio.ByteBuffer, long):boolean");
    }

    public final void c(long j10) throws h {
        ByteBuffer byteBuffer;
        int length = this.Q.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.R[i10 - 1];
            } else {
                byteBuffer = this.S;
                if (byteBuffer == null) {
                    byteBuffer = com.fyber.inneractive.sdk.player.exoplayer2.audio.b.f18003a;
                }
            }
            if (i10 == length) {
                b(byteBuffer, j10);
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.audio.b bVar = this.Q[i10];
                bVar.a(byteBuffer);
                ByteBuffer a10 = bVar.a();
                this.R[i10] = a10;
                if (a10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    public boolean d() {
        if (e()) {
            if (c() > this.f18013g.a()) {
                return true;
            }
            if (f() && this.f18015i.getPlayState() == 2 && this.f18015i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f18015i != null;
    }

    public final boolean f() {
        int i10;
        return u.f19606a < 23 && ((i10 = this.f18019m) == 5 || i10 == 6);
    }

    public void g() {
        this.Y = true;
        if (e()) {
            this.N = System.nanoTime() / 1000;
            this.f18015i.play();
        }
    }

    public void h() {
        if (e()) {
            this.F = 0L;
            this.G = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0;
            m mVar = this.f18024r;
            if (mVar != null) {
                this.f18025s = mVar;
                this.f18024r = null;
            } else if (!this.f18014h.isEmpty()) {
                this.f18025s = this.f18014h.getLast().f18048a;
            }
            this.f18014h.clear();
            this.f18026t = 0L;
            this.f18027u = 0L;
            this.S = null;
            this.T = null;
            int i10 = 0;
            while (true) {
                com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] bVarArr = this.Q;
                if (i10 >= bVarArr.length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.audio.b bVar = bVarArr[i10];
                bVar.flush();
                this.R[i10] = bVar.a();
                i10++;
            }
            this.X = false;
            this.W = -1;
            this.f18028v = null;
            this.f18029w = 0;
            this.L = 0;
            this.O = 0L;
            j();
            if (this.f18015i.getPlayState() == 3) {
                this.f18015i.pause();
            }
            AudioTrack audioTrack = this.f18015i;
            this.f18015i = null;
            this.f18013g.a(null, false);
            this.f18011e.close();
            new a(audioTrack).start();
        }
    }

    public final void i() {
        com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] bVarArr;
        ArrayList arrayList = new ArrayList();
        for (com.fyber.inneractive.sdk.player.exoplayer2.audio.b bVar : this.f18008c) {
            if (bVar.d()) {
                arrayList.add(bVar);
            } else {
                bVar.flush();
            }
        }
        int size = arrayList.size();
        this.Q = (com.fyber.inneractive.sdk.player.exoplayer2.audio.b[]) arrayList.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.audio.b[size]);
        this.R = new ByteBuffer[size];
        for (int i10 = 0; i10 < size; i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b bVar2 = this.Q[i10];
            bVar2.flush();
            this.R[i10] = bVar2.a();
        }
    }

    public final void j() {
        this.f18032z = 0L;
        this.f18031y = 0;
        this.f18030x = 0;
        this.A = 0L;
        this.B = false;
        this.C = 0L;
    }

    public final void k() {
        if (e()) {
            if (u.f19606a >= 21) {
                this.f18015i.setVolume(this.P);
                return;
            }
            AudioTrack audioTrack = this.f18015i;
            float f10 = this.P;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final long c() {
        return this.f18021o ? this.J : this.I / this.H;
    }

    public boolean a(ByteBuffer byteBuffer, long j10) throws e, h {
        int i10;
        int i11;
        ByteBuffer byteBuffer2 = this.S;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!e()) {
            this.f18011e.block();
            if (this.f18005a0) {
                this.f18015i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f18017k).setEncoding(this.f18019m).setSampleRate(this.f18016j).build(), this.f18022p, 1, this.Z);
            } else if (this.Z == 0) {
                this.f18015i = new AudioTrack(this.f18020n, this.f18016j, this.f18017k, this.f18019m, this.f18022p, 1);
            } else {
                this.f18015i = new AudioTrack(this.f18020n, this.f18016j, this.f18017k, this.f18019m, this.f18022p, 1, this.Z);
            }
            int state = this.f18015i.getState();
            if (state == 1) {
                int audioSessionId = this.f18015i.getAudioSessionId();
                if (this.Z != audioSessionId) {
                    this.Z = audioSessionId;
                    MediaCodecAudioRenderer.b bVar = (MediaCodecAudioRenderer.b) this.f18010d;
                    MediaCodecAudioRenderer.this.V.audioSessionId(audioSessionId);
                    MediaCodecAudioRenderer.this.getClass();
                }
                this.f18013g.a(this.f18015i, f());
                k();
                this.f18007b0 = false;
                if (this.Y) {
                    g();
                }
            } else {
                try {
                    this.f18015i.release();
                } catch (Exception unused) {
                } finally {
                    this.f18015i = null;
                }
                throw new e(state, this.f18016j, this.f18017k, this.f18022p);
            }
        }
        if (f()) {
            if (this.f18015i.getPlayState() == 2) {
                this.f18007b0 = false;
                return false;
            } else if (this.f18015i.getPlayState() == 1 && this.f18013g.a() != 0) {
                return false;
            }
        }
        boolean z10 = this.f18007b0;
        boolean d10 = d();
        this.f18007b0 = d10;
        if (z10 && !d10 && this.f18015i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f18009c0;
            MediaCodecAudioRenderer.b bVar2 = (MediaCodecAudioRenderer.b) this.f18010d;
            MediaCodecAudioRenderer.this.V.audioTrackUnderrun(this.f18022p, com.fyber.inneractive.sdk.player.exoplayer2.b.b(this.f18023q), elapsedRealtime);
            MediaCodecAudioRenderer.this.getClass();
        }
        if (this.S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f18021o && this.K == 0) {
                int i12 = this.f18019m;
                if (i12 == 7 || i12 == 8) {
                    int position = byteBuffer.position();
                    i11 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i12 == 5) {
                    i11 = 1536;
                } else if (i12 == 6) {
                    i11 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17997a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i12);
                }
                this.K = i11;
            }
            if (this.f18024r != null) {
                if (!a()) {
                    return false;
                }
                this.f18014h.add(new g(this.f18024r, Math.max(0L, j10), b(c())));
                this.f18024r = null;
                i();
            }
            if (this.L == 0) {
                this.M = Math.max(0L, j10);
                this.L = 1;
            } else {
                long b10 = this.M + b(b());
                if (this.L != 1 || Math.abs(b10 - j10) <= 200000) {
                    i10 = 2;
                } else {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + b10 + ", got " + j10 + "]");
                    i10 = 2;
                    this.L = 2;
                }
                if (this.L == i10) {
                    this.M += j10 - b10;
                    this.L = 1;
                    MediaCodecAudioRenderer.b bVar3 = (MediaCodecAudioRenderer.b) this.f18010d;
                    MediaCodecAudioRenderer.this.getClass();
                    MediaCodecAudioRenderer.this.f17995b0 = true;
                }
            }
            if (this.f18021o) {
                this.G += this.K;
            } else {
                this.F += byteBuffer.remaining();
            }
            this.S = byteBuffer;
        }
        if (this.f18021o) {
            b(this.S, j10);
        } else {
            c(j10);
        }
        if (this.S.hasRemaining()) {
            return false;
        }
        this.S = null;
        return true;
    }

    public final long b(long j10) {
        return (j10 * 1000000) / this.f18016j;
    }

    public final long b() {
        return this.f18021o ? this.G : this.F / this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() throws com.fyber.inneractive.sdk.player.exoplayer2.audio.c.h {
        /*
            r9 = this;
            int r0 = r9.W
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.f18021o
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r0 = r9.Q
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.W = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r5 = r9.Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.c()
        L28:
            r9.c(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.W
            int r0 = r0 + r2
            r9.W = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.W = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.c.a():boolean");
    }

    public m a(m mVar) {
        if (this.f18021o) {
            m mVar2 = m.f19141d;
            this.f18025s = mVar2;
            return mVar2;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.audio.h hVar = this.f18006b;
        float f10 = mVar.f19142a;
        hVar.getClass();
        int i10 = u.f19606a;
        float max = Math.max(0.1f, Math.min(f10, 8.0f));
        hVar.f18095e = max;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.h hVar2 = this.f18006b;
        float f11 = mVar.f19143b;
        hVar2.getClass();
        hVar2.f18096f = Math.max(0.1f, Math.min(f11, 8.0f));
        m mVar3 = new m(max, f11);
        m mVar4 = this.f18024r;
        if (mVar4 == null) {
            if (!this.f18014h.isEmpty()) {
                mVar4 = this.f18014h.getLast().f18048a;
            } else {
                mVar4 = this.f18025s;
            }
        }
        if (!mVar3.equals(mVar4)) {
            if (e()) {
                this.f18024r = mVar3;
            } else {
                this.f18025s = mVar3;
            }
        }
        return this.f18025s;
    }

    public final long a(long j10) {
        return (j10 * this.f18016j) / 1000000;
    }

    public static int a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 7;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return 0;
        }
    }
}
