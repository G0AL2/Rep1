package j8;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import j8.d;

/* compiled from: AudioFocusManager.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    private final AudioManager f32354a;

    /* renamed from: b */
    private final a f32355b;

    /* renamed from: c */
    private b f32356c;

    /* renamed from: d */
    private l8.d f32357d;

    /* renamed from: f */
    private int f32359f;

    /* renamed from: h */
    private AudioFocusRequest f32361h;

    /* renamed from: i */
    private boolean f32362i;

    /* renamed from: g */
    private float f32360g = 1.0f;

    /* renamed from: e */
    private int f32358e = 0;

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes2.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f32363a;

        public a(Handler handler) {
            d.this = r1;
            this.f32363a = handler;
        }

        public static /* synthetic */ void a(a aVar, int i10) {
            aVar.b(i10);
        }

        public /* synthetic */ void b(int i10) {
            d.this.h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f32363a.post(new Runnable() { // from class: j8.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.a(d.a.this, i10);
                }
            });
        }
    }

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes2.dex */
    public interface b {
        void B(float f10);

        void C(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f32354a = (AudioManager) ea.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f32356c = bVar;
        this.f32355b = new a(handler);
    }

    private void a() {
        this.f32354a.abandonAudioFocus(this.f32355b);
    }

    private void b() {
        if (this.f32358e == 0) {
            return;
        }
        if (ea.n0.f29709a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f32361h;
        if (audioFocusRequest != null) {
            this.f32354a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int e(l8.d dVar) {
        if (dVar == null) {
            return 0;
        }
        int i10 = dVar.f33782c;
        switch (i10) {
            case 0:
                ea.r.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (dVar.f33780a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unidentified audio usage: ");
                sb2.append(i10);
                ea.r.h("AudioFocusManager", sb2.toString());
                return 0;
            case 16:
                return ea.n0.f29709a >= 19 ? 4 : 2;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f32356c;
        if (bVar != null) {
            bVar.C(i10);
        }
    }

    public void h(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !q()) {
                n(3);
                return;
            }
            f(0);
            n(2);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Unknown focus change type: ");
            sb2.append(i10);
            ea.r.h("AudioFocusManager", sb2.toString());
        } else {
            n(1);
            f(1);
        }
    }

    private int j() {
        if (this.f32358e == 1) {
            return 1;
        }
        if ((ea.n0.f29709a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f32354a.requestAudioFocus(this.f32355b, ea.n0.h0(((l8.d) ea.a.e(this.f32357d)).f33782c), this.f32359f);
    }

    private int l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f32361h;
        if (audioFocusRequest == null || this.f32362i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f32359f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f32361h);
            }
            this.f32361h = builder.setAudioAttributes(((l8.d) ea.a.e(this.f32357d)).a()).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f32355b).build();
            this.f32362i = false;
        }
        return this.f32354a.requestAudioFocus(this.f32361h);
    }

    private void n(int i10) {
        if (this.f32358e == i10) {
            return;
        }
        this.f32358e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f32360g == f10) {
            return;
        }
        this.f32360g = f10;
        b bVar = this.f32356c;
        if (bVar != null) {
            bVar.B(f10);
        }
    }

    private boolean o(int i10) {
        return i10 == 1 || this.f32359f != 1;
    }

    private boolean q() {
        l8.d dVar = this.f32357d;
        return dVar != null && dVar.f33780a == 1;
    }

    public float g() {
        return this.f32360g;
    }

    public void i() {
        this.f32356c = null;
        b();
    }

    public void m(l8.d dVar) {
        if (ea.n0.c(this.f32357d, dVar)) {
            return;
        }
        this.f32357d = dVar;
        int e10 = e(dVar);
        this.f32359f = e10;
        boolean z10 = true;
        if (e10 != 1 && e10 != 0) {
            z10 = false;
        }
        ea.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            return z10 ? 1 : -1;
        } else if (z10) {
            return j();
        } else {
            return -1;
        }
    }
}
