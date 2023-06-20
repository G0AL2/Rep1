package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k8.o1;

/* compiled from: DummyExoMediaDrm.java */
/* loaded from: classes2.dex */
public final class n implements p {
    @Override // com.google.android.exoplayer2.drm.p
    public void b() {
    }

    @Override // com.google.android.exoplayer2.drm.p
    public Map<String, String> c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public p.e d() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void g(p.c cVar) {
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public int i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.p
    public m8.b j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public boolean k(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void l(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.p
    public /* synthetic */ void m(byte[] bArr, o1 o1Var) {
        n8.p.a(this, bArr, o1Var);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] n(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public p.b o(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void release() {
    }
}
