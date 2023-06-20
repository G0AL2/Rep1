package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import j8.p1;
import k8.o1;
import n8.v;

/* compiled from: DrmSessionManager.java */
/* loaded from: classes2.dex */
public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f21117a = new a();

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes2.dex */
    class a implements l {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.l
        public /* synthetic */ void a() {
            n8.l.b(this);
        }

        @Override // com.google.android.exoplayer2.drm.l
        public int b(p1 p1Var) {
            return p1Var.f32712o != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.l
        public void c(Looper looper, o1 o1Var) {
        }

        @Override // com.google.android.exoplayer2.drm.l
        public j d(k.a aVar, p1 p1Var) {
            if (p1Var.f32712o == null) {
                return null;
            }
            return new o(new j.a(new v(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.google.android.exoplayer2.drm.l
        public /* synthetic */ b e(k.a aVar, p1 p1Var) {
            return n8.l.a(this, aVar, p1Var);
        }

        @Override // com.google.android.exoplayer2.drm.l
        public /* synthetic */ void release() {
            n8.l.c(this);
        }
    }

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes2.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21118a = new b() { // from class: n8.m
            @Override // com.google.android.exoplayer2.drm.l.b
            public final void release() {
                n.b();
            }
        };

        void release();
    }

    void a();

    int b(p1 p1Var);

    void c(Looper looper, o1 o1Var);

    j d(k.a aVar, p1 p1Var);

    b e(k.a aVar, p1 p1Var);

    void release();
}
