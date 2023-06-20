package com.bytedance.sdk.component.d.d;

import android.graphics.Bitmap;

/* compiled from: DecoderVisitor.java */
/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f10271a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.component.d.f f10272b;

    public e(byte[] bArr, com.bytedance.sdk.component.d.f fVar) {
        this.f10271a = bArr;
        this.f10272b = fVar;
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "decode";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        com.bytedance.sdk.component.d.c.f p10 = cVar.p();
        try {
            Bitmap a10 = p10.a(cVar).a(this.f10271a);
            if (a10 != null) {
                cVar.a(new m(a10, this.f10272b, false));
                p10.a(cVar.q()).a(cVar.e(), a10);
            } else {
                a(1002, "decode failed bitmap null", null, cVar);
            }
        } catch (Throwable th) {
            a(1002, "decode failed:" + th.getMessage(), th, cVar);
        }
    }

    private void a(int i10, String str, Throwable th, com.bytedance.sdk.component.d.c.c cVar) {
        if (this.f10272b == null) {
            cVar.a(new k());
        } else {
            cVar.a(new h(i10, str, th));
        }
    }
}
