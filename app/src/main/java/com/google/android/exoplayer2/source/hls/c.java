package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import ea.j0;
import ea.v;
import j8.p1;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k8.o1;
import z8.h0;

/* compiled from: DefaultHlsExtractorFactory.java */
/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f21442d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f21443b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21444c;

    public c() {
        this(0, true);
    }

    private static void b(int i10, List<Integer> list) {
        if (mb.d.h(f21442d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    @SuppressLint({"SwitchIntDef"})
    private p8.i d(int i10, p1 p1Var, List<p1> list, j0 j0Var) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 7) {
                        if (i10 != 8) {
                            if (i10 != 11) {
                                if (i10 != 13) {
                                    return null;
                                }
                                return new o(p1Var.f32700c, j0Var);
                            }
                            return f(this.f21443b, this.f21444c, p1Var, list, j0Var);
                        }
                        return e(j0Var, p1Var, list);
                    }
                    return new v8.f(0, 0L);
                }
                return new z8.h();
            }
            return new z8.e();
        }
        return new z8.b();
    }

    private static w8.g e(j0 j0Var, p1 p1Var, List<p1> list) {
        int i10 = g(p1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new w8.g(i10, j0Var, null, list);
    }

    private static h0 f(int i10, boolean z10, p1 p1Var, List<p1> list, j0 j0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else if (z10) {
            list = Collections.singletonList(new p1.b().e0("application/cea-608").E());
        } else {
            list = Collections.emptyList();
        }
        String str = p1Var.f32706i;
        if (!TextUtils.isEmpty(str)) {
            if (!v.b(str, AudioTrackTranscoder.MIMETYPE_AUDIO_AAC)) {
                i11 |= 2;
            }
            if (!v.b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new h0(2, j0Var, new z8.j(i11, list));
    }

    private static boolean g(p1 p1Var) {
        Metadata metadata = p1Var.f32707j;
        if (metadata == null) {
            return false;
        }
        for (int i10 = 0; i10 < metadata.g(); i10++) {
            Metadata.Entry f10 = metadata.f(i10);
            if (f10 instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) f10).f21427c.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(p8.i iVar, p8.j jVar) throws IOException {
        try {
            boolean h10 = iVar.h(jVar);
            jVar.f();
            return h10;
        } catch (EOFException unused) {
            jVar.f();
            return false;
        } catch (Throwable th) {
            jVar.f();
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.f
    /* renamed from: c */
    public b a(Uri uri, p1 p1Var, List<p1> list, j0 j0Var, Map<String, List<String>> map, p8.j jVar, o1 o1Var) throws IOException {
        int a10 = ea.k.a(p1Var.f32709l);
        int b10 = ea.k.b(map);
        int c10 = ea.k.c(uri);
        int[] iArr = f21442d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int i10 : iArr) {
            b(i10, arrayList);
        }
        p8.i iVar = null;
        jVar.f();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            p8.i iVar2 = (p8.i) ea.a.e(d(intValue, p1Var, list, j0Var));
            if (h(iVar2, jVar)) {
                return new b(iVar2, p1Var, j0Var);
            }
            if (iVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                iVar = iVar2;
            }
        }
        return new b((p8.i) ea.a.e(iVar), p1Var, j0Var);
    }

    public c(int i10, boolean z10) {
        this.f21443b = i10;
        this.f21444c = z10;
    }
}
