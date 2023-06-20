package yb;

import ac.a0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* loaded from: classes3.dex */
class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f39379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39380b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39381c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, byte[] bArr) {
        this.f39380b = str;
        this.f39381c = str2;
        this.f39379a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f39379a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f39379a;
        return bArr == null || bArr.length == 0;
    }

    @Override // yb.y
    public a0.d.b a() {
        byte[] c10 = c();
        if (c10 == null) {
            return null;
        }
        return a0.d.b.a().b(c10).c(this.f39380b).a();
    }

    @Override // yb.y
    public String b() {
        return this.f39381c;
    }

    @Override // yb.y
    public InputStream f() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f39379a);
    }
}
