package com.inmobi.media;

import java.io.Serializable;

/* compiled from: TimeoutConfigurations.java */
@ik
/* loaded from: classes3.dex */
public final class jh implements Serializable {
    public static final int DEFAULT_BITMAP_TIMEOUT = 5000;
    public static final int DEFAULT_RENDER_VIEW_TIMEOUT = 15000;
    public static final int DEFAULT_REQUEST_TIMEOUT = 6300;
    public static final int DEFAULT_TIMEOUT = 15000;
    private int bitmap = DEFAULT_BITMAP_TIMEOUT;
    private int step1a = 15000;
    private int step1b = 15000;
    private int step2u = 15000;
    private int step3r = 15000;
    private int step4s = 15000;
    private int request = DEFAULT_REQUEST_TIMEOUT;
    private int renderTimeout = 15000;

    public static jh a() {
        jh jhVar = new jh();
        jhVar.j();
        return jhVar;
    }

    public final int b() {
        return this.bitmap;
    }

    public final int c() {
        return this.step1a;
    }

    public final int d() {
        return this.step1b;
    }

    public final int e() {
        return this.step2u;
    }

    public final int f() {
        return this.step3r;
    }

    public final int g() {
        return this.step4s;
    }

    public final int h() {
        return this.request;
    }

    public final int i() {
        return this.renderTimeout;
    }

    public final void j() {
        int i10 = this.bitmap;
        if (i10 <= 0) {
            i10 = DEFAULT_BITMAP_TIMEOUT;
        }
        this.bitmap = i10;
        int i11 = this.step1a;
        if (i11 <= 0) {
            i11 = 15000;
        }
        this.step1a = i11;
        int i12 = this.step1b;
        if (i12 <= 0) {
            i12 = 15000;
        }
        this.step1b = i12;
        int i13 = this.step2u;
        if (i13 <= 0) {
            i13 = 15000;
        }
        this.step2u = i13;
        int i14 = this.step3r;
        if (i14 <= 0) {
            i14 = 15000;
        }
        this.step3r = i14;
        int i15 = this.step4s;
        if (i15 <= 0) {
            i15 = 15000;
        }
        this.step4s = i15;
        int i16 = this.request;
        if (i16 <= 0) {
            i16 = DEFAULT_REQUEST_TIMEOUT;
        }
        this.request = i16;
        int i17 = this.renderTimeout;
        this.renderTimeout = i17 > 0 ? i17 : 15000;
    }

    public final void b(int i10) {
        this.request = i10;
    }

    public final void a(int i10) {
        this.bitmap = i10;
    }
}
