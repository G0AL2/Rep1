package s8;

import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import j8.j2;
import j8.p1;
import java.util.Collections;
import l8.a;
import p8.a0;
import s8.e;

/* compiled from: AudioTagPayloadReader.java */
/* loaded from: classes2.dex */
final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f36792e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f36793b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36794c;

    /* renamed from: d  reason: collision with root package name */
    private int f36795d;

    public a(a0 a0Var) {
        super(a0Var);
    }

    @Override // s8.e
    protected boolean b(ea.a0 a0Var) throws e.a {
        if (!this.f36793b) {
            int D = a0Var.D();
            int i10 = (D >> 4) & 15;
            this.f36795d = i10;
            if (i10 == 2) {
                this.f36816a.d(new p1.b().e0("audio/mpeg").H(1).f0(f36792e[(D >> 2) & 3]).E());
                this.f36794c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f36816a.d(new p1.b().e0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000).E());
                this.f36794c = true;
            } else if (i10 != 10) {
                int i11 = this.f36795d;
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Audio format not supported: ");
                sb2.append(i11);
                throw new e.a(sb2.toString());
            }
            this.f36793b = true;
        } else {
            a0Var.Q(1);
        }
        return true;
    }

    @Override // s8.e
    protected boolean c(ea.a0 a0Var, long j10) throws j2 {
        if (this.f36795d == 2) {
            int a10 = a0Var.a();
            this.f36816a.a(a0Var, a10);
            this.f36816a.e(j10, 1, a10, 0, null);
            return true;
        }
        int D = a0Var.D();
        if (D == 0 && !this.f36794c) {
            int a11 = a0Var.a();
            byte[] bArr = new byte[a11];
            a0Var.j(bArr, 0, a11);
            a.b f10 = l8.a.f(bArr);
            this.f36816a.d(new p1.b().e0(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC).I(f10.f33746c).H(f10.f33745b).f0(f10.f33744a).T(Collections.singletonList(bArr)).E());
            this.f36794c = true;
            return false;
        } else if (this.f36795d != 10 || D == 1) {
            int a12 = a0Var.a();
            this.f36816a.a(a0Var, a12);
            this.f36816a.e(j10, 1, a12, 0, null);
            return true;
        } else {
            return false;
        }
    }
}
