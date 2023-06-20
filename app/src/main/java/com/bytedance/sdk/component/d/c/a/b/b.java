package com.bytedance.sdk.component.d.c.a.b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.sdk.component.d.p;

/* compiled from: LruCountBitmapCache.java */
/* loaded from: classes.dex */
public class b implements p {

    /* renamed from: a  reason: collision with root package name */
    private int f10152a;

    /* renamed from: b  reason: collision with root package name */
    private int f10153b;

    /* renamed from: c  reason: collision with root package name */
    private int f10154c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.d.c.a.c<String, Bitmap> f10155d;

    public b(int i10, int i11) {
        this.f10154c = i10;
        this.f10152a = i11;
        this.f10155d = new com.bytedance.sdk.component.d.c.a.c<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.d.c.a.b.b.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.d.c.a.c
            /* renamed from: a */
            public int b(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return b.a(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.d.a
    public boolean b(String str) {
        return this.f10155d.a((com.bytedance.sdk.component.d.c.a.c<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.d.a
    public boolean a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f10155d.a(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.d.a
    public Bitmap a(String str) {
        return this.f10155d.a((com.bytedance.sdk.component.d.c.a.c<String, Bitmap>) str);
    }

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (i10 >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
