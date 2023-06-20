package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.p;
import ea.a0;
import ea.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k8.o1;
import n8.v;

/* compiled from: FrameworkMediaDrm.java */
/* loaded from: classes2.dex */
public final class q implements p {

    /* renamed from: d */
    public static final p.d f21125d = new p.d() { // from class: n8.s
        @Override // com.google.android.exoplayer2.drm.p.d
        public final com.google.android.exoplayer2.drm.p a(UUID uuid) {
            return com.google.android.exoplayer2.drm.q.a(uuid);
        }
    };

    /* renamed from: a */
    private final UUID f21126a;

    /* renamed from: b */
    private final MediaDrm f21127b;

    /* renamed from: c */
    private int f21128c;

    /* compiled from: FrameworkMediaDrm.java */
    /* loaded from: classes2.dex */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, o1 o1Var) {
            LogSessionId a10 = o1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) ea.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
        }
    }

    private q(UUID uuid) throws UnsupportedSchemeException {
        ea.a.e(uuid);
        ea.a.b(!j8.h.f32426b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21126a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f21127b = mediaDrm;
        this.f21128c = 1;
        if (j8.h.f32428d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    public static /* synthetic */ p A(UUID uuid) {
        try {
            return C(uuid);
        } catch (v unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 53);
            sb2.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb2.append(valueOf);
            sb2.append(".");
            ea.r.c("FrameworkMediaDrm", sb2.toString());
            return new n();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(n0.f29712d);
    }

    public static q C(UUID uuid) throws v {
        try {
            return new q(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new v(1, e10);
        } catch (Exception e11) {
            throw new v(2, e11);
        }
    }

    public static /* synthetic */ p a(UUID uuid) {
        return A(uuid);
    }

    public static /* synthetic */ void p(q qVar, p.c cVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        qVar.z(cVar, mediaDrm, bArr, i10, i11, bArr2);
    }

    private static byte[] q(byte[] bArr) {
        a0 a0Var = new a0(bArr);
        int q10 = a0Var.q();
        short s10 = a0Var.s();
        short s11 = a0Var.s();
        if (s10 == 1 && s11 == 1) {
            short s12 = a0Var.s();
            Charset charset = ib.d.f31906d;
            String B = a0Var.B(s12, charset);
            if (B.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = B.indexOf("</DATA>");
            if (indexOf == -1) {
                ea.r.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String substring = B.substring(0, indexOf);
            String substring2 = B.substring(indexOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 26 + String.valueOf(substring2).length());
            sb2.append(substring);
            sb2.append("<LA_URL>https://x</LA_URL>");
            sb2.append(substring2);
            String sb3 = sb2.toString();
            int i10 = q10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort(s10);
            allocate.putShort(s11);
            allocate.putShort((short) (sb3.length() * 2));
            allocate.put(sb3.getBytes(charset));
            return allocate.array();
        }
        ea.r.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return j8.h.f32427c.equals(uuid) ? com.google.android.exoplayer2.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = j8.h.f32429e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = w8.l.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = q(r4)
            byte[] r4 = w8.l.a(r0, r4)
        L18:
            int r1 = ea.n0.f29709a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = j8.h.f32428d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = ea.n0.f29711c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = ea.n0.f29712d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = w8.l.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.q.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (n0.f29709a < 26 && j8.h.f32427c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return (n0.f29709a >= 27 || !j8.h.f32427c.equals(uuid)) ? uuid : j8.h.f32426b;
    }

    @SuppressLint({"WrongConstant"})
    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData y(UUID uuid, List<DrmInitData.SchemeData> list) {
        boolean z10;
        if (!j8.h.f32428d.equals(uuid)) {
            return list.get(0);
        }
        if (n0.f29709a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                DrmInitData.SchemeData schemeData2 = list.get(i11);
                byte[] bArr = (byte[]) ea.a.e(schemeData2.f21026e);
                if (!n0.c(schemeData2.f21025d, schemeData.f21025d) || !n0.c(schemeData2.f21024c, schemeData.f21024c) || !w8.l.c(bArr)) {
                    z10 = false;
                    break;
                }
                i10 += bArr.length;
            }
            z10 = true;
            if (z10) {
                byte[] bArr2 = new byte[i10];
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    byte[] bArr3 = (byte[]) ea.a.e(list.get(i13).f21026e);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length);
                    i12 += length;
                }
                return schemeData.e(bArr2);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            DrmInitData.SchemeData schemeData3 = list.get(i14);
            int g10 = w8.l.g((byte[]) ea.a.e(schemeData3.f21026e));
            int i15 = n0.f29709a;
            if (i15 < 23 && g10 == 0) {
                return schemeData3;
            }
            if (i15 >= 23 && g10 == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    public /* synthetic */ void z(p.c cVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        cVar.a(this, bArr, i10, i11, bArr2);
    }

    public void D(String str, String str2) {
        this.f21127b.setPropertyString(str, str2);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public synchronized void b() {
        ea.a.f(this.f21128c > 0);
        this.f21128c++;
    }

    @Override // com.google.android.exoplayer2.drm.p
    public Map<String, String> c(byte[] bArr) {
        return this.f21127b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public p.e d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f21127b.getProvisionRequest();
        return new p.e(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] e() throws MediaDrmException {
        return this.f21127b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void f(byte[] bArr, byte[] bArr2) {
        this.f21127b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void g(final p.c cVar) {
        this.f21127b.setOnEventListener(cVar == null ? null : new MediaDrm.OnEventListener() { // from class: n8.r
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                com.google.android.exoplayer2.drm.q.p(com.google.android.exoplayer2.drm.q.this, cVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void h(byte[] bArr) throws DeniedByServerException {
        this.f21127b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public int i() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.p
    public boolean k(byte[] bArr, String str) {
        if (n0.f29709a >= 31) {
            return a.a(this.f21127b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f21126a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void l(byte[] bArr) {
        this.f21127b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void m(byte[] bArr, o1 o1Var) {
        if (n0.f29709a >= 31) {
            a.b(this.f21127b, bArr, o1Var);
        }
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] n(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (j8.h.f32427c.equals(this.f21126a)) {
            bArr2 = com.google.android.exoplayer2.drm.a.b(bArr2);
        }
        return this.f21127b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.p
    @SuppressLint({"WrongConstant"})
    public p.b o(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        DrmInitData.SchemeData schemeData = null;
        if (list != null) {
            schemeData = y(this.f21126a, list);
            bArr2 = s(this.f21126a, (byte[]) ea.a.e(schemeData.f21026e));
            str = t(this.f21126a, schemeData.f21025d);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f21127b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f21126a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData != null && !TextUtils.isEmpty(schemeData.f21024c)) {
            defaultUrl = schemeData.f21024c;
        }
        return new p.b(r10, defaultUrl, n0.f29709a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public synchronized void release() {
        int i10 = this.f21128c - 1;
        this.f21128c = i10;
        if (i10 == 0) {
            this.f21127b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.p
    /* renamed from: v */
    public n8.q j(byte[] bArr) throws MediaCryptoException {
        return new n8.q(u(this.f21126a), bArr, n0.f29709a < 21 && j8.h.f32428d.equals(this.f21126a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f21127b.getPropertyString(str);
    }
}
