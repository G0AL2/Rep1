package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* compiled from: FileLocker.java */
/* loaded from: classes.dex */
public final class k implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private FileOutputStream f16537a;

    /* renamed from: b  reason: collision with root package name */
    private FileLock f16538b;

    private k(File file, boolean z10) throws IOException {
        a(file, z10);
    }

    private void a(File file, boolean z10) throws IOException {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f16537a = fileOutputStream;
        try {
            if (z10) {
                try {
                    fileLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLock = null;
                }
            } else {
                fileLock = fileOutputStream.getChannel().lock();
            }
            if (fileLock == null) {
            }
            this.f16538b = fileLock;
        } finally {
            this.f16537a.close();
        }
    }

    public static k b(File file) throws IOException {
        return new k(file, false);
    }

    public static k d(File file) throws IOException {
        k kVar = new k(file, true);
        if (kVar.f16538b == null) {
            kVar.close();
            return null;
        }
        return kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f16538b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f16537a.close();
        }
    }
}
