package com.bytedance.sdk.component.d.c.a.b;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.d.p;

/* compiled from: MemoryCacheWrapper.java */
/* loaded from: classes.dex */
public class d implements p {

    /* renamed from: a  reason: collision with root package name */
    private final p f10162a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.component.d.c.a.b f10163b;

    public d(p pVar) {
        this(pVar, null);
    }

    public d(p pVar, com.bytedance.sdk.component.d.c.a.b bVar) {
        this.f10162a = pVar;
        this.f10163b = bVar;
    }

    @Override // com.bytedance.sdk.component.d.a
    public boolean b(String str) {
        return this.f10162a.b(str);
    }

    @Override // com.bytedance.sdk.component.d.a
    public boolean a(String str, Bitmap bitmap) {
        boolean a10 = this.f10162a.a(str, bitmap);
        com.bytedance.sdk.component.d.c.a.b bVar = this.f10163b;
        if (bVar != null) {
            bVar.a(str, Boolean.valueOf(a10));
        }
        return a10;
    }

    @Override // com.bytedance.sdk.component.d.a
    public Bitmap a(String str) {
        Bitmap a10 = this.f10162a.a(str);
        com.bytedance.sdk.component.d.c.a.b bVar = this.f10163b;
        if (bVar != null) {
            bVar.b(str, a10);
        }
        return a10;
    }
}
