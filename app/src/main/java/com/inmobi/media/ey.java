package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: NativeAudioFocusManager.java */
/* loaded from: classes3.dex */
public final class ey {

    /* renamed from: b */
    private final Context f25315b;

    /* renamed from: c */
    private final a f25316c;

    /* renamed from: f */
    private AudioFocusRequest f25319f;

    /* renamed from: g */
    private AudioManager.OnAudioFocusChangeListener f25320g;

    /* renamed from: d */
    private boolean f25317d = false;

    /* renamed from: e */
    private final Object f25318e = new Object();

    /* renamed from: a */
    final AudioAttributes f25314a = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();

    /* compiled from: NativeAudioFocusManager.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public ey(Context context, a aVar) {
        this.f25315b = context;
        this.f25316c = aVar;
    }

    public static /* synthetic */ void a(ey eyVar, int i10) {
        eyVar.a(i10);
    }

    public final void a() {
        synchronized (this.f25318e) {
            AudioManager audioManager = (AudioManager) this.f25315b.getSystemService("audio");
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f25319f;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    }
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f25320g;
                    if (onAudioFocusChangeListener != null) {
                        audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                    }
                }
            }
        }
    }

    public final void b() {
        int i10;
        synchronized (this.f25318e) {
            AudioManager audioManager = (AudioManager) this.f25315b.getSystemService("audio");
            if (audioManager != null) {
                if (this.f25320g == null) {
                    this.f25320g = new AudioManager.OnAudioFocusChangeListener() { // from class: com.inmobi.media.e0
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i11) {
                            ey.a(ey.this, i11);
                        }
                    };
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f25319f == null) {
                        this.f25319f = new AudioFocusRequest.Builder(2).setAudioAttributes(this.f25314a).setOnAudioFocusChangeListener(this.f25320g).build();
                    }
                    i10 = audioManager.requestAudioFocus(this.f25319f);
                } else {
                    i10 = audioManager.requestAudioFocus(this.f25320g, 3, 2);
                }
            } else {
                i10 = 0;
            }
        }
        if (i10 == 1) {
            this.f25316c.a();
        } else {
            this.f25316c.b();
        }
    }

    public final void c() {
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f25319f = null;
        }
        this.f25320g = null;
    }

    public /* synthetic */ void a(int i10) {
        if (i10 == -2) {
            synchronized (this.f25318e) {
                this.f25317d = true;
            }
            this.f25316c.d();
        } else if (i10 == -1) {
            synchronized (this.f25318e) {
                this.f25317d = false;
            }
            this.f25316c.d();
        } else if (i10 != 1) {
        } else {
            synchronized (this.f25318e) {
                if (this.f25317d) {
                    this.f25316c.c();
                }
                this.f25317d = false;
            }
        }
    }
}
