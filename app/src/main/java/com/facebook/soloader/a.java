package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.j;
import com.facebook.soloader.s;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* compiled from: ApkSoSource.java */
/* loaded from: classes.dex */
public class a extends j {

    /* renamed from: j  reason: collision with root package name */
    private final int f16501j;

    /* compiled from: ApkSoSource.java */
    /* renamed from: com.facebook.soloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0221a extends j.c {

        /* renamed from: e  reason: collision with root package name */
        private File f16502e;

        /* renamed from: f  reason: collision with root package name */
        private final int f16503f;

        C0221a(j jVar) throws IOException {
            super(jVar);
            this.f16502e = new File(a.this.f16554d.getApplicationInfo().nativeLibraryDir);
            this.f16503f = a.this.f16501j;
        }

        @Override // com.facebook.soloader.j.c
        protected boolean l(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z10 = false;
            if (str.equals(a.this.f16555e)) {
                a.this.f16555e = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.f16503f & 1) == 0) {
                str2 = "allowing consideration of " + name + ": self-extraction preferred";
            } else {
                File file = new File(this.f16502e, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        str2 = "not allowing consideration of " + name + ": deferring to libdir";
                        Log.d("ApkSoSource", str2);
                        return z10;
                    }
                }
            }
            z10 = true;
            Log.d("ApkSoSource", str2);
            return z10;
        }
    }

    public a(Context context, File file, String str, int i10) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f16501j = i10;
    }

    @Override // com.facebook.soloader.s
    protected byte[] n() throws IOException {
        File canonicalFile = this.f16527h.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.g(this.f16554d));
            if ((this.f16501j & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f16554d.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.s
    protected s.g s(byte b10) throws IOException {
        return new C0221a(this);
    }
}
