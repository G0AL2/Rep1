package com.inmobi.media;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* compiled from: NetworkResponse.java */
/* loaded from: classes3.dex */
public class gy {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25626d = "gy";

    /* renamed from: a  reason: collision with root package name */
    public gw f25627a;

    /* renamed from: b  reason: collision with root package name */
    public int f25628b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<String>> f25629c;

    /* renamed from: e  reason: collision with root package name */
    private String f25630e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f25631f;

    public final boolean a() {
        return this.f25627a != null;
    }

    public final String b() {
        if (this.f25630e == null) {
            this.f25630e = b(this.f25631f);
        }
        return this.f25630e;
    }

    public final byte[] c() {
        byte[] bArr = this.f25631f;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final long d() {
        try {
            String str = this.f25630e;
            if (str != null) {
                return str.length() + 0;
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final void a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            byte[] bArr2 = new byte[bArr.length];
            this.f25631f = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return;
        }
        this.f25631f = new byte[0];
    }

    private static String b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return "";
    }
}
