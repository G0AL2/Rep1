package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.openadsdk.i.a.a;

/* compiled from: ImageBytesHelper.java */
/* loaded from: classes.dex */
public class g {

    /* compiled from: ImageBytesHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(com.bytedance.sdk.openadsdk.i.a.b bVar);

        void b();
    }

    public static void a(com.bytedance.sdk.openadsdk.i.a aVar, int i10, int i11, final a aVar2, String str) {
        com.bytedance.sdk.component.utils.l.e("splashLoadAd", " getImageBytes url " + aVar);
        com.bytedance.sdk.openadsdk.i.d.a().c().a(aVar, new a.b() { // from class: com.bytedance.sdk.openadsdk.utils.g.1
            @Override // com.bytedance.sdk.openadsdk.i.a.a.b
            public void a(String str2, com.bytedance.sdk.openadsdk.i.a.b bVar) {
                a aVar3;
                if (bVar.c() && (aVar3 = a.this) != null) {
                    aVar3.a(bVar);
                    return;
                }
                a aVar4 = a.this;
                if (aVar4 != null) {
                    aVar4.a();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.i.a.a.b
            public void a(int i12, String str2, Throwable th) {
                a aVar3 = a.this;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.i.a.a.b
            public void a() {
                a aVar3 = a.this;
                if (aVar3 != null) {
                    aVar3.b();
                }
            }
        }, i10, i11, str);
    }

    public static Drawable a(byte[] bArr, int i10) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
