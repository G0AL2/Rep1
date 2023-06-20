package com.bytedance.sdk.component.d.c.a.b;

import com.bytedance.sdk.component.d.q;

/* compiled from: LruCountRawCache.java */
/* loaded from: classes.dex */
public class c implements q {

    /* renamed from: a  reason: collision with root package name */
    private int f10157a;

    /* renamed from: b  reason: collision with root package name */
    private int f10158b;

    /* renamed from: c  reason: collision with root package name */
    private int f10159c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.d.c.a.c<String, byte[]> f10160d;

    public c(int i10, int i11) {
        this.f10159c = i10;
        this.f10157a = i11;
        this.f10160d = new com.bytedance.sdk.component.d.c.a.c<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.d.c.a.b.c.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.d.c.a.c
            /* renamed from: a */
            public int b(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.d.a
    public boolean b(String str) {
        return this.f10160d.a((com.bytedance.sdk.component.d.c.a.c<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.d.a
    public boolean a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f10160d.a(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.d.a
    public byte[] a(String str) {
        return this.f10160d.a((com.bytedance.sdk.component.d.c.a.c<String, byte[]>) str);
    }
}
