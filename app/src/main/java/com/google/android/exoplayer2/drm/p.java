package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k8.o1;

/* compiled from: ExoMediaDrm.java */
/* loaded from: classes2.dex */
public interface p {

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final p f21120a;

        public a(p pVar) {
            this.f21120a = pVar;
        }

        @Override // com.google.android.exoplayer2.drm.p.d
        public p a(UUID uuid) {
            this.f21120a.b();
            return this.f21120a;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f21121a;

        /* renamed from: b  reason: collision with root package name */
        private final String f21122b;

        public b(byte[] bArr, String str, int i10) {
            this.f21121a = bArr;
            this.f21122b = str;
        }

        public byte[] a() {
            return this.f21121a;
        }

        public String b() {
            return this.f21122b;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(p pVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public interface d {
        p a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f21123a;

        /* renamed from: b  reason: collision with root package name */
        private final String f21124b;

        public e(byte[] bArr, String str) {
            this.f21123a = bArr;
            this.f21124b = str;
        }

        public byte[] a() {
            return this.f21123a;
        }

        public String b() {
            return this.f21124b;
        }
    }

    void b();

    Map<String, String> c(byte[] bArr);

    e d();

    byte[] e() throws MediaDrmException;

    void f(byte[] bArr, byte[] bArr2);

    void g(c cVar);

    void h(byte[] bArr) throws DeniedByServerException;

    int i();

    m8.b j(byte[] bArr) throws MediaCryptoException;

    boolean k(byte[] bArr, String str);

    void l(byte[] bArr);

    void m(byte[] bArr, o1 o1Var);

    byte[] n(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    b o(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException;

    void release();
}
