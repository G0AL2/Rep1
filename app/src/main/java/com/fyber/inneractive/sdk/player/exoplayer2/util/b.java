package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final File f19544a;

    /* renamed from: b  reason: collision with root package name */
    public final File f19545b;

    /* loaded from: classes2.dex */
    public static final class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        public final FileOutputStream f19546a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f19547b = false;

        public a(File file) throws FileNotFoundException {
            this.f19546a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f19547b) {
                return;
            }
            this.f19547b = true;
            this.f19546a.flush();
            try {
                this.f19546a.getFD().sync();
            } catch (IOException e10) {
                Log.w("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f19546a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f19546a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f19546a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f19546a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f19546a.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f19544a = file;
        this.f19545b = new File(file.getPath() + ".bak");
    }

    public InputStream a() throws FileNotFoundException {
        if (this.f19545b.exists()) {
            this.f19544a.delete();
            this.f19545b.renameTo(this.f19544a);
        }
        return new FileInputStream(this.f19544a);
    }

    public OutputStream b() throws IOException {
        if (this.f19544a.exists()) {
            if (!this.f19545b.exists()) {
                if (!this.f19544a.renameTo(this.f19545b)) {
                    Log.w("AtomicFile", "Couldn't rename file " + this.f19544a + " to backup file " + this.f19545b);
                }
            } else {
                this.f19544a.delete();
            }
        }
        try {
            return new a(this.f19544a);
        } catch (FileNotFoundException unused) {
            if (this.f19544a.getParentFile().mkdirs()) {
                try {
                    return new a(this.f19544a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f19544a);
                }
            }
            throw new IOException("Couldn't create directory " + this.f19544a);
        }
    }
}
