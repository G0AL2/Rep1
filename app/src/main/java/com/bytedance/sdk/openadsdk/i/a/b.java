package com.bytedance.sdk.openadsdk.i.a;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.d;
import java.util.List;
import java.util.Map;

/* compiled from: GifRequestResult.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    int f13332a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f13333b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f13334c;

    /* renamed from: d  reason: collision with root package name */
    private List<Object> f13335d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f13336e;

    public b(byte[] bArr, int i10) {
        this.f13333b = null;
        this.f13334c = null;
        this.f13335d = null;
        this.f13336e = null;
        this.f13333b = bArr;
        this.f13332a = i10;
    }

    public Bitmap a() {
        return this.f13334c;
    }

    public byte[] b() {
        try {
            if (this.f13333b == null) {
                this.f13333b = d.a(this.f13334c);
            }
        } catch (OutOfMemoryError e10) {
            e10.printStackTrace();
        }
        return this.f13333b;
    }

    public boolean c() {
        if (this.f13334c != null) {
            return true;
        }
        byte[] bArr = this.f13333b;
        return bArr != null && bArr.length > 0;
    }

    public b(Bitmap bitmap, int i10) {
        this.f13333b = null;
        this.f13334c = null;
        this.f13335d = null;
        this.f13336e = null;
        this.f13334c = bitmap;
        this.f13332a = i10;
    }
}
