package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.t;

/* compiled from: BytesVisitor.java */
/* loaded from: classes.dex */
public class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f10268a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.component.d.f f10269b;

    /* compiled from: BytesVisitor.java */
    /* renamed from: com.bytedance.sdk.component.d.d.b$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10270a;

        static {
            int[] iArr = new int[t.values().length];
            f10270a = iArr;
            try {
                iArr[t.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10270a[t.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10270a[t.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(byte[] bArr, com.bytedance.sdk.component.d.f fVar) {
        this.f10268a = bArr;
        this.f10269b = fVar;
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "image_type";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        i mVar;
        t i10 = cVar.i();
        cVar.a(this.f10268a.length);
        int i11 = AnonymousClass1.f10270a[i10.ordinal()];
        if (i11 == 1) {
            byte[] bArr = this.f10268a;
            mVar = new m(bArr, this.f10269b, com.bytedance.sdk.component.d.c.c.a.b(bArr));
        } else if (i11 != 3) {
            if (com.bytedance.sdk.component.d.c.c.a.a(this.f10268a)) {
                mVar = new e(this.f10268a, this.f10269b);
            } else {
                byte[] bArr2 = this.f10268a;
                mVar = new m(bArr2, this.f10269b, com.bytedance.sdk.component.d.c.c.a.b(bArr2));
            }
        } else if (com.bytedance.sdk.component.d.c.c.a.a(this.f10268a)) {
            mVar = new e(this.f10268a, this.f10269b);
        } else if (this.f10269b == null) {
            mVar = new k();
        } else {
            mVar = new h(1001, "not image format", null);
        }
        cVar.a(mVar);
    }
}
