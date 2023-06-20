package com.bytedance.sdk.openadsdk.i.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import java.util.Map;

/* compiled from: GifLoader.java */
/* loaded from: classes.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifLoader.java */
    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0181a implements b {
        C0181a() {
        }

        @Override // com.bytedance.sdk.openadsdk.i.a.a.b
        public void a() {
        }

        @Override // com.bytedance.sdk.openadsdk.i.a.a.b
        public void a(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.openadsdk.i.a.a.b
        public void a(String str, com.bytedance.sdk.openadsdk.i.a.b bVar) {
        }
    }

    /* compiled from: GifLoader.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void a(int i10, String str, Throwable th);

        void a(String str, com.bytedance.sdk.openadsdk.i.a.b bVar);
    }

    public static C0181a b() {
        return new C0181a();
    }

    protected void a() {
    }

    public void a(com.bytedance.sdk.openadsdk.i.a aVar, b bVar, int i10, int i11, String str) {
        a(aVar, bVar, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str);
    }

    public void a(com.bytedance.sdk.openadsdk.i.a aVar, final b bVar, int i10, int i11, ImageView.ScaleType scaleType, String str) {
        com.bytedance.sdk.openadsdk.d.a.a(aVar.f13328a).a(aVar.f13329b).a(i10).b(i11).b(str).a(Bitmap.Config.RGB_565).a(scaleType).a(!TextUtils.isEmpty(str)).a(new n() { // from class: com.bytedance.sdk.openadsdk.i.a.a.1
            @Override // com.bytedance.sdk.component.d.n
            public void a(j jVar) {
                a.this.a(jVar, bVar);
            }

            @Override // com.bytedance.sdk.component.d.n
            public void a(int i12, String str2, Throwable th) {
                a.this.a(i12, str2, th, bVar);
            }
        });
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(j jVar, b bVar) {
        if (bVar != null) {
            Object b10 = jVar.b();
            int a10 = a(jVar);
            if (b10 instanceof byte[]) {
                bVar.a(jVar.a(), new com.bytedance.sdk.openadsdk.i.a.b((byte[]) b10, a10));
            } else if (b10 instanceof Bitmap) {
                bVar.a(jVar.a(), new com.bytedance.sdk.openadsdk.i.a.b((Bitmap) b10, a10));
            } else {
                bVar.a(0, "not bitmap or gif result!", null);
            }
        }
        if (bVar != null) {
            bVar.a();
        }
    }

    private int a(j jVar) {
        String str;
        Map<String, String> c10 = jVar.c();
        if (c10 == null || (str = c10.get("image_size")) == null || !(str instanceof Integer)) {
            return 0;
        }
        return ((Integer) str).intValue();
    }

    protected void a(int i10, String str, Throwable th, b bVar) {
        if (bVar != null) {
            bVar.a(i10, str, th);
        }
    }
}
